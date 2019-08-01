package ReverseVowelsOfString;

/**
 * Description
 *
 * @author maoyunfei
 * @date 2018/3/12
 */
public class ReverseVowelsOfString {

    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "leetcode";
        System.out.println(reverseVowels(s1));
        System.out.println(reverseVowels(s2));
    }

    public static String reverseVowels(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        char[] chars = s.toCharArray();
        int index1 = 0;
        int index2 = chars.length - 1;
        boolean leftFlag = false;
        while (index1 < index2) {
            while (index1 < index2) {
                if (isVowel(chars[index1])) {
                    leftFlag = true;
                    break;
                } else {
                    index1++;
                }
            }
            boolean rightFlag = false;
            while (index1 < index2) {
                if (isVowel(chars[index2])) {
                    rightFlag = true;
                    break;
                } else {
                    index2--;
                }
            }
            if (leftFlag && rightFlag) {
                char tmp = chars[index1];
                chars[index1] = chars[index2];
                chars[index2] = tmp;
                index1++;
                index2--;
            } else {
                break;
            }
        }
        return new String(chars);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
