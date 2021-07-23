package DynamicProgramming;

public class Rob {

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        } else if (len == 2) {
            return Math.max(nums[0],nums[1]);
        }
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0],nums[1]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[len - 1];
    }

    public static void main(String[] args) {
        new Rob().rob(new int[]{2,1,1,2});
    }
}
