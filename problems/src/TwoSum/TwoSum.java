package TwoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * Description
 *
 * @author maoyunfei
 * @date 2018-11-22
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 26;
        System.out.println(twoSum(numbers, target));
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
