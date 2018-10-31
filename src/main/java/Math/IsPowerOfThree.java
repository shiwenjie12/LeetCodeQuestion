package Math;

public class IsPowerOfThree {
    public boolean isPowerOfThree(int n) {
        double tem = Math.log10(n) / Math.log10(3);
        return (tem - (int) tem) == 0;
    }

    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        return (num & (num - 1)) == 0 && (num & 0x55555555) != 0;
    }

    private static final int INTEGER_SIZE_MINUS_ONE = Integer.SIZE - 1; // 32 - 1 = 31

    private static int log2(int val) {
        // compute the (0-based, with lsb = 0) position of highest set bit i.e, log2
        return INTEGER_SIZE_MINUS_ONE - Integer.numberOfLeadingZeros(val);
    }

    private static int bitmapIdx(long handle) {
        return (int) (handle >>> Integer.SIZE);
    }

    public static void main(String[] args) {
        //System.out.println(bitmapIdx(8));
        //100000000
        //   *111111
        int ccr = 2 << 6;
        ccr = ccr | 32;
        long bits = 6;
        bits >>>= 1;
        int ee = 512 >>> 4;
        System.out.println(16 >>> 6);
        long rr = 0x4000000000000000L;
        int pageSize = 8 * 1024;
        int cc5 = pageSize >>> 10;
        int maxOrder = 11;
        int maxSubpageAllocs = 1 << 11;
        int ccc = maxSubpageAllocs << 1;
        byte[] memoryMap = new byte[maxSubpageAllocs << 1];
        byte[] depthMap = new byte[memoryMap.length];
        int memoryMapIndex = 1;
        for (int d = 0; d <= maxOrder; ++d) { // move down the tree one level at a time
            int depth = 1 << d;
            for (int p = 0; p < depth; ++p) {
                // in each level traverse left to right and set value to the depth of subtree
                memoryMap[memoryMapIndex] = (byte) d;
                depthMap[memoryMapIndex] = (byte) d;
                memoryMapIndex++;
            }
        }
        int id = 4;
        id <<= 1;
        id = 9;
        id ^= 1;
        int shift = id ^ 1 << depthMap[id];
        int cc3 = log2(16 * 1024 * 1024);
        int d = maxOrder - (log2(16 * 1024) - 13);
        int cc = Integer.numberOfLeadingZeros(3);
        int cc1 = ~4095;
    }
}
