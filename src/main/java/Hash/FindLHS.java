package Hash;

import java.util.Arrays;
import java.util.HashMap;

public class FindLHS {
    public int findLHS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                max = Math.max(max, map.get(key) + map.get(key + 1));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        new FindLHS().findLHS(new int[]{3, 2, 1});
    }
}
