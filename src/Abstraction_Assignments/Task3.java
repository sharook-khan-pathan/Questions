package Abstraction_Assignments;
abstract class Employee{
	abstract void calculateSalary();
}
class FullTime extends Employee{
	void calculateSalary() {
		System.out.println("Full Time Empolyee Salary : 50,000");
	}
}
class PartTime extends Employee{
	void calculateSalary() {
		System.out.println("Part Time Empolyee Salary : 30,000");
	}
}
class FreeLancer extends Employee{
	void calculateSalary() {
		System.out.println("FreeLancer Empolyee Salary : 20,000");
	}
}
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] e = {new FullTime(), new PartTime(), new FreeLancer()};
		for(Employee i : e) {
			i.calculateSalary();
			System.out.println();
			//kjvdjbfdufsjcbkjsab
		}
	}

}
