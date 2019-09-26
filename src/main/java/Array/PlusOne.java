package Array;


public class PlusOne {
    public int[] plusOne(int[] digits) {
        boolean need = false;
        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int number = digits[i];
            if (need) {
                number++;
                need = false;
            }
            if (number > 9) {
                digits[i] = 0;
                need = true;
            } else {
                digits[i] = number;
            }
        }
        if (need) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                result[i + 1] = digits[i];
            }
            digits = result;
        }
        return digits;
    }

    public static void main(String[] args) {
        new PlusOne().plusOne(new int[]{9, 0, 9});
    }
}
