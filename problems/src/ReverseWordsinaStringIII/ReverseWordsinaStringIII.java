package ReverseWordsinaStringIII;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/9
 */
public class ReverseWordsinaStringIII {
    public static void main(String[] args) {
        System.out.println(new ReverseWordsinaStringIII().reverseWords("Let's take LeetCode contest"));
    }

    public String reverseWords(String s) {
        int index = s.indexOf(' ');
        if (index < 0) {
            return reverseWord(s);
        } else {
            return reverseWord(s.substring(0, index)) + " " + reverseWords(s.substring(index + 1, s.length()));
        }
    }

    private static String reverseWord(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[(chars.length - 1 - i)];
            chars[(chars.length - 1 - i)] = temp;
        }
        return new String(chars);
    }
}
