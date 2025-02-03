import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationFromCollections {
    public static void main(String[] args) {

        // create collection

        List<String> list = Arrays.asList("abc", "def", "xyz");

        // use stream() or parallelStream() methods on collections

        Stream<String> stream = list.stream();
        Stream<String> parallelStream = list.parallelStream();


        System.out.println(stream);
        System.out.println(parallelStream);

        stream.forEach(System.out::println);
    }
}
