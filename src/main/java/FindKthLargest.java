public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i: nums){
            if (i < min) min = i;
            if (i > max) max = i;
        }
        int[] buffer = new int[max - min + 1];
        for (int i : nums){
            buffer[i - min] += 1;
        }
        int count = 0;
        int i = buffer.length - 1;
        while (true){
            count += buffer[i];
            if (count >= k)
                break;
            i--;
        }
        return min + i;
    }

    public static void main(String[] args) {
        new FindKthLargest().findKthLargest(new  int[]{3,2,1,5,6,4},4);
    }
}
