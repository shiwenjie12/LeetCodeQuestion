package Array;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                int temp = mid;
                while (temp >= 0 && nums[temp] == target) {
                    temp--;
                }
                result[0] = temp + 1;
                temp = mid;
                while (temp < nums.length && nums[temp] == target) {
                    temp++;
                }
                result[1] = temp - 1;
                return result;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new SearchRange().searchRange(new int[]{5,7,7,8,8,10},8);
    }
}
