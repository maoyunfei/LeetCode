package MaxConsecutiveOnes;

/**
 * Description
 *
 * @author maoyunfei
 * @date 2018/3/22
 */
public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp++;
            } else {
                if (temp > count) {
                    count = temp;
                }
                temp = 0;
            }
        }
        if (temp > count) {
            count = temp;
        }
        return count;
    }
}
