package ToeplitzMatrix;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2018/2/27
 */
public class ToeplitzMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        System.out.println(isToeplitzMatrix(matrix));
        int[][] matrix2 = {{1, 2}, {2, 2}};
        System.out.println(isToeplitzMatrix(matrix2));
    }

    public static boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            int a = i;
            int b = 0;
            while (++a < m && ++b < n) {
                if (matrix[a][b] != matrix[i][0]) {
                    return false;
                }
            }

        }
        for (int j = 1; j < n; j++) {
            int a = 0;
            int b = j;
            while (++a < m && ++b < n) {
                if (matrix[a][b] != matrix[0][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
