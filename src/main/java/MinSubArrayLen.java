public class MinSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        int result = nums.length + 1;
        int l = 0, r = -1;
        int sum  = 0;
        while (l < nums.length){
            if ((r + 1) < nums.length && sum < s){
                r++;
                sum = sum + nums[r];
            }else{
                sum = sum - nums[l];
                l++;
            }

            if (sum >= s){
                result = Math.min(result,r - l + 1);
            }
        }
        if (result == nums.length + 1){
            return 0;
        }
        return result;
    }

    public static void main(String[] args) {
        int cc = new MinSubArrayLen().minSubArrayLen(7, new int[]{2,3,1,2,4,3});
    }
}
