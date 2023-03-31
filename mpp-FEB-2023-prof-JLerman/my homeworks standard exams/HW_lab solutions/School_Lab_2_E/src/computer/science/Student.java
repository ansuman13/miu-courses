package computer.science;
import java.util.*;

public class Student extends Person {
	
	private double GPA;
	private List<Course> enrolledCourses;
	
	public List<Course> getEnrolledCourses() {
		return enrolledCourses;
	}

	Student(String name, String phone, int age, double gpa) {
		super(name, phone, age);
		this.GPA = gpa;
		this.enrolledCourses = new ArrayList<Course>();
	}

	public double getSalary() {
		return 0;
	}
	
	public void addCourse(Course c){
		enrolledCourses.add(c);
	}

	
	public String toString() {
		return "Student Name: " +this.getName();
	}
}
