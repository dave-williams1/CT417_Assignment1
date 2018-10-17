import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;



public class Reg_System{
	public static void main(String[] args) {
		Student student1 = new Student("John", "Doe","16/5/1998", 20, 1234567, "CT417,EE451");
		Student student2 = new Student("Jane", "Doe","17/1/1997", 21, 7654321, "CT417");
		
		Module CT417 = new Module("Software Engineering 3", "CT417", "ECE, CS&IT");
		Module EE451 = new Module("System on Chips Design", "EE451", "ECE");
		
		@SuppressWarnings("deprecation")
		Date start = new Date(2018, 9, 1);
		@SuppressWarnings("deprecation")
		Date end = new Date(2019, 5, 1);
		
		Programme ECE = new Programme("ECE", start, end);
		Programme CSIT = new Programme("CS&IT", start, end);
		
		CT417.addStudent(student1);
		CT417.addStudent(student2);
		EE451.addStudent(student1);
		
		ECE.addModule(CT417);
		ECE.addModule(EE451);
		CSIT.addModule(CT417);
		
		Nametest(student2);
		
		}
	@Test
	public static void Nametest(Student student) {
		String expected = "Jane Doe";
		String actual = student.getName();
		assertEquals(expected, actual);
	}
}
