package Search;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int left = 1, right = n, mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (isBadVersion(mid))
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }

    boolean isBadVersion(int version) {
        return true;
    }
}
