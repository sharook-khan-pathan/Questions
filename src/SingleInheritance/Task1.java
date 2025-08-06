package SingleInheritance;
class Rectangle{
	int len,width;
	Rectangle(int len,int width){
		this.len = len;
		this.width = width;
	}
}
class Area extends Rectangle{
	Area(int len,int width){
		super(len,width);
	}
	void show() {
		System.out.println("Area of Rectangle: "+len*width);
	}
}
public class Task1 {
	public static void main(String args[]) {
		Area a = new Area(5,5);
		a.show();
	}
}
