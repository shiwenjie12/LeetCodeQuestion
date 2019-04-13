import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solusion2 {
    private static List<Integer> sSorted = new LinkedList<>();

    public static void addElement(int e) {
        if (sSorted.isEmpty())
        {
            sSorted.add(e);
            return;
        }
        int index = 0;
        int size = sSorted.size();
        while (size > index) {
            Integer value = sSorted.get(index);
            if (value < e) {
                index++;
            } else {
                sSorted.add(index,e);
                break;
            }
        }
        System.out.println(sSorted);
    }

    public static void main(String[] args) {
        addElement(3);
        addElement(2);
        addElement(1);
        addElement(2);
    }
}
