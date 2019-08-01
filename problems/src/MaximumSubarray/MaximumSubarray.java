package MaximumSubarray;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class MaximumSubarray {

    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        if (strings.length == 0) {
            return 0;
        }
        return strings[strings.length - 1].length();
    }

}
