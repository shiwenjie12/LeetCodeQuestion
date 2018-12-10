package Hash;

import java.util.Arrays;
import java.util.Comparator;

public class FindRelativeRanks {
    class Entry {
        public int key;
        public int value;

        public Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public String[] findRelativeRanks(int[] nums) {
        Entry[] array = new Entry[nums.length];
        for (int i = 0; i < nums.length; i++) {
            array[i] = new Entry(nums[i], i);
        }
        Arrays.sort(array, new Comparator<Entry>() {
            public int compare(Entry o1, Entry o2) {
                return o2.key - o1.key;
            }

            public boolean equals(Object obj) {
                return false;
            }
        });
        String[] result = new String[nums.length];
        for (int i = 0; i < array.length; i++) {
            if (i == 0)
                result[array[i].value] = "Gold Medal";
            else if (i == 1)
                result[array[i].value] = "Silver Medal";
            else if (i == 2)
                result[array[i].value] = "Bronze Medal";
            else
                result[array[i].value] = Integer.toString(i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        new FindRelativeRanks().findRelativeRanks(new int[]{5,4,3,2,1});
    }
}
