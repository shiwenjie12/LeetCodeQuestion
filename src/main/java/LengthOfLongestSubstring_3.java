import java.util.HashMap;

public class LengthOfLongestSubstring_3 {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int result = 0;
        for (int i = 0,j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (map.containsKey(ch)){
                i = Math.max(map.get(ch),i);
            }
            map.put(ch,j + 1);
            result = Math.max(result,j - i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
    }
}
