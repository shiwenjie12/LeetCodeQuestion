package Greedy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RobotSim {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] direction = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] obstacle : obstacles) {
            if (!map.containsKey(obstacle[0])) {
                Set<Integer> set = new HashSet<>(obstacle[1]);
                map.put(obstacle[0], set);
            } else {
                map.get(obstacle[0]).add(obstacle[1]);
            }
        }
        int x = 0, y = 0, dir = 0, max = 0;
        for (int command : commands) {
            if (command == -2) {
                dir = (dir + 3) % 4;
            } else if (command == -1) {
                dir = (dir + 1) % 4;
            } else {
                int count = 0;
                while (count < command) {
                    if (map.containsKey(x + direction[dir][0]) && map.get(x + direction[dir][0]).contains(y + direction[dir][1]))
                        break;
                    else {
                        x += direction[dir][0];
                        y += direction[dir][1];
                    }
                    count++;
                }
                max = Math.max(max, x * x + y * y);
            }
        }
        return max;
    }
}
