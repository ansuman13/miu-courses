package computer.science;

public abstract class Person {
	
	private String name;
	private String phone;
	private int age;
	
	Person(String name, String phone, int age){
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract double getSalary();
		
	
}
