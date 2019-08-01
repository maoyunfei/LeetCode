package PalindromeNumber;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int x = -123;
        System.out.println(isPalindrome(x));
        x = 171;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);
        char[] chars = str.toCharArray();
        int i = 0, j = chars.length - 1;
        for (; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                return false;
            }
        }
        return true;
    }
}
