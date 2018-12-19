package Array;

public class Search {
    public int search(int[] nums, int target) {
        if (nums.length == 0)
            return -1;

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target)
                return middle;

            if (nums[left] < nums[right]) {
                if (nums[middle] < target)
                    left = middle + 1;
                else
                    right = middle - 1;
            } else {
                if (target >= nums[left]) {
                    if (nums[middle] > target)
                        right = middle - 1;
                    else {
                        if (nums[middle] >= nums[left])
                            left = middle + 1;
                        else
                            right = middle - 1;
                    }
                } else if (target <= nums[right]) {
                    if (nums[middle] < target)
                        left = middle + 1;
                    else {
                        if (nums[middle] >= nums[left])
                            left = middle + 1;
                        else
                            right = middle - 1;
                    }
                } else {
                    return -1;
                }
            }

        }

        return -1;
    }
}
