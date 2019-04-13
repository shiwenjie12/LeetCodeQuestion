package Math;

import java.sql.SQLOutput;

public class BinaryGap {
    public int binaryGap(int N) {
        String str = Integer.toBinaryString(N);
        char[] chars = str.toCharArray();
        int max = 0;
        int right = -1;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                if (right == -1) {
                    right = i;
                } else {
                    max = Math.max(max, i - right);
                    right = i;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        new BinaryGap().binaryGap(6);
    }
}
