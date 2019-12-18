package Arrays;

import java.util.Objects;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n <= 0) {
            return true;
        }
        if (flowerbed.length < 2 * n - 1) {
            return false;
        }
        int cc = -2;
        for (int i = 0; i < flowerbed.length && n > 0; i++) {
            if (flowerbed[i] == 1) {
                int cha = i - cc;
                if (cha >= 4) {
                    n = n - 1 - (cha - 4) / 2;
                }
                cc = i;
            }
        }
        System.out.println(n);
        if (flowerbed[flowerbed.length - 1] == 0) {
            while (cc < flowerbed.length - 2 && n > 0) {
                cc += 2;
                n--;
            }
        }
        System.out.println(n);
        return n == 0;
    }

    public static void main(String[] args) {
        Object task = null;
        Objects.requireNonNull(task);
        String s = new String("abc");
        String s1 = s;
        System.out.println(s1);
        s = "ccc";
        System.out.println(s1);
        String s2 = new String("abc");
        System.out.println(s.intern() == s1.intern());
        System.out.println(s == s2.intern());
        System.out.println(s1 == s2);
        System.out.println(s1 == s2.intern());

        new CanPlaceFlowers().canPlaceFlowers(new int[]{1, 0}, 1);
    }
}
