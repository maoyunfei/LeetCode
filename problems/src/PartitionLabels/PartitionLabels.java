package PartitionLabels;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class PartitionLabels {

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));
    }

    public static List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        int startIndex = 0;
        while (startIndex < S.length()) {
            char c = S.charAt(startIndex);
            int endIndex = S.lastIndexOf(c);
            for (int i = startIndex + 1; i < endIndex; i++) {
                if (S.lastIndexOf(S.charAt(i)) > endIndex) {
                    endIndex = S.lastIndexOf(S.charAt(i));
                }
            }
            res.add(endIndex - startIndex + 1);
            startIndex = endIndex + 1;
        }
        return res;
    }

}
