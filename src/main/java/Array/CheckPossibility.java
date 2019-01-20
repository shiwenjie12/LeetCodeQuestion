package Array;

public class CheckPossibility {
    public boolean checkPossibility(int[] nums) {
        int cc = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                if (cc == 0) {
                    if (i >= 2 && nums[i] < nums[i - 2])
                        nums[i] = nums[i - 1];
                    cc++;
                } else if (cc == 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new CheckPossibility().checkPossibility(new int[]{3, 4, 2, 3}));
    }
}
