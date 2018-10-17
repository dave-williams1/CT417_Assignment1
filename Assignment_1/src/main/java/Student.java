
public class Student {
	String firstName;
	String lastName;
	String DOB;
	int age;
	String userName;
	int ID;
	String modulesRegistered;


public Student(String fName, String lName, String dob, int Age, int id, String modules){
	firstName = fName;
	lastName = lName;
	DOB = dob;
	age = Age;
	ID = id;
	modulesRegistered = modules;
	this.getUserName();
}

public String getName(){
	String Name = firstName + " " + lastName;
	return Name;
}

public String getUserName(){
	userName = firstName + lastName + age;
	return userName;
}
}
