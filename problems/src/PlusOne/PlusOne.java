package PlusOne;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        System.out.println(plusOne(digits));
    }

    public static int[] plusOne(int[] digits) {
        int plus = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int num = (digits[i] + plus) % 10;
            plus = (digits[i] + 1) / 10;
            digits[i] = num;
            if (plus == 0) {
                break;
            }
        }
        if (plus != 0) {
            int[] result = new int[digits.length + 1];
            result[0] = plus;
            for (int i = 1; i < digits.length; i++) {
                result[i] = digits[i];
            }
            return result;
        }
        return digits;
    }

}
