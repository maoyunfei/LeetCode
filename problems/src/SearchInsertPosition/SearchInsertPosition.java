package SearchInsertPosition;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1, 3};
        int target = 0;
        System.out.println(searchInsert(nums, target));
        System.out.println(searchInsert2(nums, target));

    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static int searchInsert2(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public static int binarySearch(int[] nums, int target, int left, int right) {
        if (left == right) {
            if (nums[left] >= target) {
                return left;
            } else {
                return left + 1;
            }
        }
        int middle = (left + right) / 2;
        if (nums[middle] == target) {
            return middle;
        } else if (nums[middle] < target) {
            if (middle + 1 > right) {
                return right + 1;
            }
            return binarySearch(nums, target, middle + 1, right);
        } else {
            if (middle - 1 < left) {
                return left;
            }
            return binarySearch(nums, target, left, middle - 1);
        }
    }

}
