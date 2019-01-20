package Hash;

import java.util.Arrays;

public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int[] cc = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            cc[nums[i]] = cc[nums[i]] + 1;
        }
        int[] res = new int[2];
        for (int i = 1; i < cc.length; i++) {
            if (cc[i] == 2) {
                res[0] = i;
            } else if (cc[i] == 0) {
                res[1] = i;
            }
        }
        return res;
    }
}
