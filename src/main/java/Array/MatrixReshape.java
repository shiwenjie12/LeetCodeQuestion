package Array;

import java.util.ArrayList;
import java.util.List;

public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums == null)
            return null;
        int br = nums.length;
        int bc = nums[0].length;

        if (r * c > br * bc) {
            return nums;
        }
        int[] cc = new int[br * bc];
        int d = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                cc[d++] = nums[i][j];
            }
        }
        for (int i = 0; i < cc.length; i++) {
            System.out.println(cc[i]);
        }
        int[][] result = new int[r][];
        d = 0;
        for (int i = 0; i < r; i++) {
            result[i] = new int[c];
            for (int j = 0; j < c; j++) {
                result[i][j] = cc[d++];
            }
        }
        return result;
    }
}
