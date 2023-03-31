package test;
import java.util.*;
import java.util.stream.*;

public class FirstLetterCapital {

    public static void main(String[] args) {

        String[] cities = {"chicago", "dallas", "austin", "houston", "fairfield", "ottumwa", "des moines"};

        List<String> a = Arrays.asList(cities).stream().map( (c) -> Character.toUpperCase(c.charAt(0)) + c.substring(1)).collect(Collectors.toList());
        System.out.println(a);
    }


}
