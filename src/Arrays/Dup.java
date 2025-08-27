package Arrays;

import java.util.Arrays;

public class Dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,3,4,1,2,5,6,7,2,3};
		int n = a.length;
		int temp[] = new int[n];
		int j = 0;
		for(int i = 0; i < n; i++) {
			boolean flag = false;
			for(int k = 0; k < n; k++) {
				if(a[i] == temp[k]) {
					flag = true;
					break;
				}
			}
			if(!flag)
				temp[j++] = a[i];
		}
		System.out.println(Arrays.toString(temp));
		for(int i = 0; i < j; i++) {
			System.out.print(temp[i]+" ");
		}
	}

}
