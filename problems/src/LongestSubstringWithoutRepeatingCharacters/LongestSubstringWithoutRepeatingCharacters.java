package LongestSubstringWithoutRepeatingCharacters;

/**
 * Description
 *
 * @author maoyunfei
 * @date 2019-07-29
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("au"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        char[] chars = s.toCharArray();

        boolean[] existed = new boolean[256];
        for (int i = 0; i < existed.length; i++) {
            existed[i] = false;
        }

        int max = 1;
        existed[chars[0]] = true;
        int left = 0;
        int right = 1;
        while (left < s.length() && right < s.length()) {
            if (existed[chars[right]] == false) {
                existed[chars[right]] = true;
                right++;
            } else {
                if (right - left > max) {
                    max = right - left;
                }
                for (int i = left; i < right; i++) {
                    if (chars[i] == chars[right]) {
                        left = i + 1;
                        break;
                    }
                }
                right++;
            }
        }
        if (right - left > max) {
            max = right - left;
        }
        return max;
    }
}
