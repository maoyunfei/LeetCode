package ReshapeTheMatrix;

/**
 * Description
 *
 * @author maoyunfei
 * @date 2018/3/22
 */
public class ReshapeTheMatrix {

    public static void main(String[] args) {
        int[][] nums = {{1, 2}, {3, 4}};
        System.out.println(matrixReshape(nums, 1, 4));
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length == 0 || nums.length * nums[0].length != r * c) {
            return nums;
        }
        int[][] nums2 = new int[r][c];
        int row1 = 0;
        int col1 = 0;
        for (int row2 = 0; row2 < r; row2++) {
            for (int col2 = 0; col2 < c; col2++) {
                if (col1 == nums[0].length) {
                    row1++;
                    col1 = 0;
                }
                nums2[row2][col2] = nums[row1][col1];
                col1++;
            }
        }
        return nums2;
    }
}
