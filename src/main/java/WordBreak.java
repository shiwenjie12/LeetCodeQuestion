import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] result = new boolean[s.length() + 1];
        result[0] = true;

        for (int i = 1; i <= s.length(); i++){
            for (int j = 0; j < i; j++){
                if (result[j] && wordDict.contains(s.substring(j,i))){
                    result[i] = true;
                    break;
                }
            }
        }

        return result[s.length()];
    }

    public static void main(String[] args) {
        wordBreak("applepenapple", Arrays.asList("apple", "pen"));
    }
}
