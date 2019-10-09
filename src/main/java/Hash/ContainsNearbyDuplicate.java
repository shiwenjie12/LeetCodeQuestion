package Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainsNearbyDuplicate {
    public boolean containsNearbyDuplicate(int[] nums,int k) {
        Map<Integer, Integer> tempMap = new HashMap<>();
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if (tempMap.get(value) != null) {
                int lastIndex = tempMap.get(value);
                if (i - lastIndex <= k) {
                    result = true;
                    break;
                }
            }
            tempMap.put(value, i);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
