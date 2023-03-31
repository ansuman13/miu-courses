package test;

public class testImplementation implements test {


    @Override
    public void testMethod3() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        test a = new testImplementation();
                test.testMethod2();
                a.testMethod();
                a.testMethod3();

    }
}
