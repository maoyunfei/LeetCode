package QueueReconstructionByHeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2017/11/5
 */
public class QueueReconstructionByHeight {
    public static void main(String[] args) {
        //2：string的intern使用
        //s1是基本类型，比较值。s2是string实例，比较实例地址
        //字符串类型用equals方法比较时只会比较值
        String s1 = "a";
        String s2 = new String("a");
        //调用intern时,如果s2中的字符不在常量池，则加入常量池并返回常量的引用
        String s3 = s2.intern();
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }

//    public static void main(String[] args) {
//        int[][] people = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}};
//        System.out.println(reconstructQueue(people));
//    }

    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (o1, o2) -> o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]);
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            list.add(people[i][1], people[i]);
        }
        return list.toArray(new int[people.length][]);
    }
}
