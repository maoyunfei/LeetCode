package ArrangingCoins;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class ArrangingCoins {

    public static void main(String[] args) {
        int n = 1804289383;
        System.out.println(arrangeCoins(n));
    }

    public static int arrangeCoins(int n) {
        int l = 0, h = n;
        while (l <= h) {
            int m = l + (h - l) / 2;
            long x = m * (m + 1L) / 2;  //long类型防止溢出
            if (x == n) {
                return m;
            } else if (x < n) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return h;
    }

}
