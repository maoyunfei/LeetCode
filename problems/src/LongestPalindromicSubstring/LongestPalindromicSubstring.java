package LongestPalindromicSubstring;

/**
 * Description
 *
 * @author maoyunfei
 * @date 2019-07-29
 */
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("eabcb"));
        System.out.println(longestPalindrome("bb"));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int left = 0;
        int right = 0;
        boolean dp[][] = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = true;
            for (int j = i - 1; j >= 0; j--) {
                dp[i][j] = chars[i] == chars[j] && (i - j == 1 || dp[i - 1][j + 1]);
                if (dp[i][j] && i - j > right - left) {
                    right = i;
                    left = j;
                }
            }
        }
        return s.substring(left, right + 1);
    }

}
