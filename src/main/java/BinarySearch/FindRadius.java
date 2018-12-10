package BinarySearch;

import java.util.Arrays;

public class FindRadius {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int i = 0;
        int result = 0;
        for(int house : houses){
            while (i < heaters.length - 1 && heaters[i] + heaters[i + 1] >= house * 2)
                i++;
            result = Math.max(result,Math.abs(heaters[i] - house));
        }
        return result;
    }
}
