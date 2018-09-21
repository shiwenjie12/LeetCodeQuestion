import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {
    public Object cc = new Object();
    public Object ww = new Object();
    public List<Integer> topKFrequent() throws InterruptedException {
//        Map<Integer,Integer> map = new HashMap();
//        List<Integer>[] temp = new List[nums.length + 1];
//        for (int n: nums) {
//            map.getOrDefault(n , map.getOrDefault(n,0) + 1);
//        }
//
//        for (Integer key : map.keySet()){
//            int count = map.get(key);
//            if (temp[count] != null){
//                temp[count] = new ArrayList<>();
//            }
//            temp[count].add(key);
//        }
//
//        for (int i = temp.length; i >= 0 && k > 0 ; i++) {
//
//        }
        synchronized (ww){
            cc.wait();
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) throws InterruptedException {
        new  TopKFrequent().topKFrequent();
    }
}
