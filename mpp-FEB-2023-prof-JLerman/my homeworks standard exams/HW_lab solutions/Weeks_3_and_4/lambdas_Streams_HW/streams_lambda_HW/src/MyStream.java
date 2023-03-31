import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface MyStream {

    static Stream myfilter(List l, Predicate predicate) {
        Objects.requireNonNull(predicate);

        for (Object o : l) {
            if (!(predicate.test(o))) l.remove(o);
        }
        return l.stream();
    }

    default Stream myMap(ArrayList<Object> l, Function<Object, Object> function) {
        Objects.requireNonNull(function);

        List<Object> newList = new ArrayList<Object>();
        for (Object o : l) {
              o = function.apply(l);
              newList.add(o);
        }
        return newList.stream();
    }

}
