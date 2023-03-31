package test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class myFilter {

    Stream myFilter(List<T> l, Predicate<? super T> predicate){
        for(int i=0;i<=l.size();i++){
            if(!(predicate.test(l.get(i)))){
                l.remove(i);
            }
        }
        return l.stream();
    }
}
