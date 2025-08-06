package Abstraction_Assignments;
abstract class User{
	abstract void login();
	abstract void viewDashboard();
}
class Customer extends User{
	void login() {
		System.out.println("Customer Login Successfull");
	}
	void viewDashboard() {
		System.out.println("Customer Dashboard");
	}
}
class DeliveryPartner extends User{
	void login() {
		System.out.println("DeliveryPartner Login Successfull");
	}
	void viewDashboard() {
		System.out.println("DeliveryPartner Dashboard");
	}
}
class RestaurantOwner extends User{
	void login() {
		System.out.println("RestaurantOwner Login Successfull");
	}
	void viewDashboard() {
		System.out.println("RestaurantOwner Dashboard");
	}
}
public class Task4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User[] user = {new Customer(), new DeliveryPartner(), new RestaurantOwner() };
		for(User u : user) {
			u.login();
			u.viewDashboard();
			System.out.println();
		}
		
	}

}
