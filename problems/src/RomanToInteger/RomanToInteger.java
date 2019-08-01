package RomanToInteger;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class RomanToInteger {
    public static void main(String[] args) {
        String roman = "MCMXCIV";
        System.out.println(romanToInt(roman));
        roman = "LVIII";
        System.out.println(romanToInt(roman));
    }

    public static int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        for (int i = chars.length - 1; i >= 0; ) {
            int value = 0;
            switch (chars[i]) {
                case 'I':
                    value = 1;
                    i--;
                    break;
                case 'V':
                    if (i == 0 || chars[i - 1] != 'I') {
                        value = 5;
                        i--;
                    } else {
                        value = 4;
                        i = i - 2;
                    }
                    break;
                case 'X':
                    if (i == 0 || chars[i - 1] != 'I') {
                        value = 10;
                        i--;
                    } else {
                        value = 9;
                        i = i - 2;
                    }
                    break;
                case 'L':
                    if (i == 0 || chars[i - 1] != 'X') {
                        value = 50;
                        i--;
                    } else {
                        value = 40;
                        i = i - 2;
                    }
                    break;
                case 'C':
                    if (i == 0 || chars[i - 1] != 'X') {
                        value = 100;
                        i--;
                    } else {
                        value = 90;
                        i = i - 2;
                    }
                    break;
                case 'D':
                    if (i == 0 || chars[i - 1] != 'C') {
                        value = 500;
                        i--;
                    } else {
                        value = 400;
                        i = i - 2;
                    }
                    break;
                case 'M':
                    if (i == 0 || chars[i - 1] != 'C') {
                        value = 1000;
                        i--;
                    } else {
                        value = 900;
                        i = i - 2;
                    }
                    break;
                default:
                    break;
            }
            sum = sum + value;
        }
        return sum;
    }
}
