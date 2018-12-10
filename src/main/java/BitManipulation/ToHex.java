package BitManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToHex {
    public static String toHex(int num) {
        char[] nums = new char[]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        char[] chars = new char[8];
        int last = 7;
        for (int i = 7; i >= 0; i--) {
            int index = num & 0xf;
            if (index != 0)
                last = i;
            chars[i] = nums[index];
            num = num >>> 4;
        }

        char[] result = new char[8 - last];
        for (int i = 0; i < result.length; i++) {
            result[i] = chars[last + i];
        }
        return new String(result);
    }

    public static void main(String[] args) {
        int i1 = 10;
        Integer i2 = new Integer(10);
        Integer i3 = new Integer(10);
        System.out.println(i1 ==i2);
        System.out.println(i2.equals(i3));
        System.out.println(i3.equals(i1));

        int cc = 1 ^ 4;
        int cc1 = Integer.numberOfTrailingZeros(cc);
        System.out.println(toHex(26));
    }
}
