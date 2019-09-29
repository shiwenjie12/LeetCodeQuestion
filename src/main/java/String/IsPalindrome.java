package String;

import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        List<Character> characters = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));
            if (isZimu(ch)) {
                characters.add(ch);
            }
        }
        if (characters.size() == 0) {
            return true;
        }
        int l = 0;
        int r = characters.size() - 1;
        while (l < r) {
            Character lc = null, lr = null;
            if (l >= 0 && l < characters.size()) {
                lc = characters.get(l++);
            }
            if (r >= 0 && r < characters.size()) {
                lr = characters.get(r--);
            }
            if (!lc.equals(lr)) {
                return false;
            }
        }
        return true;
    }

    private boolean isZimu(char ch) {
        return (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9');
    }

    public static void main(String[] args) {
        System.out.println(new IsPalindrome().isPalindrome("A man, a plan, a canal: Panama"));
    }
}
