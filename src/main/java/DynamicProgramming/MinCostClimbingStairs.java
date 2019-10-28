package DynamicProgramming;

public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if (len < 2) {
            return 0;
        } else if (len == 2) {
            return Math.min(cost[0], cost[1]);
        }
        for (int i = 2; i < len; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[len - 1], cost[len - 2]);
    }
}
