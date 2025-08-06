package Constructor_Assignment2;
class Car{
	String brand;
	Car(){
		brand = "ford";
	}
	public String getBrand() {
		return brand;
	}
}
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		String str = c.getBrand();
		System.out.println("Car Brand: " +str);
	}

}
