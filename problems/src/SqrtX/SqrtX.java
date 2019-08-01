package SqrtX;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class SqrtX {

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int left = 0;
        int right = x;
        while (left < right) {
            int middle = (left + right) / 2;
            if (x / middle >= middle) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return right - 1;
    }
}
