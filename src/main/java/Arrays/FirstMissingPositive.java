package Arrays;

public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] != i + 1) {
                int tmp = nums[i] - 1;
                nums[i] = -1;
                while (tmp > -1 && tmp < length && nums[tmp] != tmp + 1) {
                    int value = nums[tmp];
                    nums[tmp] = tmp + 1;
                    if (value > -1 && tmp < length) {
                        tmp = value - 1;
                    } else {
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < length; i++) {
            if (nums[i] == -1) {
                return i + 1;
            }
        }
        return length + 1;
    }

    public static void main(String[] args) {
        new FirstMissingPositive().firstMissingPositive(new int[]{0, 2, 2, 1, 1});
    }
}
