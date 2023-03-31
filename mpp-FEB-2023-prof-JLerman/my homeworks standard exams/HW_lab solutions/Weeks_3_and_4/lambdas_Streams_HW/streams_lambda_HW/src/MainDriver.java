import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MainDriver implements MyStream {

    public static void main(String[] args) {
        List<Employee> aList = new ArrayList<>();
        aList.add(new Employee("Ram", "Suryavanshi", 0, "Admin"));
        aList.add(new Employee("Sita", "Suryavanshi", 0, "Home"));
        aList.add(new Employee("Laxman", "Suryavanshi", 0, "Support"));
        aList.add(new Employee("Pawanputra", "", 0, "Helper"));

        List<String> a = new ArrayList<>();
        a.add("Ram");
        a.add("Shyam");
        a.add("Gyan");
        a.add("shakti");

        Predicate<String> p = (e) -> e.equals("Admin");

        Stream<String> ab = MyStream.myfilter(a, p);

        ab.forEach( (e)-> System.out.println(e));

    }


}
