package FizzBuzz;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Description
 *
 * @author maoyunfei
 * @Date 2018/2/27
 */
public class FizzBuzz {

    public static void main(String[] args) {
        fizzBuzz(15).forEach(System.out::println);
    }

    public static List<String> fizzBuzz(int n) {
        return IntStream.range(1, n + 1).mapToObj(i -> {
            if (i % 15 == 0) {
                return "FizzBuzz";
            } else if (i % 3 == 0) {
                return "Fizz";
            } else if (i % 5 == 0) {
                return "Buzz";
            }
            return String.valueOf(i);
        }).collect(Collectors.toList());
    }
}
