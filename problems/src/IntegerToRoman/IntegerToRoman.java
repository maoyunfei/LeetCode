package IntegerToRoman;

/**
 * Description
 *
 * @author maoyunfei
 * @date 2019-07-29
 */
public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(3));
        System.out.println(intToRoman(4));
        System.out.println(intToRoman(9));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        while (num != 0) {
            for (int i = 0; i < numbers.length; i++) {
                int count = num / numbers[i];
                for (int j = 0; j < count; j++) {
                    result.append(romans[i]);
                }
                if (count != 0) {
                    num = num % numbers[i];
                }
            }
        }
        return result.toString();
    }
}
