package BitManipulation;


public class SingleNumber {
    /**
     * 交换律：a ^ b ^ c <=> a ^ c ^ b
     *
     * 任何数于0异或为任何数 0 ^ n => n
     *
     * 相同的数异或为0: n ^ n => 0
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        new SingleNumber().singleNumber(new int[]{1, 2, 3, 1, 2});
    }
}
