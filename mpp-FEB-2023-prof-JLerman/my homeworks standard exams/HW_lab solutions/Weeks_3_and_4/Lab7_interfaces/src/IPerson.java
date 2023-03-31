import java.time.LocalDate;

public interface IPerson {

    static void PersonIdentityStaticFunction(){
        System.out.println("PersonIdentity is a static method from IPerson interface, thanks to Java 8");
    }

    default void testDefaultMethod(){
        System.out.println("default method in IPerson");
    }

    abstract int calculateAge();

}
