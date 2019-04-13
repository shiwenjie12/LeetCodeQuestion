package String;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        char[] chars = paragraph.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] >= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z'))
                chars[i] = Character.toLowerCase(chars[i]);
            else
                chars[i] = ' ';
        }
        String[] strs = new String(chars).split(" ");
        Map.Entry<String, Integer> max = null;
        Map<String, Integer> map = new HashMap<>();
        for (String str : strs) {
            if (!str.equals("")){
                map.put(str, map.getOrDefault(str, 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry :
                map.entrySet()) {
            boolean flag = false;
            for (int i = 0; i < banned.length; i++) {
                if (entry.getKey().equals(banned[i])) {
                    flag = true;
                    break;
                }
            }
            if (flag) continue;
            if (max == null)
                max = entry;
            else {
                if (entry.getValue() > max.getValue())
                    max = entry;
            }
        }
        return max.getKey();
    }

    public static void main(String[] args) {
        new MostCommonWord().mostCommonWord("Bob. hIt, baLl", new String[]{"bob", "hit"});
    }
}
