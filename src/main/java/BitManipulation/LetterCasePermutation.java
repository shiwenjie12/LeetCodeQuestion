package BitManipulation;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        dfs(S, 0, new StringBuilder(), result);
        return result;
    }

    public void dfs(String s, int i, StringBuilder sb, List<String> res) {
        if (i == s.length()) {
            res.add(sb.toString());
            return;
        }

        char ch = s.charAt(i);
        if (Character.isUpperCase(ch) || Character.isLowerCase(ch)) {
            dfs(s, i + 1, sb.append(ch), res);
            sb.deleteCharAt(sb.length() - 1);
            ch = (Character.isUpperCase(ch)) ? Character.toLowerCase(ch) : Character.toUpperCase(ch);
            dfs(s, i + 1, sb.append(ch), res);
            sb.deleteCharAt(sb.length() - 1);
        } else {
            dfs(s, i + 1, sb.append(ch), res);
            sb.deleteCharAt(sb.length() - 1);
        }
    }

    public static void main(String[] args) {
        new LetterCasePermutation().letterCasePermutation("a1b2");
    }
}
