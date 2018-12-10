public class ConstructRectangle {
    public static int[] constructRectangle(int area) {
        int[] result = new int[2];
        int cha = Integer.MAX_VALUE;
        double sqrt = Math.sqrt(area);
        for (int i = 1; i <= sqrt; i++) {
            if (area % i == 0){
                int other = area / i;
                int abs = Math.abs(other - i);
                if (abs < cha){
                    cha = abs;
                    result[0] = other;
                    result[1] = i;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        constructRectangle(8);
    }
}
