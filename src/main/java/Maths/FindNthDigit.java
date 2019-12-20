package Maths;

public class FindNthDigit {
    public int findNthDigit(int n) {
        if (n < 10) {
            return n;
        }
        int len = 0;
        long nextSize = (long) Math.pow(10, len) * (len + 1) * 9;

        //确定n所处的位置
        while (n > nextSize) {
            n -= nextSize;
            len++;
            nextSize = (long) Math.pow(10, len) * (len + 1) * 9;
        }
        String resStr = String.valueOf((long) Math.pow(10, len) + (n - 1) / (len + 1));
        return resStr.charAt(n - (n - 1) / (len + 1) * (len + 1) - 1) - '0';
    }
}
