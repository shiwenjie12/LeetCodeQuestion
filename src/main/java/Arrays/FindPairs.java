package Arrays;

import java.util.Arrays;

public class FindPairs {
    public static int findPairs(int[] nums, int k) {
        int j = 1;
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length ; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (i >= j)
                j = i + 1;
            if (j == nums.length)
                return res;
            int cha = Math.abs(nums[j] - nums[i]);
            if (cha == k) {
                res++;
                j++;
            } else if (cha < k) {
                while (j < nums.length && (nums[j] - nums[i] < k)) {
                    j++;
                }
                if (j == nums.length)
                    return res;
                if (nums[j] - nums[i] == k)
                    res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        findPairs(new int[]{1,1,1,2,2},
                0);
    }
}
