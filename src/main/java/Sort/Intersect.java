package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int index1 = 0,index2 = 0;
        while (nums1.length > index1 && nums2.length > index2){
            if (nums1[index1] > nums2[index2]){
                index2++;
            }else if (nums1[index1] < nums2[index2]){
                index1++;
            }else{
                result.add(nums1[index1]);
                index1++;
                index2++;
            }
        }
        int[] cc = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            cc[i] = result.get(i);
        }
        return cc;
    }

    public static void main(String[] args) {
        int a = 10 >> 1;
        int b = a++;
        int c = ++a;
        int d = b * a++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
