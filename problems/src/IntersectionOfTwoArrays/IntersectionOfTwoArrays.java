package IntersectionOfTwoArrays;

import java.util.Arrays;

/**
 * Description
 *
 * @author maoyunfei
 * @date 2018/3/12
 */
public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] num1 = {1, 2, 2, 1};
        int[] num2 = {2, 2};
        System.out.println(intersection(num1, num2));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        return Arrays.stream(nums1).distinct().filter(num -> Arrays.stream(nums2).distinct().anyMatch(a -> a == num)).toArray();
    }
}
