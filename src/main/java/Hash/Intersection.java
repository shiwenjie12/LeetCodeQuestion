package Hash;

import java.util.*;

public class Intersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>(16);
        Set<Integer> hashSet1 = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++) {
            hashSet1.add(nums1[i]);
        }
        Set<Integer> hashSet2 = new HashSet<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            hashSet2.add(nums2[i]);
        }
        for (int item1 : hashSet1){
            if (hashSet2.contains(item1)){
                list.add(item1);
            }
        }
        int[] d = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            d[i] = list.get(i);
        }
        return d;
    }
}
