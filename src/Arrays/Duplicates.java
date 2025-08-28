package Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,31,4,6,4,5,6,7,8,9,9,8,7,6,5,5,5,2,1,3};
		int n = arr.length;
		int temp[] = new int[n];
		
		//General Approach
		int j = 0;
		for(int i = 0; i < n ; i++) {
			boolean flag = false;
			for(int k = 0; k < j;k++) {
				if(arr[i] == temp[k]) {
					flag = true;
					break;
				}
			}
			if(!flag)
				temp[j++] = arr[i];
		}
		int s = n - j;
		System.out.println(s);
		int[] u = Arrays.copyOf(temp, j);
		System.out.println(Arrays.toString(u));
		
		//Using HashSet
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i : arr) {
			h.add(i);
		}
		int[] unique = h.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(unique));
        
        //Normal Approach
        int[] a = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(a));
				
	}

}
