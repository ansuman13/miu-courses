import java.util.stream.Stream;

public class StreamBuilderStream {

        public static void main(String[] args)
        {
            Stream.Builder<String> builder = Stream.builder();

            Stream<String> stream = builder.add("Aa").add("Za").add("Ba").build();

            stream.forEach((w) ->
            {
                char[] words = w.toCharArray();
                for(char c: words){System.out.printf("%c,",c);}
            }
            );
        }
    }