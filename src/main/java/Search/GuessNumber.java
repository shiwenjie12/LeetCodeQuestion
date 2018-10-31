package Search;

public class GuessNumber {
    public int guessNumber(int n) {
        int left = 1, right = n, mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            int flag = guess(mid);
            if (flag == 0){
                return mid;
            }else if (flag < 0)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }

    int guess(int num) {
        return 0;
    }
}
