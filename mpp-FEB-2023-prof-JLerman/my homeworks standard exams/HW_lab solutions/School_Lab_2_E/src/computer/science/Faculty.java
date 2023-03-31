package computer.science;
import java.util.*;

public class Faculty extends Person {
	
	private double salary;
	private List<Course> courseTaught = new ArrayList<Course>();
	
	Faculty(String name, String number, int age, double salary){
		super(name, number, age);
		this.salary = salary;
	}
	
	public void addCourse(Course c){
		courseTaught.add(c);
		c.setFaculty(this);
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getTotalUnits() {
		int totalUnits = 0;
		for(Course c: courseTaught) {
			totalUnits += c.getUnits();
		}
		return totalUnits;
	}

	
}
