package DynamicProgramming;

public class ClimbStairs {
    public int climbStairs(int n) {
        if (n <= 2){
            return n;
        }
        int int1 = 1;
        int int2 = 2;
        for (int i = 3; i <= n; i++) {
            int temp = int1 + int2;
            int1 = int2;
            int2 = temp;
        }
        return int2;
    }

    public static void main(String[] args) {
        new ClimbStairs().climbStairs(3);
    }
}
