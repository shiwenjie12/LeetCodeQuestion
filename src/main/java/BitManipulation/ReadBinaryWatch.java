package BitManipulation;

import java.util.BitSet;
import java.util.LinkedList;
import java.util.List;

public class ReadBinaryWatch {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new LinkedList<>();
        for (int h = 0; h < 12; h++)
            for (int m = 0; m < 60; m++)
                if (BitCount(h) + BitCount(m) == num)
                    res.add(h + (m < 10 ? ":0" : ":") + m);
        return res;
    }
    public int BitCount(int n){
        int res = 0;
        int i = n;
        while (i != 0) {
            if ((i & 1) == 1)
                res++;
            i = i >>> 1;
        }
        return res;
    }


    public static void main(String[] args) {
        int newCapacity = 252;
        newCapacity |= newCapacity >>>  1;
        newCapacity |= newCapacity >>>  2;
        newCapacity |= newCapacity >>>  4;
        newCapacity |= newCapacity >>>  8;
        newCapacity |= newCapacity >>> 16;
        newCapacity ++;
        BitSet cleanerFlags = new BitSet();
        cleanerFlags.set(2);
        cleanerFlags.set(6);
        cleanerFlags.set(9);
        cleanerFlags.set(15);
        cleanerFlags.toString();
        System.out.println(new ReadBinaryWatch().BitCount(0));

        System.out.println(Integer.bitCount(0));
    }
}
