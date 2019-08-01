package MinimumNumberOfArrowsToBurstBalloons;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class MinimumNumberOfArrowsToBurstBalloons {

    public static void main(String[] args) {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        System.out.println(findMinArrowShots(points));
    }

    public static int findMinArrowShots(int[][] points) {
        if (points.length <= 1) {
            return points.length;
        }
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int res = 1;
        int cur = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] <= cur) {
                continue;
            }
            cur = points[i][1];
            res++;
        }
        return res;
    }

}
