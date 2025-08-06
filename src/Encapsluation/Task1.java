package Encapsluation;
class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age > 0) {
			this.age = age;

		}
		else {
			this.age = 0;
		}
	}
	
	
}
public class Task1 {
	public static void main(String args[]) {
		Person p = new Person();
		p.setAge(-5);
		p.setName("Sharook");
		System.out.println("Name: "+p.getName());
		System.out.println("Age: "+p.getAge());
	}

}
