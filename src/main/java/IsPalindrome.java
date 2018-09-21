import java.util.ArrayList;
import java.util.List;

public class IsPalindrome {
    public static boolean isPalindrome(int x) {
        if (x <= 0 && x >= 9)
            return true;
        if (x < 0)
            return false;

        List<Integer> nums = new ArrayList<Integer>();
        while ((x / 10) != 0 || (x % 10) != 0){
            nums.add((x % 10));
            x = x /10;
        }

        int size = nums.size();
        for (int i = 0; i < size/2; i++){
            if (nums.get(i) != nums.get(size - 1 - i))
                return false;
        }
        return true;
    }

    public static void  main(String[] args){
        int ss = 123456;
        isPalindrome(ss);
    }
}
