package Arrays;

import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int length = nums.length;
        if (nums.length <= 1)
            return;
        if (nums.length == 2) {
            swap(0, 1, nums);
            return;
        }
        int flag = -1;
        for (int i = 0; i < length - 1; i++) {
            if (nums[i] < nums[i + 1])
                flag = i;
        }
        if (flag == -1) {
            for (int i = 0; i < nums.length / 2; i++)
                swap(i, nums.length - 1 - i, nums);
            return;
        }
        int cc = 0;
        for (int i = length - 1; i > flag; i--) {
            if (nums[i] > nums[flag]) {
                cc = i;
                break;
            }
        }
        swap(flag, cc, nums);
        Arrays.sort(nums, flag + 1, nums.length);
        return;
    }

    public void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        new NextPermutation().nextPermutation(new int[]{5,4,7,5,3,2});
    }
}
