package Arrays;

public class DominantIndex {
    public int dominantIndex(int[] nums) {
        int max = 0, idx = 0, less = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                less = max;
                max = nums[i];
                idx = i;
            } else if (nums[i] > less) {
                less = nums[i];
            }
        }
        return max > less * 2 ? idx : -1;
    }
}
