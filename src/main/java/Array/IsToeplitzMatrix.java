package Array;

public class IsToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int length = matrix.length;
        if (length == 1) {
            return true;
        }
        int length1 = matrix[0].length;
        for (int i = 1; i < length; i++) {
            for (int j = 1; j < length1; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }
}
