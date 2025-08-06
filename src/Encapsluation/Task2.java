package Encapsluation;
class Rectangle{
	private int length;
	private int width;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void getArea() {
		System.out.println("Area: "+length*width);
	}
	public void getPerimeter() {
		System.out.println("Perimeter: "+(2*(length+width)));
	}
}
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();
		r.setLength(5);
		r.setWidth(5);
		r.getArea();
		r.getPerimeter();
	}

}
