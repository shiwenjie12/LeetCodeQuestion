package BitManipulation;

public class CountPrimeSetBits {
    public int countPrimeSetBits(int L, int R) {
        //0-20的质数列表，prime[i]为1，则i为质数
        int[] primes = {0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0, 1};
        int res = 0;
        for (int i = L; i <= R; i++) {
            int t = Integer.bitCount(i);
            res += primes[t];
        }
        return res;
    }

    public static void main(String[] args) {
        new CountPrimeSetBits().countPrimeSetBits(2, 3);
    }
}
