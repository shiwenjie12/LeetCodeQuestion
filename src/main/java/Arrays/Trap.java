package Arrays;

public class Trap {
    public int trap(int[] height) {
        int sum = 0;
        int lastindex = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] >= height[lastindex]) {
                sum += trap(height, lastindex, i);
                lastindex = i;
            }
        }
        lastindex = height.length - 1;
        for (int i = height.length - 2; i >= 0; i--) {
            if (height[i] > height[lastindex]) {
                sum += trap(height, i, lastindex);
                lastindex = i;
            }
        }
        return sum;
    }

    private int trap(int[] height, int start, int end) {
        int min = Math.min(height[start], height[end]);

        int length = end - start - 1;
        int sum = min * length;
        for (int i = start + 1; i <= end - 1; i++) {
            sum -= height[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        new Trap().trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});
    }
}
