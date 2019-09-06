import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author wukh@yunrong.cn
 * @version V2.1
 * @since 2.1.0 2019/8/26 18:46
 */
public class Stream {
    public static void main(String[] args) {
        IntStream.of(new int[] {1, 2, 3}).forEach(System.out::print);
        IntStream.range(1, 3).forEach(System.out::println);
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
        System.out.println("---------------------------------");
        List<String> list = Arrays.asList(new String[] {"a", "b", "c"});
        List<String> result = list.stream().map(String::toUpperCase).collect(Collectors.toList());
        result.forEach(x -> System.out.print(x + " "));
        System.out.println("---------------------------------");
        List<Integer> list1 = Arrays.asList(1,2,3,3,2,4);
        java.util.stream.Stream<Integer> stream3 = list1.stream().distinct();
        stream3.forEach(System.out::println);


    }
}
