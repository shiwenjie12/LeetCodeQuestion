public class NumArray {
    private int[] count;
    public NumArray(int[] nums) {
        this.count = new int[nums.length];
        int tempcount = 0;
        for (int i = 0; i < nums.length; i++) {
            tempcount = tempcount + nums[i];
            count[i] = tempcount;
        }
    }

    public int sumRange(int i, int j) {
        if(i==0) return count[j];
        return count[j]-count[i-1];
    }

    public static void main(String[] args) {
        new NumArray(new int[]{-2,0,3,-5,2,-1}).sumRange(2,5);
    }
}
