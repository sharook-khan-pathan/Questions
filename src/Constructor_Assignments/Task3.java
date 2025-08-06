package Constructor_Assignments;
class Rectangle{
	double length;
	double width;
	Rectangle(double length,double width){
		this.length = length;
		this.width = width;
	}
	void caluclate() {
		System.out.println("Area: "+(length*width));
	}
}
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(15.5,7.5);
		r.caluclate();
	}

}
