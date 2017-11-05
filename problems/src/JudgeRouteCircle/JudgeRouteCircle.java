package JudgeRouteCircle;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class JudgeRouteCircle {
    public static void main(String[] args) {
        System.out.println(new JudgeRouteCircle().judgeCircle("UD"));
        System.out.println(new JudgeRouteCircle().judgeCircle("LL"));
    }

    public boolean judgeCircle(String moves) {
        char[] sides = moves.toCharArray();
        int leftCount = 0;
        int rightCount = 0;
        int upCount = 0;
        int downCount = 0;
        for (char c : sides) {
            switch (c) {
                case 'L':
                    leftCount++;
                    break;
                case 'R':
                    rightCount++;
                    break;
                case 'U':
                    upCount++;
                    break;
                case 'D':
                    downCount++;
                    break;
            }
        }
        return leftCount == rightCount && upCount == downCount;
    }
}
