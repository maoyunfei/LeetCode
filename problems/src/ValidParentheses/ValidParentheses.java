package ValidParentheses;

import java.util.Stack;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String str = "{[]}";
        System.out.println(isValid(str));
        String str2 = "([)]";
        System.out.println(isValid(str2));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '{':
                case '(':
                case '[':
                    stack.push(c);
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
