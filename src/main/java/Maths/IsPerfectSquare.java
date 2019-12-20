package Maths;

public class IsPerfectSquare {
    public boolean isPerfectSquare(int num) {
        long r = num;
        while (r*r > num)
            r = (r + num/r) / 2;
        return r*r == num;
    }
}





