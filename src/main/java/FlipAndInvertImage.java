import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;

public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int length = A[i].length;
            for (int j = 0; j < length / 2; j++){
                int temp = A[i][j];
                A[i][j] = A[i][length - 1 - j];
                A[i][length - 1 - j] = temp;
            }
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = Math.abs(A[i][j] - 1);
            }
        }
        return A;
    }
}
