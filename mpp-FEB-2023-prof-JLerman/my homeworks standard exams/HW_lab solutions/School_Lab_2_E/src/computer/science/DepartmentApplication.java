package computer.science;

import java.io.*;                 // for I/O
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


/**
 * This is a skeleton class that you can use for guidance in starting the lab.
 *
 * You should update any comments,
 * variable names, etc to follow the class coding conventions.
 */

public class DepartmentApplication
   {
   public static void main(String[] args) throws IOException
      {
      Department dept = new Department("ComputerScience");
      
      //  The following commented out code will help you 
      //  create the objects that you need.


      //  CHANGE the code below so that instead of addFaculty, 
      //  addStudent, and  addStaff, we have ONLY ONE method, 
      //  addPerson (this replaces the other three methods).

      
		// Create faculty objects
		Person frankMoore = new Faculty("Frank Moore","472-5921",43,10000);	
		Person samHoward = new Faculty("Sam Howard","472-7222",55,9500);
		Person johnDoodle = new Faculty("John Doodle","472-6190",39,8600);

		dept.addPerson(frankMoore);
		dept.addPerson(samHoward);
		dept.addPerson(johnDoodle);


		// Create student objects
		Person johnDoe = new Student("John Doe","472-1121",22,4.0);
		Person maryJones = new Student("Mary Jones","472-7322",32,3.80);
		Person leeJohnson = new Student("Lee Johnson","472-6009",19,3.65);

		dept.addPerson(johnDoe);	
		dept.addPerson(maryJones);
		dept.addPerson(leeJohnson);
		
//		list of all student
		List<Student> students = new ArrayList<Student>();
		students.add((Student) johnDoe);
		students.add((Student) maryJones);
		students.add((Student) leeJohnson);
		
		
		Person ansumanSinghStu = new Student("Ansuman Singh", "641-233-9301", 28, 3.80);
		Person ansumanSingh = new StaffStudent((Student)ansumanSinghStu, 1000, "12/12/2012");
		dept.addPerson(ansumanSingh);

		// Create staff objects
		Person frankGore = new Staff("Frank Gore","472-3321",33,4050);
		Person adamDavis = new Staff("Adam Davis","472-7552",50,5500);
		Person davidHeck = new Staff("David Heck","472-8890",29,3600);
		dept.addPerson(frankGore);
		dept.addPerson(adamDavis);
		dept.addPerson(davidHeck);

		// Create course objects

/* The below is giving a faculty reference as the last argument.  
 * This is a Mistake since it is one directional.  
 * The  ‘1’  next to the Faculty class in the class diagram is Not implemented in the Course class. 
 *  It is there only to show us that a course is taught by only one faculty.
However, this mistake below does show us 
How we could implement the code IF it was two-directional!  */
	
		Course cs201 = new Course("cs201","programming",4);
		((Faculty) johnDoodle).addCourse(cs201);
//		cs201.setFaculty((Faculty)johnDoodle);
		
		
		Course cs360 = new Course("cs360","database",3);
		((Faculty)samHoward).addCourse(cs360);
//		cs360.setFaculty((Faculty)johnDoodle);
		
		Course cs404 = new Course("cs404","compiler",4);
		((Faculty)johnDoodle).addCourse(cs404);
//		cs404.setFaculty((Faculty)johnDoodle);
		
		Course cs240 = new Course("cs240","datastructure",2);
		((Faculty)johnDoodle).addCourse(cs240);
//		cs240.setFaculty((Faculty)johnDoodle);
		
		
		Course cs301 = new Course("cs301","Software engg",3);
		((Faculty)samHoward).addCourse(cs301);
//		cs301.setFaculty((Faculty)samHoward);
		
		Course cs450 = new Course("cs450","Advanced architecture",5);
		((Faculty)frankMoore).addCourse(cs450);
//		cs450.setFaculty((Faculty)frankMoore);
		
		
//		cs201.addStudent((Student)johnDoe);
		
		
		((Student)johnDoe).addCourse(cs201);
		((Student)johnDoe).addCourse(cs301);
		((Student)johnDoe).addCourse(cs360);
		((Student)johnDoe).addCourse(cs450);
		
		((Student)leeJohnson).addCourse(cs450);
		((Student)leeJohnson).addCourse(cs301);
		((Student)leeJohnson).addCourse(cs240);
		
//		((Student)maryJones).addCourse(cs404);
//		((Student)maryJones).addCourse(cs240);
		((Student)maryJones).addCourse(cs301);
		/*
		 * The above course objects will go inside either
		 * a faculty object, or a student object.  Not all of the course
		 *  objects go into the same object.
		 * 
		 *  You would have code that looks something like :
		 *  frankMoore.addCourse(cs450);
		 * 
		 *  The addCourse method would have to be written in
		 *  the faculty class.  Something similar would be done 
		 *  for students.
		 */
      
      /********************************************************/
      
      
      double totsalary = 0;

      while(true)
         {
         putText("Enter first letter of ");
         putText("getTotalSalary, showAllMembers, unitsPerFaculty, allStudentsTaughtByfaculty or quit : ");
         int choice = getChar();
         switch(choice)
            {
            case 'a':
            	putText("Enter Faculty Name");
            	String facultyName = getString();
            	Faculty f = dept.getFaculty(facultyName);
            	if(f == null) {
            		System.out.println("faculty not found, try again!");
            		break;
            	}
            	
            	HashSet<String> result = new HashSet<String>();
//            	have a list of all students
            	for(Student s: students) {
//            		System.out.printf("Student name: %s \n", s.getName());
            		List<Course> enrolledCourses = s.getEnrolledCourses();
            		if(enrolledCourses == null){
            			enrolledCourses = new ArrayList<Course>();
            		}
//            		System.out.printf("Enrolled courses: %s \n", enrolledCourses.toString());
            		for(Course c: enrolledCourses) {
            			if (c.getProfessor() == f) {
            				result.add(s.getName());
            			};
            		}            		
            	}
            	
            	try {
            		System.out.println("Student current enrolled: ");
            		putText(result.toString());
            	}
            	catch(Exception NullPointerException) {
            		System.out.println("No student enrolled in this faculty's class");
            	}
            	break;
            case 'g':
               totsalary=dept.getTotalSalary();
               putText("Total sum of all salaries is:");
               putText(String.valueOf(totsalary)+"\n");              
               break;
            case 's':
               dept.showAllMembers();
               break;
            case 'u':
               dept.unitsPerFaculty();
               break;
            case 'q': return;
            default:
               putText("Invalid entry\n");
            }  // end switch
         }  // end while
      }  // end main()
// -------------------------------------------------------------
   public static void putText(String s) //writes string s to the screen
      {
      System.out.println(s);
      }
// -------------------------------------------------------------
   public static String getString() throws IOException  //reads a string from the keyboard input
      {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
      }
// -------------------------------------------------------------
   public static char getChar() throws IOException //reads a character from the keyboard input
      {
      String s = getString();
      return s.charAt(0);
      }

//-------------------------------------------------------------
   public static int getInt() throws IOException // reads an integers from the keyboard input
      {
      String s = getString();
      return Integer.parseInt(s);
      }
// -------------------------------------------------------------
   }  // end class 
