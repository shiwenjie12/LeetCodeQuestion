import java.io.IOException;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }
        for (;j < nums.length; j++){
            nums[j] = 0;
        }
    }

    public static void main(String[] args) throws IOException {
        int[] nums = new int[]{0,1,0,3,12};
        moveZeroes(nums);
        System.in.read();
    }
}
