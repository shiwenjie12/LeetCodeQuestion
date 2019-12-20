package Maths;

public class MaxCount {
    public int maxCount(int m, int n, int[][] ops) {
        for (int i = 0; i < ops.length; i++) {
            int[] cc = ops[i];
            m = Math.min(m,cc[0]);
            n = Math.min(n,cc[1]);
        }
        return m * n;
    }
}
