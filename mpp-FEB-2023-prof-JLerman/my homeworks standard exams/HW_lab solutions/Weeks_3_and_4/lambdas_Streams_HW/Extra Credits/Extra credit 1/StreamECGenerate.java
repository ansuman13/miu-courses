import java.util.*;
import java.util.stream.Stream;

class StreamECGenerate {

    public static void main(String[] args) {

        Stream.generate(new Random()::nextInt)
                .limit(10).forEach(System.out::println);
    }
}