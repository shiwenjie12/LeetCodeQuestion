import java.util.ArrayList;
import java.util.List;

public class ReverseNum {
    public static int reverse(int x) {
        int result = 0;
        boolean flag = false;
        if (x < 0){
            x = -x;
            flag = true;
        }
        List<Integer> nums = new ArrayList<Integer>();
        while ((x / 10) != 0 || (x % 10) != 0){
            nums.add((x % 10));
            x = x /10;
        }

        for (int i = 0; i < nums.size(); i++){
            if (i == 0 && nums.get(i) == 0){
                continue;
            }
            int temp = nums.get(i);
            int cc = result;
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
            result = result * 10 + temp;

            if (result < cc) return 0;
        }
        if (flag)
            result = -result;
        return result;
    }

    public static void  main(String[] args){
        String ccc = "123456";
        ccc = ccc.substring(1,ccc.length() - 1);

        int ss = 1463847412;
        int cc = reverse(ss);
    }

}
