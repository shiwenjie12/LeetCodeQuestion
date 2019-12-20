package Maths;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isDivisionMath(i)) {
                list.add(i);
            }
        }
        return list;
    }

    public boolean isDivisionMath(int n) {
        int value = n;
        while (value > 0){
            if (value % 10 != 0 && n%(value%10) == 0){
                value /= 10;
            }else {
                return false;
            }
        }
        return true;
    }
}
