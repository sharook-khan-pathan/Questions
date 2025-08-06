package Constructor_Assignments;
class Person1 {
	String name;
	int age;
	String salary;
	Person1(String name ,int age){
		this.name = name;
		this.age = age;
		//this.salary = salary;
	}
	Person1(	String salary){
		this.salary = salary;

	}
	void introduce(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);

	}
	
}
class Employee extends Person1{
	//String salary;
	Employee(String salary){
		super(salary);
	}
	void displaySalary() {
		System.out.println("Salary: " +salary);
	}
	
}
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p = new Person1("sharook",21);
		p.introduce();
		Employee e = new Employee("20000");
		e.displaySalary();
		
	}

}
