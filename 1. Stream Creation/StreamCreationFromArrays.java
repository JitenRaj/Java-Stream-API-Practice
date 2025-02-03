import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreationFromArrays {
    public static void main(String[] args) {
        // create array
        String[] array = {"abc", "def", "xyz"};

        // convert array to stream using Arrays.stream()
        Stream<String> arrayStream = Arrays.stream(array);

        arrayStream.forEach(System.out::println);
    }
}
