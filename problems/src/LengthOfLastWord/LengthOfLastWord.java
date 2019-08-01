package LengthOfLastWord;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int maxhere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (maxhere < 0) {
                maxhere = nums[i];
            } else {
                maxhere = maxhere + nums[i];
            }
            if (maxhere > maxsum) {
                maxsum = maxhere;
            }
        }
        return maxsum;
    }

}
