package ClimbingStairs;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(26));
    }

    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        } else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }
}
