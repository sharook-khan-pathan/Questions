package Problems;
class Multiple{
	Multiple(){
		System.out.println("Hello");
	}
	public void show(int n) {
		if(n!=1) {
			new Multiple();
			show(n-1);
		}
	}
}
public class MultiObjects {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple m = new Multiple();
		m.show(1000);
	}
}
