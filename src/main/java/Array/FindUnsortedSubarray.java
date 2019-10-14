package Array;

import java.util.Arrays;

public class FindUnsortedSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int[] sortnums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortnums);
        int first = -1;
        int last = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int c = nums[i];
            int sortc = sortnums[i];
            if (c == sortc) {
                first = i;
            } else {
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            int c = nums[i];
            int sortc = sortnums[i];
            if (c == sortc) {
                last = i;
            } else {
                break;
            }
        }
        int result = last - first - 1;
        return result > 0 ? result : 0;
    }

    public static void main(String[] args) {
        new FindUnsortedSubarray().findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15});
    }
}
