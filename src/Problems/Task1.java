package Problems;
import java.util.*;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(true);
		al.add("sharook");
		al.add(10.10);
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Object val = it.next();
			if(val instanceof Boolean)
				System.out.println(val);
		}
	}

}
