package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target) {
                    return target;
                } else{
                    int cha = Math.abs(sum - target);
                    if (cha < min){
                        min = cha;
                        res = sum;
                    }
                    if (sum < target) {
                        l++;
                    } else {
                        r--;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new ThreeSumClosest().threeSumClosest(new int[]{1,2,4,8,16,32,64,128}, 82));
    }
}
