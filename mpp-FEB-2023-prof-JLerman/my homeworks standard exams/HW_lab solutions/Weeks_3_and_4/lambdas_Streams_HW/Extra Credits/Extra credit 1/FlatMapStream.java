import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class FlatMapStream {

    public static void main(String[] args) {
        List<Integer> OddNumbers = Arrays.asList(1, 3, 5);
        List<Integer> EvenNumbers = Arrays.asList(2, 4, 6, 8);
        List<List<Integer>> listOfListofInts = Arrays.asList( new ArrayList(), OddNumbers, EvenNumbers);

        System.out.println("The Structure before flattening is : " + listOfListofInts);

        List<Integer> listofInts = listOfListofInts.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("The Structure after flattening is : " +
                listofInts);
    }

}
