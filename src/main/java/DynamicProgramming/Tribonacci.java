package DynamicProgramming;

public class Tribonacci {
    public int tribonacci(int n) {
        int dp[] = new int[n + 3];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i < n + 3; i++) {
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        new Tribonacci().tribonacci(25);
    }
}
