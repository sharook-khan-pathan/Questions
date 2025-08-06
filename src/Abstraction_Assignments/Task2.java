package Abstraction_Assignments;
abstract class Vehicle{
	abstract void startEngine();
	abstract void stopEngine();
}
class Car extends Vehicle{
	void startEngine() {
		System.out.println("Car Engine started");
	}
	void stopEngine() {
		System.out.println("Car Engine stoped");
	}
}
class Truck extends Vehicle{
	void startEngine() {
		System.out.println("Truck Engine started");
	}
	void stopEngine() {
		System.out.println("Truck Engine stoped");
	}
}
class Bike extends Vehicle{
	void startEngine() {
		System.out.println("Bike Engine started");
	}
	void stopEngine() {
		System.out.println("Bike Engine stoped");
	}
}
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] v = {new Car(),new Truck(), new Bike()};
		for(Vehicle i : v) {
			i.startEngine();
			i.stopEngine();
			System.out.println();
		}
	}

}
