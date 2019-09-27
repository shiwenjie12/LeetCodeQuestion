package String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddBinary {
    public String addBinary(String a, String b) {
        int abs = Math.abs(a.length() - b.length());
        String cc = "";
        for (int i = 0; i < abs; i++) {
            cc = cc + "0";
        }
        if (a.length() < b.length()) {
            a = cc + a;
        } else {
            b = cc + b;
        }
        List<Integer> list = new ArrayList<>();
        boolean flag = false;
        for (int i = a.length() - 1; i >= 0; i--) {
            char charA = a.charAt(i);
            char charB = b.charAt(i);
            if (!flag) {
                if (charA == '1' && charB == '1') {
                    list.add(0);
                    flag = true;
                } else if (charA == '0' && charB == '0') {
                    list.add(0);
                    flag = false;
                } else {
                    list.add(1);
                    flag = false;
                }
            } else {
                if (charA == '1' && charB == '1') {
                    list.add(1);
                    flag = true;
                } else if (charA == '0' && charB == '0') {
                    list.add(1);
                    flag = false;
                } else {
                    list.add(0);
                    flag = true;
                }
            }
        }
        if (flag) {
            list.add(1);
        }
        Collections.reverse(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer integer : list) {
            stringBuilder.append(integer);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        new AddBinary().addBinary("1010", "1011");
    }
}
