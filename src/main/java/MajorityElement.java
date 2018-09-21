import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int result = nums[0],count = 0;
        for (int num: nums){
            if (count == 0){
                result = num;
                count = 1;
            }else {
                if (result == num){
                    count++;
                }else{
                    count--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        majorityElement(new int[]{6,5,5});
    }
}
