package NonDecreasingArray;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class NonDecreasingArray {

    public static void main(String[] args) {
        int[] nums = {4, 2, 3};
        int[] nums2 = {3, 4, 2, 3};
        int[] nums3 = {2, 3, 3, 2, 4};
        System.out.println(checkPossibility(nums));
        System.out.println(checkPossibility(nums2));
        System.out.println(checkPossibility(nums3));
    }

    public static boolean checkPossibility(int[] nums) {
        if (nums.length < 3) {
            return true;
        }
        int needChange = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (++needChange > 1) {
                    return false;
                }
                int left = i == 0 ? 0 : nums[i - 1];
                if (left > nums[i + 1]) {
                    nums[i + 1] = nums[i];
                } else {
                    nums[i] = left;
                }
            }
        }
        return true;
    }
}
