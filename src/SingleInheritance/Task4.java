package SingleInheritance;
class Shape{
	void draw() {
		System.out.println("Shape class Method");
	}
}
class Circle extends Shape{
	void drawCircle() {
		System.out.println("Circle Class Method");
	}
}
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();
		c.draw();
		c.drawCircle();
	}

}
