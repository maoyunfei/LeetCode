package KeyboardRow;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2018/2/26
 */
public class KeyboardRow {

    public static void main(String[] args) {
        String[] a = {"Hello", "Alaska", "Dad", "Peace"};
        for (String wd : findWords(a)) {
            System.out.println(wd);
        }
    }

    public static String[] findWords(String[] words) {
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (sameRow(word)) {
                result.add(word);
            }
        }
        String[] array = new String[result.size()];
        result.toArray(array);
        return array;
    }

    private static boolean sameRow(String word) {
        int row = getRow(word.charAt(0));
        for (char c : word.toCharArray()) {
            if (getRow(c) != row) {
                return false;
            }
        }
        return true;
    }

    private static int getRow(char c) {
        int row = 1;
        switch (c) {
            case 'Q':
            case 'q':
            case 'W':
            case 'w':
            case 'E':
            case 'e':
            case 'R':
            case 'r':
            case 'T':
            case 't':
            case 'Y':
            case 'y':
            case 'U':
            case 'u':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'P':
            case 'p':
                row = 1;
                break;
            case 'A':
            case 'a':
            case 'S':
            case 's':
            case 'D':
            case 'd':
            case 'F':
            case 'f':
            case 'G':
            case 'g':
            case 'H':
            case 'h':
            case 'J':
            case 'j':
            case 'K':
            case 'k':
            case 'L':
            case 'l':
                row = 2;
                break;
            case 'Z':
            case 'z':
            case 'X':
            case 'x':
            case 'C':
            case 'c':
            case 'V':
            case 'v':
            case 'B':
            case 'b':
            case 'N':
            case 'n':
            case 'M':
            case 'm':
                row = 3;
                break;
        }
        return row;
    }
}
