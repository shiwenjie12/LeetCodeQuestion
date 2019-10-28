package Hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestWord {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        String res = "";
        Set<String> set = new HashSet<>();
        for (String word : words) {
            if (word.length() == 1 || set.contains(word.substring(0, word.length() - 1))) {
                res = word.length() > res.length() ? word : res;
                set.add(word);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new LongestWord().longestWord(new String[]{"a", "banana", "app", "appl", "ap", "apply", "apple"});
    }
}
