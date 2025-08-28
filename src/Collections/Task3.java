package Collections;
import java.util.*;
public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al1 = new ArrayList<String>();
		al1.addAll(Arrays.asList("sharook","khan","pathan"));
		ArrayList<String> al2 = new ArrayList<String>();
		al2.addAll(Arrays.asList("mohan","manoj"));
		al2.addAll(al1);
		System.out.println(al2);
		al2.addAll(Arrays.asList("manoj","pathan"));
		System.out.println(al2);
		for(int i = 0 ; i < al2.size(); i++) {
			for(int j = i + 1; j < al2.size(); j++ ) {
				if(al2.get(i) == al2.get(j)) {
					al2.remove(j);
				}
			}
		}
		System.out.println(al2);
		
		
	}

}
