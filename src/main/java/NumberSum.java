import java.util.Map;
import java.util.HashMap;

public class NumberSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++)
        {
            map.put(nums[i],i);
        }
        for(int i = 0; i < nums.length; i++){
            int temp = target - nums[i];
            int result = 0;
            if (map.containsKey(temp) && (result = map.get(temp)) != i){
                return new int[]{i,result};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void  main(String[] args){
        int ss = 123456;
        int cc = ss /10;
        int ee = ss % 10;

        int[] array = new int[]{3,2,4};
        //int[] ss = twoSum(array,6);
    }
}
