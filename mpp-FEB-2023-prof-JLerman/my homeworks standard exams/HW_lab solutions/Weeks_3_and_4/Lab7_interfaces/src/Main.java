public class Main {

    public static void checkObjectEquals(Object a1, Object a2){
        System.out.printf("O1: %s \nO2: %s \n", a1.toString(), a2.toString());
        System.out.println("equals : " +a1.equals(a2));
    }

    public static void main(String[] args) {

        Employee a1 = new Employee(1, "john","j,","Kennedy",
                "12/12/1945", "123456790", 25000);
        Employee a2 = new Employee(2, "Jimmy", "",
                "Carter", "12/1/1921", "123456789", 12000);
//        checkObjectEquals(a1, a2);

        Employee b1 = new Employee(11, "Paulo", "", "Coehlo"
                        ,"12/12/1991", "123455631", 12000);
        Employee b2 = new Employee(20, "Carl", "Marx", "",  "1/2/1993",
                "123456712", 26000);
//        checkObjectEquals(b1, b2);


        Employee c1 = new Employee(43, "John", "", "Elton",
                "12/1/2012", "123098123", 10000);
        Employee c2 = new Employee(31, "John", "", "Elton",
                "12/11/2012", "123098123", 20000);
//        checkObjectEquals(c1, c2);

        Employee d1 = new Employee(533, "Lao", "",
                "tze", "12/1/1921", "123456780", 12000);
        Employee d2 = new Employee(214, "Lao", "",
                "tze", "12/1/1921", "123456780", 12000);
//        checkObjectEquals(d1, d2);

       Company comp1 = new Company("IBM");
       Company comp2 = new Company("Microsoft");

//       checkObjectEquals(comp1, comp2);

       Department c1d1 = new Department("Accounts", "Dallas, TX", comp1);
       Department c1d2 = new Department("Engineering", "Texas", comp1);
//       checkObjectEquals(c1d1, c1d2);  // False

        Department c1d3 = new Department("Engineering", "Chicago", comp1);
//        checkObjectEquals(c1d2, c1d3); // true

        Department c1d4 = new Department("Engineering-Mobile", "Idaho", comp1);
//        checkObjectEquals(c1d3, c1d4); // false

        Department c2d1 = new Department("Accounts", "Texas", null);
//        checkObjectEquals(c1d1, c2d1); // false

        Department c2d2 = new Department("Accounts", "Chicago", null);
//        checkObjectEquals(c2d1, c2d2); // true

        Position p1c1d1 = new Position(c1d1, "Sales Manager", "maintain sales");
        Position p2c1d2 = new Position(c1d2, "Sales Manager 2", "maintain sales");
//        checkObjectEquals(p1c1d1, p2c1d2);

        Position p4c1d1 = new Position(c1d1, "Sales Manager", "junior sales manager");
//        checkObjectEquals(p1c1d1, p4c1d1);

        Position p3c1d1 = new Position(c1d1, "Sales Manager", "sales");
        Position p3c1d2 = new Position(c1d2, "Sales Manager 2", "sales 2");
        p3c1d1.setSuperior(p3c1d2);
//        checkObjectEquals(p3c1d1, p3c1d2);

        try {
            Object p = p3c1d1.clone();
            final Position pClone = (Position) p;
            System.out.println(p3c1d1.getSuperior());
            System.out.println(pClone.getSuperior());

            Object e = a1.clone();
            System.out.println((Employee)e);
        }
        catch(CloneNotSupportedException e){
            System.out.println("something went wrong!");
        }

    }
}
