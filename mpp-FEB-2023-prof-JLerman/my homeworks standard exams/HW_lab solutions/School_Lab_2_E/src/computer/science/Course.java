package computer.science;

import java.util.ArrayList;

public class Course {

	private String number;
	private String title;
	private int units;
	private Faculty professor;
	
	public Faculty getProfessor() {
		return professor;
	}

	Course(String number, String title, int units){
		this.number = number;
		this.title = title;
		this.units = units;
	}

	public void setFaculty(Faculty p) {
		this.professor = p;
	}
	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}
	
	public String toString() {
		String professorName = "";
		if(this.professor != null) {
			professorName = this.professor.getName();
		}
		
		return "Course: " + this.title + " faculty: " + professorName;
	}
	
}
