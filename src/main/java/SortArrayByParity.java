public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length -1;
        while (i < j){
            while (i < j && (A[i] % 2) == 0){
                i++;
            }
            while (i < j && (A[j] % 2) != 0){
                j--;
            }
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
        return A;
    }

    public static void main(String[] args) {
        sortArrayByParity(new int[]{3,1,2,4});
    }
}
