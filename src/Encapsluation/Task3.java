package Encapsluation;
class Dog{
	private String name;
	private String breed;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getBreed() {
		return breed;
	}
	public void bark() {
		System.out.println("Woof! My name is "+name);
	}
}
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.setName("Rambo");
		d.setBreed("German Shepard");
		d.bark();
	}

}
