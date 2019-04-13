package Array;

public class FindShortestSubArray {
    public int findShortestSubArray(int[] nums) {
        int[] count = new int[50000], firstMeet = new int[50000];
        int dim = 0, ans = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int k = nums[i];
            if (count[k] == 0) {
                firstMeet[k] = i;
            }
            count[k] = count[k] + 1;
            if (count[k] > dim) {
                dim = count[k];
                ans = i - firstMeet[k] + 1;
            } else if (count[k] == dim){
                ans = Math.min(ans, i - firstMeet[k] + 1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        new FindShortestSubArray().findShortestSubArray(new int[]{1, 2, 2, 3, 1});
    }
}
