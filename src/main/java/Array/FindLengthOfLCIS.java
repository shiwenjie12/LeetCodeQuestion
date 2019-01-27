package Array;

public class FindLengthOfLCIS {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        int res = 1;
        int max = res;
        int pref = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > pref) {
                max = Math.max(++res,max);
            } else {
                res = 1;
            }
            pref = nums[i];
        }
        return max;
    }
}
