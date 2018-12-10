package Math;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MinMoves {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int re = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min)
                min = nums[i];
            re += nums[i];
        }
        return re - min*nums.length;
    }
}
