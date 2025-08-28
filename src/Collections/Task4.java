package Collections;
import java.util.*;
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
		System.out.println(l);
		l.removeFirst();
		l.removeLast();
//		for(Object ob : l) {
//			System.out.println(ob);
//		}
		ListIterator it = l.listIterator();
		while(it.hasNext())
			System.out.print(it.next() + " ");
		System.out.println();
		while(it.hasPrevious())
			System.out.print(it.previous() + " ");
		
	}

}
