package JewelsAndStones;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2018/2/26
 */
public class JewelsAndStones {

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb")); // 3
        System.out.println(numJewelsInStones("z", "ZZ"));   // 0
    }

    public static int numJewelsInStones(String J, String S) {
        return (int) S.chars().mapToObj(e -> (char) e).filter(c -> J.indexOf(c) >= 0).count();
    }
}
