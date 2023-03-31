package computer.science;

public class StaffStudent extends Staff {
	
	private Student stu;
	private String firstCourseStartDate;
	
	public StaffStudent(Student stu, double salary,String firstCourseStartDate) {
		super(stu.getName(),stu.getPhone(),stu.getAge(), salary);
		this.firstCourseStartDate = firstCourseStartDate;
		this.stu = stu;
	}
	
	

}
