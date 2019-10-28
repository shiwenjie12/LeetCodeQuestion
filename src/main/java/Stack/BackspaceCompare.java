package Stack;

import java.util.Stack;

public class BackspaceCompare {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch != '#') {
                stackS.push(ch);
            } else {
                if (!stackS.isEmpty()) {
                    stackS.pop();
                }
            }
        }
        for (int i = 0; i < T.length(); i++) {
            char ch = T.charAt(i);
            if (ch != '#') {
                stackT.push(ch);
            } else {
                if (!stackT.isEmpty()) {
                    stackT.pop();
                }
            }
        }
        if (stackS.size() == stackT.size()) {
            char ss, tt;
            while (!stackS.isEmpty() && !stackT.isEmpty()) {
                ss = stackS.pop();
                tt = stackT.pop();
                if (ss != tt) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
