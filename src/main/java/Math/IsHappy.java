package Math;

import java.util.HashSet;
import java.util.Set;

public class IsHappy {
    public boolean isHappy(int n) {
        Set<Integer> numbers = new HashSet<>();
        while ((n = squareSum(n)) != 1) {
            if (numbers.contains(n)) {
                return false;
            } else {
                numbers.add(n);
            }
        }
        return true;
    }

    private int squareSum(int m) {
        int squaresum = 0;
        while (m != 0) {
            squaresum += (m % 10) * (m % 10);
            m /= 10;
        }
        return squaresum;
    }
}
