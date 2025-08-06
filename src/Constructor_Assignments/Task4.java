package Constructor_Assignments;
class Student{
	String name;
	int age;
	double GPA;
	Student(String name,int age,double GPA){
		this.name = name;
		this.age = age;
		this.GPA = GPA;
	}
	Student(String name,double GPA){
		this.name = name;
		
		this.GPA = 0.0;
	}
	void displayGPA() {
		System.out.println("GPA : "+GPA);
	}
}
public class Task4 {

	public static void main(String[] args) {
		
		Student s1 = new Student("Sharook",21,7.8);
		Student s2 = new Student("Sharook",7.8);
		s1.displayGPA();
		s2.displayGPA();

	}

}
