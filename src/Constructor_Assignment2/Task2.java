package Constructor_Assignment2;
class Student{
	String sname;
	Student(){
		sname = "Unknown";
	}
	Student(String sname){
		this.sname = sname;
	}
	
}
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Sharook");
		Student s2 = new Student();
		System.out.println("Student1 Name: "+s1.sname);
		System.out.println("Student2 Name: "+s2.sname);


	}

}
