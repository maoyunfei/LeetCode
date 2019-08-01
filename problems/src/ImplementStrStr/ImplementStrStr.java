package ImplementStrStr;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class ImplementStrStr {

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 0) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            boolean flag = true;
            if (i + needle.length() > haystack.length()) {
                return -1;
            }
            for (int j = 0; j < needle.length(); j++) {
                if ((i + j) >= haystack.length() || needle.charAt(j) != haystack.charAt(i + j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }

}
