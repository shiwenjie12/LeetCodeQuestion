package Array;

import java.util.Arrays;

public class ArrayPairSum {
    public static int arrayPairSum(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0;i < len;i = i + 2){
            result = result + nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        arrayPairSum(new int[]{1,4,3,2});
    }
}
