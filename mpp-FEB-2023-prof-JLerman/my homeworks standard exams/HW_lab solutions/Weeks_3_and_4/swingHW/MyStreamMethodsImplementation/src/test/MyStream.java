package test;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface MyStream {

     Stream<T> myFilter(Predicate<? super T> predicate);
     Stream<T>	sorted(Comparator<? super T> comparator);
     T  myReduce(T identity, BinaryOperator<T> accumulator);


}
