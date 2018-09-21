import java.util.HashMap;
import java.util.Map;

public class LenLongestFibSubseq {
    public static int lenLongestFibSubseq(int[] A) {
        int res = 0;
        int[][] dp = new int[A.length][A.length];
        Map<Integer, Integer> index = new HashMap<>();
        for (int i = 0; i < A.length; i++){
            index.put(A[i],i);
            for (int j = 0;j < i; j++){
                int k = index.getOrDefault(A[i] - A[j], -1);
                dp[j][i] = (A[i] -A[j] < A[j] && k >= 0 ) ? dp[k][j] + 1 : 2;
                res = Math.max(res,dp[j][i]);
            }
        }
        return res > 2 ? res : 0;


    }

    public static void main(String[] args) {
        lenLongestFibSubseq(new int[]{1,2,3,4,5,6,7,8});
    }
}
