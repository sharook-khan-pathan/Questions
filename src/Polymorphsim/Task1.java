package Polymorphsim;
class Calculator{
	void multiply(int a,int b) {
		System.out.println("Multiply two intergers: "+a*b);
	}
	void multiply(int a,int b,int c) {
		System.out.println("Multiply Three intergers: "+a*b*c);
	}
	void multiply(double a,int b) {
		System.out.println("Multiply double n interger: "+a*b);
	}
}
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		c.multiply(5, 5);
		c.multiply(5, 5,5);
		c.multiply(6, 4);
	}

}
