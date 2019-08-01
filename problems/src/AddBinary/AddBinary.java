package AddBinary;

import java.util.Stack;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class AddBinary {

    public static void main(String[] args) {
        String a = "1010", b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        int i = 0;
        char[] charsa = a.toCharArray();
        char[] charsb = b.toCharArray();

        Stack<Integer> stack = new Stack<>();
        int carry = 0;
        while (i < charsa.length || i < charsb.length) {
            int n;
            if (i < charsa.length) {
                n = Integer.valueOf(charsa[charsa.length - 1 - i]) - 48;
            } else {
                n = 0;
            }

            int m;
            if (i < charsb.length) {
                m = Integer.valueOf(charsb[charsb.length - 1 - i]) - 48;
            } else {
                m = 0;
            }
            stack.push((n + m + carry) % 2);
            carry = (n + m + carry) / 2;
            i++;
        }
        if (carry != 0) {
            stack.push(carry);
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

}
