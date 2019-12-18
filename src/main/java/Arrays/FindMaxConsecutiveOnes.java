package Arrays;

import java.util.function.Function;

public class FindMaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int start = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (start == -1)
                    start = i;
            } else {
                if (start >= 0) {
                    result = Math.max(result, i - start);
                    start = -1;
                }
            }
        }
        if (start != -1) {
            result = Math.max(result, nums.length - start);
        }
        return result;
    }

    // 扩展注册插件
    public <P> void extractAndRegister(Function<FindMaxConsecutiveOnes, Integer> lookup) {
        FindMaxConsecutiveOnes CC = new FindMaxConsecutiveOnes();
        System.out.println(lookup.apply(CC));
    }

    public Integer ccc() {
        return 1;
    }

    public static void main(String[] args) {
        new FindMaxConsecutiveOnes().extractAndRegister(FindMaxConsecutiveOnes::ccc);
        findMaxConsecutiveOnes(new int[]{1});
    }
}
