package HammingDistance;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(new HammingDistance().hammingDistance(1, 4));
    }

    public int hammingDistance(int x, int y) {
        int result = x ^ y;
        char[] chars = Integer.toBinaryString(result).toCharArray();
        int num = 0;
        for (char c : chars) {
            if (c == '1') {
                num++;
            }
        }
        return num;
    }
}
