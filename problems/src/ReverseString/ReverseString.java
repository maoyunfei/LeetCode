package ReverseString;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2018/2/26
 */
public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
