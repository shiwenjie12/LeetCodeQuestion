package DynamicProgramming;

public class Rob {

    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        } else if (len == 2) {
            return Math.max(nums[0],nums[1]);
        }
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < len; i++) {
            y = z;
            z = Math.max(y, x + nums[i]);
            x = y;
        }
        return z;
    }

    public static void main(String[] args) {
        new Rob().rob(new int[]{2,1,1,2});
    }
}
