package Abstraction_Assignments;

import java.util.Arrays;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,4,6,8,0,0};
        //boolean isOccur = false;
        int b[] = new int[12];
        int index = 0;
        int count = 0;
        for(int i = 0; i <  a.length; i++) {
            boolean isOccur = false;
            if(a[i] == 0){
            	count++;
            	continue;
            }
            else {
	        	for(int j =0; j < b.length - 1; j++) {
	        		if(a[i] == b[j]) {
	                    isOccur = true;
	                    break;
	        		}
	        	}
            }
        	if(!isOccur) {
        		b[index] = a[i];
        		index++;
        	}   
        }
        for(int i = 0; i < count; i++) {
        	b[index] = 0;
        	index++;
        }
         
       int c[] = Arrays.copyOf(b, index);
       System.out.println(Arrays.toString(c));
       int d[] = new int[c.length-count];
       for(int i = 0; i < d.length; i++) { 
    		   d[i] = -1;
       }
       int evenpos = 0;
       int oddpos = 1;
       for(int i = 0; i < c.length-2; i++) {
    	   if(c[i]%2!=0 &&  oddpos < d.length) {
    		  d[oddpos] = c[i];
    		  oddpos += 2;
    	   }
    	   else if(c[i] % 2 == 0 && evenpos < d.length) {
               d[evenpos] = c[i];
               evenpos += 2;
           }
       }
       System.out.println(Arrays.toString(d));
	}

}
