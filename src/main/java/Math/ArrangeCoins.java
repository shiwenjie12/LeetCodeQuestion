package Math;

public class ArrangeCoins {
    public int arrangeCoins(int n) {
        int count = 1;
        while (n >= count) {
            n -= count++;
        }
        return count - 1;
    }
}
