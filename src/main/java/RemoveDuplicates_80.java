public class RemoveDuplicates_80 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        boolean repeat = false;
        int num = nums[0];
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (num != nums[i]){
                num = nums[i];
                repeat = false;
                nums[k] = nums[i];
                k++;
            }
            else if (repeat == false){
                repeat = true;
                nums[k] = nums[i];
                k++;
            }else{
                continue;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] cc = new int[]{1,1,1,1,2,2,3};
        int r = removeDuplicates(cc);
    }
}
