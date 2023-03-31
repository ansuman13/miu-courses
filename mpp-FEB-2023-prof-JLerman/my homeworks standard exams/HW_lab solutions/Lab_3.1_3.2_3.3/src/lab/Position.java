package lab;

import java.util.ArrayList;
public class Position {

    private Employee e;
    private Department department;
    private String title;
    private String description;

    public Position getSuperior() {
        return superior;
    }

    public ArrayList<Position> getInferiors() {
        return inferiors;
    }

    private Position superior;
    private ArrayList<Position> inferiors;

    public Position(Department department, String title, String description) {
        this.department = department;
        this.title = title;
        this.description = description;
        this.inferiors = new ArrayList<>();
        this.superior = null;
    }

    public void addInferior(Position p){
        this.inferiors.add(p);
    }

    public void setSuperior(Position p){
        this.superior = p;
    }



    public Employee getE() {
        return e;
    }

    public void printDownLine(String space){
        System.out.printf("%s\n",this.e.getName());
        for(Position p: inferiors){
            space = space + "  ";
            System.out.printf(space);
            p.printDownLine(space);
        }
//        System.out.println();
    }

    public void setE(Employee e) {
        this.e = e;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void print() {
        System.out.printf("Position Title: %s, Description: %s \n", title, description);
        if(e==null){
            System.out.print("Currently this position is vacant \n");
        }else{
            e.print();
        }
    }

    double getSalary(){
        double salary = 0;
        if(this.e != null){
            return this.e.getSalary();
        }
        return salary;
    }


}
