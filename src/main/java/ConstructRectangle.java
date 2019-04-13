import java.util.HashMap;
import java.util.TreeSet;

public class ConstructRectangle {
    public static int[] constructRectangle(int area) {
        int[] result = new int[2];
        int cha = Integer.MAX_VALUE;
        double sqrt = Math.sqrt(area);
        for (int i = 1; i <= sqrt; i++) {
            if (area % i == 0) {
                int other = area / i;
                int abs = Math.abs(other - i);
                if (abs < cha) {
                    cha = abs;
                    result[0] = other;
                    result[1] = i;
                }
            }
        }
        return result;
    }

    public static int cccc() {
        try {
            int ttt = 8 / 1;
            return 0;
        } catch (Exception ex) {
            return 1;
        } finally {
            return 2;
        }
    }

    public static void main(String[] args) {
        int cc = -1 >>> Integer.numberOfLeadingZeros(16 - 1);
        TreeSet<Integer> ccc = new TreeSet<>();
        ccc.add(222);
        ccc.add(223);
        ccc.add(221);

        System.out.println(cccc());
        //constructRectangle(8);
    }
}
