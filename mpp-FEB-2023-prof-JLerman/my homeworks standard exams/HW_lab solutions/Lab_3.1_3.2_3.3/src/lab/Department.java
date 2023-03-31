package lab;
import java.util.ArrayList;
import java.util.Objects;

public class Department {

	private Company departmentOf;
	private String name;
	private String location;
	private ArrayList<Position> allPosition;

	public void addPosition(Position p){
		this.allPosition.add(p);
	}

	public Department(String name, String location, Company company){
		this.name = name;
		this.location = location;
		this.allPosition = new ArrayList<>();
		this.departmentOf = company;
	}

	public void print() {
		System.out.printf("Department name: %s, location: %s \n", name, location);
		for(Position p: allPosition) {
			p.print();
		}
		
	}

	public double getSalary(){
		double totalSalary = 0;
		for(Position p: allPosition){
			totalSalary += p.getSalary();
		}
		return totalSalary;
	}

	public Position getDepartmentHead(){
		if(allPosition.size()==0){
			return null;
		}
		Position p = allPosition.get(0);
		while(p.getDepartment().equals(p.getSuperior().getDepartment())){
			p = p.getSuperior();
		}
//		System.out.println(p.getE().getName());
		return p;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Department that = (Department) o;
		return name.equals(that.name) && location.equals(that.location);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, location);
	}
//
//	public void printReportingHierarchy(){
//		Position departmentHead;
//		for(Position p:allPosition){
//			Department reportingDepartment = p.getDepartment();
//			if(reportingDepartment != this){
//				departmentHead = p;
//			}
//		}
//	}
	
	

}
