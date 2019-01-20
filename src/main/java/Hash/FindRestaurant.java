package Hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRestaurant {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])) {
                map1.put(list2[i], map.get(list2[i]) + i);
            }
        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            if (entry.getValue() < min) {
                result.clear();
                result.add(entry.getKey());
                min = entry.getValue();
            } else if (entry.getValue() == min){
                result.add(entry.getKey());
            }
        }
        return result.toArray(new String[0]);
    }
}
