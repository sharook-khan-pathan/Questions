package Problems;
import java.util.*;
public class Task4 {
	 
	 public static void main(String args[]) {
		 ArrayList<Integer> emp = new ArrayList<>();
		 emp.add(1);
		 emp.add(2);
		 emp.add(3);
		 emp.add(4);
		 emp.add(5);
		 HashSet hs = new HashSet(emp);
		 System.out.println(hs);
		 TreeSet ts = new TreeSet();
		 for(int i = 1 ; i <= 10; i++) {
			 ts.add(i);
		 }
		 System.out.println(ts);
		 Iterator it = ts.iterator();
		 while(it.hasNext()) {
			 Object o = it.next();
			 if(hs.contains(o)) {
				 System.out.println(o);
			 }
			 
		 }
	 }
}
