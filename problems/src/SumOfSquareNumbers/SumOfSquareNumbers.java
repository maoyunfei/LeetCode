package SumOfSquareNumbers;

/**
 * Description
 *
 * @author maoyunfei
 * @date 2018/3/12
 */
public class SumOfSquareNumbers {

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(5));
        System.out.println(judgeSquareSum(3));
    }

    public static boolean judgeSquareSum(int c) {
        int i = 0;
        int j = (int) Math.sqrt((double) c);
        while (i <= j) {
            int sum = i * i + j * j;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
}
