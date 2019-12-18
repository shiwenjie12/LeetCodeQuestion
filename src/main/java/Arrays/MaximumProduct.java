package Arrays;

import java.util.Arrays;

public class MaximumProduct {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] < 0 && nums[nums.length - 1] > 0) {
            return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 3] * nums[nums.length - 2] * nums[nums.length - 1]);
        } else {
            return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        }
    }
}
