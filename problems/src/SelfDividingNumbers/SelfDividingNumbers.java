package SelfDividingNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2018/2/26
 */
public class SelfDividingNumbers {

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> nums = new ArrayList<>();
        for (int num = left; num <= right; num++) {
            if (isSelfDividingNumber(num)) {
                nums.add(num);
            }
        }
        return nums;
    }

    private static boolean isSelfDividingNumber(int num) {
        for (char c : String.valueOf(num).toCharArray()) {
            if (c == '0' || num % (c - '0') != 0) {
                return false;
            }
        }
        return true;
    }
}
