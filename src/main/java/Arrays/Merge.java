package Arrays;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m];
        for (int i = 0; i < m; i++) {
            nums3[i] = nums1[i];
        }
        int i = 0;
        int j = 0;
        int q = 0;
        int all = m + n;
        while (q < all) {
            Integer num1 = null;
            Integer num2 = null;
            if (i < m) {
                num1 = nums3[i];
            }
            if (j < n) {
                num2 = nums2[j];
            }
            if (num1 != null && num2 != null) {
                if (num1 < num2) {
                    nums1[q] = num1;
                    i++;
                } else {
                    nums1[q] = num2;
                    j++;
                }
            } else if (num1 != null) {
                nums1[q] = num1;
                i++;
            } else {
                nums1[q] = num2;
                j++;
            }
            q++;
        }
    }
}
