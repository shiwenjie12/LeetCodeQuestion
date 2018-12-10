public class MaxArea {
    public int maxArea(int[] height) {
        int max = 0,i = 0, j = height.length - 1;
        while (i < j){
            max = Math.max(max,Math.min(height[i],height[j]) * (j - i));
            if (height[i] < height[j])
                i++;
            else
                j--;
        }
        return max;
    }

    public static void main(String[] args) {
        int cc = new  MaxArea().maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }
}
