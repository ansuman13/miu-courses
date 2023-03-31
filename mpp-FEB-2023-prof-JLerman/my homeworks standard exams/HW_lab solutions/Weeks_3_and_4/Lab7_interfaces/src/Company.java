import java.util.ArrayList;

public class Company {

    private String name;
    private ArrayList<Department> allDept;

    public Company(String name) {
        this.name = name;
        this.allDept = new ArrayList<Department>();
    }

    public void addDept(Department dept){
        this.allDept.add(dept);
    }

    void print() {
        System.out.printf("Company: %s \n", name);
        for (Department d : allDept) {
            d.print();
        }
    }

    double getSalary() {
        double totalSalary = 0;
        for (Department d : allDept) {
            totalSalary += d.getSalary();
        }
        return totalSalary;
    }

    public Position getTopExecutive(){
        for(Department d: allDept){
            return d.getDepartmentHead().getSuperior();
        }
        return null;
    }

    public void printReportingHierarchy(){
        System.out.println(getTopExecutive().getE().getName());
        for(Department d: allDept){
            Position p = d.getDepartmentHead();
            p.printDownLine("");
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }

    //    public void printReportingHierarchy(){
//        getTopExecutive();
//        for(Department d: allDept){
//            d.getDepartmentHead();
//        }
//    }
}
