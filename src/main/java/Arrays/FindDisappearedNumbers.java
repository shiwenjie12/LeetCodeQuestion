package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>(nums.length);
        int[] temp = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]] = 1;
        }
        for (int i = 1; i < temp.length; i++) {
            if (temp[i] == 0)
                result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
    }
}
