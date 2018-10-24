package Hash;

import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Object, Integer> map = new HashMap<>();
        String[] strs = str.split(" ");
        char[] chars = pattern.toCharArray();
        if (chars.length != strs.length) return false;
        for (Integer i = 0; i < strs.length; i++) {
            String temp = strs[i];
            char ch = chars[i];
            if (map.put(temp,i) != map.put(ch,i)){
                return false;
            }
        }
        return true;
    }
}
