package DynamicProgramming;

public class DeleteAndEarn {
    public int deleteAndEarn(int[] nums) {
        if (nums.length <= 1) {
            return nums.length == 0 ? 0 : nums[0];
        }

        int maxValue = 0;
        for (int i = 0; i < nums.length; i++) {
            maxValue = Math.max(maxValue, nums[i]);
        }

        int[] total = new int[maxValue + 1];
        int[] dp = new int[maxValue + 1];
        for (int i = 0; i < nums.length; i++) {
            total[nums[i]] += nums[i];
        }

        dp[1] = total[1];
        dp[2] = Math.max(dp[1], total[2]);
        for (int i = 3; i < total.length; i++) {
            dp[i] = Math.max(dp[i - 1],dp[i - 2] + total[i]);
        }
        return Math.max(dp[maxValue],dp[maxValue - 1]);


//        if (nums.length <= 1) {
//            return nums.length == 0 ? 0 : nums[0];
//        }
//
//        int maxValue = 0;
//        for (int num : nums) {
//            maxValue = Math.max(maxValue, num);
//        }
//
//        int[] total = new int[maxValue + 1];
//        int[] dp = new int[maxValue + 1];
//        for (int i = 0; i < nums.length; i++) {
//            total[nums[i]] += nums[i];
//        }
//
//        dp[1] = total[1];
//        dp[2] = Math.max(dp[1], total[2]);
//        for (int i = 3; i < dp.length; i++) {
//            dp[i] = Math.max(dp[i-1],dp[i-2]+total[i]);
//        }
//
//        return Math.max(dp[maxValue],dp[maxValue-1]);
    }
}
