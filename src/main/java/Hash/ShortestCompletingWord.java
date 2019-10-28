package Hash;

import java.util.HashMap;

public class ShortestCompletingWord {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = licensePlate.toCharArray();
        for (char aChar : chars) {
            if (Character.isUpperCase(aChar) || Character.isLowerCase(aChar)) {
                char temp = Character.toLowerCase(aChar);
                map.compute(temp, (key, value) -> {
                    if (value == null) {
                        return 1;
                    } else {
                        return value + 1;
                    }
                });
            }
        }
        String res = null;
        for (String word : words) {
            HashMap<Character, Integer> tempMap = new HashMap<>();
            char[] chars1 = word.toCharArray();
            for (char c : chars1) {
                char temp = Character.toLowerCase(c);
                tempMap.compute(temp, (key, value) -> {
                    if (value == null) {
                        return 1;
                    } else {
                        return value + 1;
                    }
                });
            }
            boolean flag = false;
            for (Character character : map.keySet()) {
                Integer lint = map.get(character);
                Integer wint = tempMap.get(character);
                if (wint == null || wint < lint) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                if(res == null || word.length() < res.length()){
                    res = word;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new ShortestCompletingWord().shortestCompletingWord("1s3 PSt",
                new String[]{"step", "stepss", "stripe", "stepple"});
    }
}
