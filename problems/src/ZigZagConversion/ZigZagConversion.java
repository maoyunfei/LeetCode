package ZigZagConversion;

/**
 * Description
 *
 * @author maoyunfei
 * @date 2019-07-29
 */
public class ZigZagConversion {
    public static void main(String[] args) {
        System.out.println(convert("LEETCODEISHIRING", 3));
        System.out.println(convert("LEETCODEISHIRING", 4));
    }

    public static String convert(String s, int numRows) {
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            stringBuilders[i] = new StringBuilder();
        }
        int index = 0;
        while (index < s.length()) {
            for (int i = 0; i < numRows && index < s.length(); i++) {
                stringBuilders[i].append(s.charAt(index));
                index++;
            }
            for (int i = numRows - 2; i > 0 && index < s.length(); i--) {
                stringBuilders[i].append(s.charAt(index));
                index++;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            result.append(stringBuilders[i]);
        }
        return result.toString();
    }
}
