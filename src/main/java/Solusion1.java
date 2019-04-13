public class Solusion1 {
    public static void main(String[] args) {
        System.out.print(ComputePrimeSum(100));
    }

    public static int ComputePrimeSum(int i){
        if (i <= 1){
            return 0;
        }
        int sum = 0;
        for (int m = 2; m <= 100; m++) {
            boolean flag = false;
            for (int n = 2; n < m; n++) {
                if (m % n == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                sum += m;
            }
        }
        return sum;
    }
}
