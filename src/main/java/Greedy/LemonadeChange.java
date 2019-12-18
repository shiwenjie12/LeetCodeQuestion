package Greedy;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int num5 = 0;
        int num10 = 0;
        int num20 = 0;
        for (int bill : bills) {
            switch (bill) {
                case 5:
                    num5++;
                    break;
                case 10:
                    if (num5 == 0)
                        return false;
                    num5--;
                    num10++;
                    break;
                case 20:
                    if (num5 >= 1 && num10 >= 1) {
                        num5--;
                        num10--;
                        num20++;
                        break;
                    } else if (num10 == 0 && num5 >= 3) {
                        num5 -= 3;
                        num20++;
                        break;
                    } else {
                        return false;
                    }
            }
        }
        return true;
    }
}
