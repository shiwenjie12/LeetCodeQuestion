package Maths;

public class AddDigits {
    public int addDigits(int num) {
        if (num == 0){
            return 0;
        }
        if (num % 9 == 0)
            return 9;
        else
            return num % 9;
    }

    public static void main(String[] args) {
        int i = 0;
        Integer j = new Integer(0);
        boolean cc = i == j;
        boolean cc1 = j.equals(i);
        new  AddDigits().addDigits(38);
    }
}
