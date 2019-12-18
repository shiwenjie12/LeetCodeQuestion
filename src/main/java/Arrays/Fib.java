package Arrays;

public class Fib {
    public int fib(int N) {
        int result = N;
        if (0 == N || 1 == N) {
            return result;
        }
        int[] array = new int[31];
        array[1] = 1;
        for (int i = 2; i <= N; i++) {
            result = array[i - 1] + array[i - 2];
            array[i] = result;
        }
        return result;
    }

    public static void main(String[] args) {
        new Fib().fib(4);
    }
}
