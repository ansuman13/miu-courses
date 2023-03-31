// Program 4: ProcessingEmployees.java
// Processing streams of Employee objects.
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ProcessingEmployees
{
    public static void main(String[] args)
    {
        // initialize array of Employees
        Employee[] employees = {
                new Employee("Jason", "Red", 5000, "IT"),
                new Employee("Ashley", "Green", 7600, "IT"),
                new Employee("Matthew", "Indigo", 3587.5, "Sales"),
                new Employee("James", "Indigo", 4700.77, "Marketing"),
                new Employee("Luke", "Indigo", 6200, "IT"),
                new Employee("Jason", "Blue", 3200, "Sales"),
                new Employee("Wendy", "Brown", 4236.4, "Marketing")};

        List<Employee> list = Arrays.asList(employees);
        // 1)  Count the number of last names that begin with the letter  ‘B’.  Print out this number.

        System.out.printf("%d%n",list.stream().filter(
                (e) -> e.getLastName().charAt(0) == 'B'
        ).count());

        // 2) Print out all the Employee objects whose last name begins with the letter  ‘B’  in sorted order
        Comparator<Employee> lastNameThenFirstNameComparator= Comparator.comparing(Employee::getLastName).thenComparing(Employee::getFirstName);

        list.stream().sorted(lastNameThenFirstNameComparator).forEach(
                (e) -> {
                    if(e.getLastName().charAt(0)=='B'){
                        System.out.println(e);
                    }
                }
        );

        //  3) Print out all the Employee objects whose last name begins with the letter  ‘B’
        //  and change their first name and last name to be All capital letters.
        //  Do this in two different ways;  the first way does Not change the original list,
        //  and the second way does change the original list.


        // without changing the list
        list.stream()
                .filter( emp -> emp.getLastName().charAt(0) == 'B')
                .map((e) -> {
                            Employee newE = new Employee(e.getFirstName().toUpperCase(), e.getLastName().toUpperCase(), e.getSalary(), e.getDepartment());
                            return newE;
                        }
                    )
                .forEach(System.out::println);
//
        System.out.println("Original List");
        list.stream().forEach(System.out::println);


//         this way changes the original list
        list.stream()
                .filter((e) -> e.getLastName().charAt(0) == 'B')
                .map((e) -> {
                        e.setFirstName(e.getFirstName().toUpperCase());
                        e.setLastName(e.getLastName().toUpperCase());
                        return e;
                    })
                .forEach(System.out::println);
//
//        4)  Print out All the employee objects, but if the last name begins with the letter  ‘B’,
//        then capitalize all the letters in the last name.
//              4.1)  Use the  Collectors.joining  method to print out All Employee objects.
//                  (See my  presentation file  ‘Do_Last_This_Was_Lesson 9_Streams_E.docx’.)
        String allEmployees = list.stream().map(Employee::toString)
                .collect(Collectors.joining(" "));
        System.out.println(allEmployees);

//              4.2)  Use the  Collectors.joining  method to print out All Employee objects, and separate
//                  each one with a delimeter of  “---\n---“.
//                  (See my  presentation file  ‘Do_Last_This_Was_Lesson 9_Streams_E.docx’.)
        String allEmployeesDelimiter = list.stream().map(Object::toString).collect(Collectors.joining("--\n--"));
        System.out.println(allEmployeesDelimiter);

        // 5)  Print out all of the Employee objects’ last names, whose last name begins with the letter  ‘I’
        // in sorted order, and get rid of all the duplicates.
        // Print out only the last names.

        Comparator<Employee> lastNameSortOrder = Comparator.comparing(Employee::getLastName);

         list.stream()
                 .filter( (e)-> e.getLastName().startsWith("I"))
                 .sorted(lastNameSortOrder.reversed())
                 .map(e-> e.getFirstName())
                 .distinct()
                 .forEach(System.out::println);

//        6)  Print out the average of all the salaries.

        DoubleSummaryStatistics stats = list.stream()
                .map(e->e.getSalary())
                .collect(Collectors.summarizingDouble(Double::doubleValue));
        System.out.printf("%.2f",stats.getAverage());

        //Maximum salary

//        double maximumSalary = list.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getMax();
//        System.out.println(maximumSalary);

        // minimum salary

        DoubleSummaryStatistics a = list.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
//        System.out.println("max: "+a.getMax());
//        System.out.println("min: "+a.getMin());
//        System.out.println("average: "+a.getAverage());



//        7)  Use the  ‘reduce’  method to print out the total salary of all employees.
            Double totalSalary =
                    list.stream()
                            .map(e->e.getSalary())
                    .reduce(0.0, (aa,b) -> aa + b);

        System.out.println("7. totalSalary :"+totalSalary);

//        Map<String, Double> aMap = list.stream().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
//        System.out.println(aMap);

//        8)  Print out only the first names of all the employees.  Use the  ‘map’  method to accomplish this.
            list.stream()
                    .map(Employee::getFirstName)
                    .sorted().
                    forEach(System.out::println);


//        9)  Create an infinite stream of even numbers (0, 2, 4, …) and then, eventually print out only the first 20 even numbers from this stream.

        Stream<Integer> evenNumberStream = Stream.iterate(0, i-> i+2);
        List<Integer> aaa = evenNumberStream.limit(20)
                .collect(Collectors.toList());
        System.out.println(aaa);

//        Stream<Integer> evenNumInfiniteStream = Stream.iterate(0, n -> n + 2);
//        List<Integer> newList = evenNumInfiniteStream.limit(10)
//                .collect(Collectors.toList());

//        System.out.println(newList);

        //b)  Use reduce to concatenate the Strings in the Stream below to form a single, space-separated String.  Print the result to the console.
        //        //  public static void main(String[] args) {
        //        //         Stream strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
        //        //  }
                Stream<String> strings = Stream.of("A", "good", "day", "to", "write", "some", "Java");
        String finalString = strings.reduce("", (ab,cd) -> ab + " " + cd );
        System.out.println(finalString);

//        List<Integer> a = IntStream.iterate(0, i -> i+2)
//                .limit(20)
//                .collect(Collectors.toList());


        // 7)  Level 3 :  Study  ‘Program 4’  of the file I gave you, of complete Java 8 programs.
        //     Understand All of the code.  Look at the    ‘// group Employees by department’
        //                                 // collect(Collectors.groupingBy
        //     code at the bottom, and understand what it is doing so that you can explain it to me or to
        //     another student.  Run the code.  Then try to do the following :

        //   a)  Print out each department and the average salary for the department.
        Map<String, List<Employee> > deptEmpMap = list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        deptEmpMap.forEach( (dept, emps) -> {
            System.out.println(dept);
            Double average = emps.stream().map((e) -> e.getSalary()).collect(Collectors.summarizingDouble((d)->d)).getAverage();
            System.out.println("Average salary: " +average);
        });

        //   b)  Print out each department and the maximum salary for the department.

        list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((department, deptEmps) -> {
                    System.out.println(department);
                    Double MaxSalary = deptEmps.stream()
                            .collect(Collectors.summarizingDouble(Employee::getSalary)).getMax();
                            System.out.println("Max Salary:" +MaxSalary);
                        });

        // c) print out each department and all of the employees who work at that department

        list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment))
                .forEach((department, emps) -> {
                    System.out.println(department);
                    emps.forEach((emp) -> System.out.println(emp) );
                });














        /**
        // get List view of the Employees
        List<Employee> list = Arrays.asList(employees);

        // display all Employees
        System.out.println("Complete Employee list:");
        list.stream().forEach(System.out::println);   //A method reference.

        // Predicate (boolean-valued function) that returns true for salaries
        //in the range $4000-$6000
        Predicate<Employee> fourToSixThousand =
                e -> (e.getSalary() >= 4000 && e.getSalary() <= 6000);

        // Display Employees with salaries in the range $4000-$6000
        // sorted into ascending order by salary
        System.out.printf(
                "%nEmployees earning $4000-$6000 per month sorted by salary:%n");

        list.stream()
                .filter(fourToSixThousand)
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        // Display first Employee with salary in the range $4000-$6000
        System.out.printf("%nFirst employee who earns $4000-$6000:%n%s%n",
                list.stream()
                        .filter(fourToSixThousand)
                        .findFirst()
                        .get());

        // Functions for getting first and last names from an Employee
        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        // Comparator for comparing Employees by first name then last name
        Comparator<Employee> lastThenFirst =
                Comparator.comparing(byLastName).thenComparing(byFirstName);

        // sort employees by last name, then first name
        System.out.printf(
                "%nEmployees in ascending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst)
                .forEach(System.out::println);

        // sort employees in descending order by last name, then first name
        System.out.printf(
                "%nEmployees in descending order by last name then first:%n");
        list.stream()
                .sorted(lastThenFirst.reversed())
                .forEach(System.out::println);

        // display unique employee last names sorted
        System.out.printf("%nUnique employee last names:%n");
        list.stream()
                .map(Employee::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        // display only first and last names
        System.out.printf(
                "%nEmployee names in order by last name then first name:%n");
        list.stream()
                .sorted(lastThenFirst)
                .map(Employee::getName)
                .forEach(System.out::println);

        // group Employees by department
        System.out.printf("%nEmployees by department:%n");
        Map<String, List<Employee>> groupedByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment));

        groupedByDepartment.forEach(
                (department, employeesInDepartment) ->
                {
                    System.out.println(department);
                    employeesInDepartment.forEach(
                            employee -> System.out.printf("   %s%n", employee));
                }
        );

        // count number of Employees in each department
        System.out.printf("%nCount of Employees by department:%n");

        Map<String, Long> employeeCountByDepartment =
                list.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                TreeMap::new, Collectors.counting()));

        employeeCountByDepartment.forEach(
                (department, count) -> System.out.printf(
                        "%s has %d employee(s)%n", department, count));

//         Output looks something like :

//        HR  4
//        IT  8
//        Sales  12


        // sum of Employee salaries with DoubleStream sum method
        System.out.printf(
                "%nSum of Employees' salaries (via sum method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .sum());

        // calculate sum of Employee salaries with Stream reduce method
        System.out.printf(
                "Sum of Employees' salaries (via reduce method): %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .reduce(0, (value1, value2) -> value1 + value2));

        // average of Employee salaries with DoubleStream average method
        System.out.printf("Average of Employees' salaries: %.2f%n",
                list.stream()
                        .mapToDouble(Employee::getSalary)
                        .average()
                        .getAsDouble());
        **/
    } // end main


    ////3)    a)  Implement  a method with the following signature and return type:
    ////               public int countWords(List<String> words, char c, char d, int len)
    //        //which counts the number of words in the input list words that have length equal to len, that contain the character c, and that do not contain the character d.  Create a solution that uses a lambda expression.
    //        //Hint :  Look at ALL of the methods that are available in the String class.  This will make it easier for you.


    //
    public int countWords(List<String> words, char c, char d, int len){
        return (int)words.stream()
                .filter( (word)-> word.charAt(0)==c && word.charAt((words.size()-1))==d && word.length() == len)
                .count();

    }


} // end class ProcessingEmployees