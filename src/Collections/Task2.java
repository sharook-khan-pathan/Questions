package Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("Hyderabad");
		al.add("Mumbai");
		al.add("Delhi");
		al.add("Chennai");
		al.add("Banglore");
		for(int i = al.size() - 1; i >= 0; i--) {
			System.out.println(al.get(i));
		}
		
				
			
		
		
	}

}
