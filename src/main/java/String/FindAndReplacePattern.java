package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplacePattern {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        HashMap<Character, Character> maps1 = new HashMap<>();
        HashMap<Character, Character> maps2 = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];
            if (temp.length() == pattern.length()) {
                char[] chars = temp.toCharArray();
                maps1.clear();
                maps2.clear();
                boolean flag = true;
                for (int j = 0; j < chars.length; j++) {
                    Character cc1 = maps1.get(chars[j]);
                    Character cc2 = maps2.get(pattern.charAt(j));
                    if (cc1 == null && cc2 == null) {
                        maps1.put(chars[j], pattern.charAt(j));
                        maps2.put(pattern.charAt(j), chars[j]);
                    } else if (cc1 == null || cc2 == null) {
                        flag = false;
                        break;
                    } else if (!(cc1 == pattern.charAt(j) && cc2 == chars[j])) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    result.add(temp);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new FindAndReplacePattern().findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb");
        //new FindAndReplacePattern().findAndReplacePattern(new String[]{"mee", "abc"}, "abb");
    }
}
