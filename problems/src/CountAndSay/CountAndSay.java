package CountAndSay;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class CountAndSay {

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
        System.out.println(countAndSay(6));
    }

    public static String countAndSay(int n) {
        String result = "1";
        for (int i = 1; i < n; i++) {
            result = nextCount(result);
        }
        return result;
    }

    public static String nextCount(String count) {
        StringBuilder sb = new StringBuilder();
        char last = '0';
        int num = 0;
        for (char c : count.toCharArray()) {
            if (c == last) {
                num++;
            } else {
                if (num != 0) {
                    sb.append(num).append(last);
                }
                last = c;
                num = 1;
            }
        }
        sb.append(num).append(last);

        return sb.toString();
    }

}
