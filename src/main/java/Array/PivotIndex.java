package Array;

import java.util.Arrays;

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int sumleft = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = sumleft * 2 + nums[i];
            if (temp == sum) {
                return i;
            } else {
                sumleft += nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new PivotIndex().pivotIndex(new int[]{-1, -1, -1, -1, -1, 0});
    }
}
