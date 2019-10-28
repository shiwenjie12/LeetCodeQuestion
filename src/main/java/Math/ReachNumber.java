package Math;

public class ReachNumber {
    public int reachNumber(int target) {
        int t = Math.abs(target);
        int s = 0;
        int dis = 0;
        while (dis < t) {
            s++;
            dis += s;
        }
        int dt = dis - t;
        if (dt % 2 == 0)
            return s;
        else {
            if (s % 2 == 0)
                return s + 1;
            else
                return s + 2;
        }
    }
}
