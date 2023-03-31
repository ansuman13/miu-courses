import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Student implements IPerson{

    private String name;
    private String address;
    private LocalDateTime dob;

    public Student(String name, String address, LocalDateTime d){
        this.dob = d;
        this.name = name;
        this.address = address;
    }

    public int calculateAge(){
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime tempDateTime = today.from(this.dob);
        long years = tempDateTime.until(today, ChronoUnit.YEARS );
        System.out.printf("\nage %2d \n", years);
        return (int)years;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ansuman", "Kathmandu", LocalDateTime.of(1994,3,8,0,0));
        s1.calculateAge();
        s1.testDefaultMethod();
        IPerson.PersonIdentityStaticFunction();
    }
}
