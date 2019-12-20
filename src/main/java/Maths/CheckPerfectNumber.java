package Maths;

public class CheckPerfectNumber {
    public boolean checkPerfectNumber(int num) {
        if(num < 1)
            return false;
        int res = 0;
        double sqrt = Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0){
                res += i;
                res += num / i;
            }
        }
        return res + 1 == num;
    }

    public static void main(String[] args) {

    }
}
