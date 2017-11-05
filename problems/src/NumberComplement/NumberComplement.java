package NumberComplement;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class NumberComplement {
    public static void main(String[] args) {
        System.out.println(new NumberComplement().findComplement(5));
        System.out.println(new NumberComplement().findComplement(1));
        System.out.println(new NumberComplement().findComplement(2147483647));
    }

    public int findComplement(int num) {
        return (int) ((long) Math.pow(2, Integer.toBinaryString(num).length()) - 1 - num);
    }
}
