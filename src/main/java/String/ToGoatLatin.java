package String;

import java.util.ArrayList;
import java.util.List;

public class ToGoatLatin {
    public String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        String[] strs = S.split(" ");
        List<Character> characters = new ArrayList<>();
        characters.add('a');
        characters.add('e');
        characters.add('i');
        characters.add('o');
        characters.add('u');
        characters.add('A');
        characters.add('E');
        characters.add('I');
        characters.add('O');
        characters.add('U');
        for (int i = 0; i < strs.length; i++) {
            if (characters.contains(strs[i].charAt(0))) {
                sb.append(strs[i]).append("ma");
            } else {
                char[] chars = strs[i].toCharArray();
                for (int j = 1; j < chars.length; j++) {
                    sb.append(chars[j]);
                }
                sb.append(chars[0]);
                sb.append("ma");
            }
            for (int j = 0; j <= i; j++) {
                sb.append('a');
            }
            sb.append(" ");
        }
        String str = sb.toString().substring(0, sb.length() - 1);
        return str;
    }

    public static void main(String[] args) {
        new ToGoatLatin().toGoatLatin("I speak Goat Latin");
    }
}
