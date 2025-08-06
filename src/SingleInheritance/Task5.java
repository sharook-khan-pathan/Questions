package SingleInheritance;
class Vechicle{
	String type;
	Vechicle(String type){
		this.type = type;
	}
}
class Car extends Vechicle{
	String type;
	Car(String basetype,String derivedtype){
		super(basetype);
		this.type = derivedtype;
	}
	void displayType() {
		System.out.println("Vechicle Type: "+super.type);

	}
	void displayCarType() {
		System.out.println("Car Type: "+type);
	}
	
}
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c =new Car("Car","Pertol");
		c.displayType();
		c.displayCarType();
	}

}
