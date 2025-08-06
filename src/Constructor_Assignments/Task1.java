package Constructor_Assignments;
class Person{
	String name;
	int age;
	Person(String name ,int age){
		this.name = name;
		this.age = age;
	}
	void introduce(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);

	}
}
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("sharook",21);
		p.introduce();
	}

}
