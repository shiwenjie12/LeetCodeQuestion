package Maths;

public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!isPrime[i]) {
                count++;
                for (int j = i + i; j < n; j += i) {
                    isPrime[j] = true;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        new CountPrimes().countPrimes(10);
    }
}
