package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConvertToTitle {
    public String convertToTitle(int n) {
        List<Character> list = new ArrayList<>();
        while (n != 0) {
            n--;
            int temp = n % 26;
            char tempChar = (char) ('A' + temp);
            list.add(tempChar);
            n = n / 26;
        }
        Collections.reverse(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (Character character : list) {
            stringBuilder.append(character);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        new ConvertToTitle().convertToTitle(702);
    }
}
