public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0,j = numbers.length - 1;
        for (;i < j;){
            int sum = numbers[i] + numbers[j];
            if (sum == target){
                return new int[]{++i,++j};
            }else if (sum < target){
                i++;
            }else{
                j--;
            }
        }
        return new  int[]{};
    }

    public static void main(String[] args) {
        int[] cc = new TwoSum().twoSum(new int[]{2, 7, 11, 15},9);
    }
}
