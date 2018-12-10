package Stack;

import java.util.HashMap;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            for (int j = i + 1; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]){
                    map.put(nums2[i],nums2[j]);
                    break;
                }
            }
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            Integer temp = map.get(nums1[i]);
            if (temp != null){
                result[i] = temp;
            }else {
                result[i] = -1;
            }
        }
        return result;
    }
}
