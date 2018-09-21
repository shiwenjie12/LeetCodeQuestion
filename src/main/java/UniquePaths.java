public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = m - 1; i >= 0; i--){
            for (int j = n - 1; j >= 0; j--){
                if (j == n - 1 && i == m - 1){
                    dp[i][j] = 1;
                    continue;
                }
                if (i + 1 == m){
                    dp[i][j] = dp[i][j + 1];
                }else if (j + 1 == n){
                    dp[i][j] = dp[i + 1][j];
                }else{
                    dp[i][j] = dp[i][j + 1] + dp[i + 1][j];
                }
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        uniquePaths(7,3);
    }
}
