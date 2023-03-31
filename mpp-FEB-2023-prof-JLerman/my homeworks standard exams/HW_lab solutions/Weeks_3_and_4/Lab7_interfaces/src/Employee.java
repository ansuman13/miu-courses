import java.util.Objects;

public class Employee extends Object implements Cloneable {

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

    @Override
    public boolean equals(Object e){
        if(e == this){ return true; }
        if(e == null || e.getClass() != this.getClass()){return false;}
        Employee e1 = (Employee) e;
        return (Objects.equals(this.firstName, e1.firstName) &&
                Objects.equals(this.lastName, e1.lastName) &&
                Objects.equals(this.SSN, e1.SSN));
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.firstName, this.lastName, this.SSN);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        Object e = super.clone();
        return e;
    }
}
