package String;

public class RotatedDigits {
    public int rotatedDigits(int N) {
        int result = 0;
        for (int i = 1; i <= N; i++) {
            if (isOk(i)) result++;
        }
        return result;
    }

    public boolean isOk(int x) {
        boolean flag = false;
        while (x > 0) {
            int t = x % 10;
            if (t == 3 || t == 4 || t == 7) {
                return false;
            } else if (t == 2 || t == 5 || t == 6 || t == 9) {
                flag = true;
            }
            x = x / 10;
        }
        return flag;
    }
}
