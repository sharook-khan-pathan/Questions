package Encapsluation;
class LightBulb{
	boolean isOn = false;
	public void turnOn() {
		this.isOn = true;
	}
	public boolean getIsOn() {
		return isOn;
	}
	public void turnOff() {
		this.isOn = false;
	}
	public boolean getIsOff() {
		return isOn;
	}
}
public class Task4 {
	public static void main(String args[]) {
		LightBulb b = new LightBulb();
		System.out.println("Initial: "+b.getIsOn());
		b.turnOn();
		System.out.println("Trun On: "+b.getIsOn());
		b.turnOff();
		System.out.println("Trun Off: "+b.getIsOn());

		
	}
}
