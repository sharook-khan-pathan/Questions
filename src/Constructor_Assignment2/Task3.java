package Constructor_Assignment2;
class Circle{
	double radius;
	double area;
	Circle(){
		radius = 1;
	}
	Circle(double radius){
		this.radius = radius;
	}
	public double getArea() {
		area = 3.14 * radius *radius;
		return area;
	}
	public double getRadius() {
		return radius;
	}
}
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(2.0);
		Circle c2 = new Circle(12);
		Circle c3 = new Circle(24);
		Circle c4 = new Circle();
		System.out.println("Radius: "+c1.getRadius() + " Area of circle : "+c1.getArea());
		System.out.println("Radius: "+c2.getRadius() + " Area of circle : "+c2.getArea());
		System.out.println("Radius: "+c3.getRadius() + " Area of circle : "+c3.getArea());
		System.out.println("Radius: "+c4.getRadius() + " Area of circle : "+c4.getArea());



		
	}

}
