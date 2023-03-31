package lab;

public class Employee {

    private int employeeId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String birthDate;
    private String SSN;
    private double salary;

    public Employee(int employeeId, String firstName, String middleInitial, String lastName, String birthDate, String SSN, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.SSN = SSN;
        this.salary = salary;
    }

    public void print() {
        System.out.printf("Employee Id: %d, FirstName: %s, middleInitial: %s, LastName: %s, birthDate: %s, SSN: %s, salary: %s \n",
                employeeId,
                firstName,
                middleInitial,
                lastName,
                birthDate,
                SSN,
                salary);
    }

    double getSalary(){
        return this.salary;
    }

    public String getName(){
        return firstName;
    }

}
