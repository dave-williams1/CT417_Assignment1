import java.util.ArrayList;

public class Module {
	String name;
	String id;
	String assosciatedCourses;
	ArrayList<Student> students= new ArrayList<Student>();
	
	public Module(String Name, String ID, String Courses){
		name = Name;
		id = ID;
		assosciatedCourses = Courses;
	}
	
	public void addStudent(Student student){
		students.add(student);
	}
}
