package Math;

public class IsUgly {
    public boolean isUgly(int num) {
        if (num == 0) return false;
        if (num == 1) return true;
        boolean result = false;
        int[] nums = new int[]{2, 3, 5};
        while (true) {
            for (int i = 0; i < nums.length; i++) {
                int cu = num % nums[i];
                if (cu == 0) {
                    num = num / nums[i];
                    break;
                }
                if (i == 2) {
                    return false;
                }
            }
            if (num == 1) break;
        }
        return true;
    }
}
