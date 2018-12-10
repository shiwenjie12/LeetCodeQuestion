package Array;

public class FindMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int start = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (start == -1)
                    start = i;
            } else {
                if (start >= 0){
                    result = Math.max(result, i - start);
                    start = -1;
                }
            }
        }
        if (start != -1){
            result = Math.max(result, nums.length - start);
        }
        return result;
    }

    public static void main(String[] args) {
        findMaxConsecutiveOnes(new int[]{1});
    }
}
