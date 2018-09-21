public class SortColors {
    public static void sortColors(int[] nums) {
        int[] count = new int[3];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < 3; i++) {
            end = start + count[i];
            for (int j = start; j < end; j++) {
                nums[j] = i;
            }
            start = end;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        sortColors(new int[]{2,0,2,1,1,0});
    }
}
