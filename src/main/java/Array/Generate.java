package Array;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        result.add(list1);
        if (numRows == 1) {
            return result;
        }
        for (int i = 1; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            List<Integer> temp = result.get(i - 1);
            for (int j = 0; j <= i; j++) {
                Integer number;
                if (j == 0) {
                    number = temp.get(0);
                } else if (j == i) {
                    number = temp.get(j - 1);
                } else {
                    number = temp.get(j - 1) + temp.get(j);
                }
                list.add(number);
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        new Generate().generate(5);
    }
}
