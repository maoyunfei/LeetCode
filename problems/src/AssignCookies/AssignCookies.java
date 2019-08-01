package AssignCookies;

import java.util.Arrays;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class AssignCookies {

    public static void main(String[] args) {
        int[] g = {1, 2};
        int[] s = {1, 2, 3};
        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0;
        int result = 0;
        while (i < g.length && j < s.length) {
            if (g[i] <= s[j]) {
                result++;
                i++;
                j++;
            } else {
                j++;
            }
        }
        return result;
    }

}
