package Math;

import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        int sum1 = (1 + nums.length) * nums.length / 2;
        return sum1 - sum;
    }


}
