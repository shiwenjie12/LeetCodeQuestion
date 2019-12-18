package Arrays;

import java.util.ArrayList;
import java.util.List;

public class FIndMedianSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int index1 = 0;
        int index2 = 0;
        int index = 0;
        int length = nums1.length + nums2.length;
        if (length == 1){
            return (nums1.length == 1) ? nums1[0] : nums2[0];
        }
        int start = 0;
        if (length % 2 == 0) {
            int mid = length / 2;
            start = mid - 1;
        } else {
            int mid = length / 2;
            start = mid;
        }
        List<Integer> result = new ArrayList<>(2);

        while (index <= start + 1) {
            if (index1 == nums1.length){
                if (index == start || index == start + 1){
                    result.add(nums2[index2]);
                }
                index2++;index++;
                continue;
            }
            if (index2 == nums2.length){
                if (index == start || index == start + 1){
                    result.add(nums1[index1]);
                }
                index1++;index++;
                continue;
            }

            if (nums1[index1] <= nums2[index2]) {
                if (index == start || index == start + 1){
                    result.add(nums1[index1]);
                }
                index1++;index++;
            } else if (nums1[index1] > nums2[index2]){
                if (index == start || index == start + 1){
                    result.add(nums2[index2]);
                }
                index2++;index++;
            }
        }

        double sum = 0;
        for (int i = 0; i < result.size(); i++) {
            sum = sum + result.get(i);
        }
        return sum / result.size();
    }


    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,3},new int[]{2}));
    }
}
