package computer.science;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	
	private ArrayList<Person> departmentPeople = new ArrayList<Person>();
	
	Department(String name){
		this.name = name;
	}
	
	public void addPerson(Person p){
		departmentPeople.add(p);
	}
	
	public double getTotalSalary() {
		double totalSalary = 0;
		for (Person person : departmentPeople) {
				totalSalary += person.getSalary();
		}
		return totalSalary;
	}
	
	public void showAllMembers() {
		for(Person p:this.departmentPeople){
			System.out.println(p.getName()+":"+p.getPhone()+":"+p.getAge()+":"+p.getClass().getSimpleName());
		}
	}
	
	public void unitsPerFaculty() {

		for(Person p: departmentPeople) {
			if(p instanceof Faculty) {
				System.out.println(p.getName()+": "+ ((Faculty)p).getTotalUnits());
			}
		}
	}

	public Faculty getFaculty(String name) {
		Faculty a = null;
		for(Person p:departmentPeople) {
			if(p instanceof Faculty) {
				if(p.getName().toLowerCase().equals(name.toLowerCase())) {
					a = (Faculty)p;
					break;
				}
			}
		}
		return a;
	}
}
