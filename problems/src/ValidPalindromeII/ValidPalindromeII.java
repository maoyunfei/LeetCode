package ValidPalindromeII;

/**
 * Description
 *
 * @author maoyunfei
 * @date 2018/3/12
 */
public class ValidPalindromeII {

    public static void main(String[] args) {
        System.out.println(validPalindrome("aba"));
        System.out.println(validPalindrome("abca"));
        System.out.println(validPalindrome("ebcbbececabbacecbbcbe"));
        System.out.println("---------------");
        System.out.println(validPalindrome2("aba"));
        System.out.println(validPalindrome2("abca"));
        System.out.println(validPalindrome2("ebcbbececabbacecbbcbe"));
    }

    public static boolean validPalindrome(String s) {
        if (s.length() < 3) {
            return true;
        }
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (chars[i] == chars[j]) {
                i++;
                j--;
            } else {
                int index1 = i;
                int index2 = j - 1;
                boolean flag1 = true;
                while (index1 < index2) {
                    if (chars[index1] == chars[index2]) {
                        index1++;
                        index2--;
                    } else {
                        flag1 = false;
                        break;
                    }
                }
                int index3 = i + 1;
                int index4 = j;
                boolean flag2 = true;
                while (index3 < index4) {
                    if (chars[index3] == chars[index4]) {
                        index3++;
                        index4--;
                    } else {
                        flag2 = false;
                        break;
                    }
                }
                return flag1 || flag2;
            }
        }
        return true;
    }


    public static boolean validPalindrome2(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
