package RemoveElement;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeElement(nums, 1));
    }

    public static int removeElement(int[] nums, int val) {
        int result = nums.length;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index] == val) {
                remove(nums, index);
                result--;
            } else {
                index++;
            }
        }
        return result;
    }

    public static void remove(int[] nums, int index) {
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
    }

}
