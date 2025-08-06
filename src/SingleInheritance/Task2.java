package SingleInheritance;
class Employee{
	double HRA = 0.2;
	double DA = 0.1;
	double PF = 0.12;
}
class Salary extends Employee{
	double salary;
	Salary(double salary){
		this.salary = salary;
	}
	void show() {
		double hraAmount = HRA * salary;
        double daAmount = DA * salary;
        double pfAmount = PF * salary;
		double net_sal = salary + hraAmount + daAmount - pfAmount;
		System.out.println("Net Salary: "+net_sal);
	}
}
public class Task2 {
	public static void main(String args[]) {
		Salary s =new Salary(30000);
		s.show();
	}
}
