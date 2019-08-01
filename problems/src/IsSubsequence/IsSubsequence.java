package IsSubsequence;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class IsSubsequence {

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
        s = "axc";
        t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        int i = 0, j = 0;
        while (i < chars1.length && j < chars2.length) {
            if (chars2[j] == chars1[i]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == chars1.length;
    }
}
