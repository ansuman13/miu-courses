import java.util.*;

class AnyMatchStream {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 6, 12, 20);

        boolean answer = list.stream().anyMatch( (n) -> n < 10 );
        boolean answerAllMatch = list.stream().allMatch( (n) -> n > 5);

        System.out.println(answer);
        System.out.println(answerAllMatch);
    }
}