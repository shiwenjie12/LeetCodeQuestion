package String;

import java.util.ArrayList;
import java.util.List;

public class LicenseKeyFormatting {
    public static String licenseKeyFormatting(String S, int K) {
        int temp = K;
        char[] chars = S.toUpperCase().toCharArray();
        List<Character> characters = new ArrayList<>(chars.length);
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != '-'){
                characters.add(chars[i]);
                temp--;
                if (temp == 0){
                    characters.add('-');
                    temp = K;
                }
            }
        }
        if (characters.size() != 0){
            int c = 1;
            if (characters.get(characters.size() - 1) == '-'){
                c = 2;
            }
            StringBuilder sb = new StringBuilder(characters.size() - c);
            for (int i = characters.size() - c; i >= 0; i--) {
                char ch = characters.get(i);
                sb.append(ch);
            }
            return sb.toString();
        }else{
            return "";
        }


    }

    public static void main(String[] args) {
        licenseKeyFormatting("2-5g-3-J",2);
    }
}
