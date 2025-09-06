package Problems;
import java.util.*;
class demo{
	demo(){
		
	}
	
}
public class NullValues {
    

    public static void main(String[] args) {
        HashMap  hs = new HashMap();
        hs.put(new demo(),'A');
        hs.put(new demo(),'B');
        System.out.println(hs);

      
        
    }
}

