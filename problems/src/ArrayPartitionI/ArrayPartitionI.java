package ArrayPartitionI;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class ArrayPartitionI {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        System.out.println(new ArrayPartitionI().arrayPairSum(nums));
    }

    public int arrayPairSum(int[] nums) {
//        nums = IntStream.of(nums).sorted().toArray();
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }
}
