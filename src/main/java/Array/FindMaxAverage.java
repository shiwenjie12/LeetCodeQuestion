package Array;

public class FindMaxAverage {
    public double findMaxAverage(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;
        int slideSum = 0;
        for (int i = 0; i < k; i++) {
            slideSum += nums[i];
        }
        int maxSum = slideSum;
        for (int i = k; i < nums.length; i++) {
            slideSum = slideSum - nums[i - k] + nums[i];
            maxSum = Math.max(slideSum, maxSum);
        }
        return maxSum / (double) k;
    }
}
