package Arrays;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		int arr[] = new int[arr1.length+arr2.length];
		int j = 0;
		for(int i = 0; i < arr1.length; i++) {
			arr[j] = arr1[i];
			j++;
		}
		for(int i = 0; i < arr2.length; i++) {
			arr[j] = arr2[i];
			j++;
		}
		System.out.println(Arrays.toString(arr));
		int[] u = Arrays.stream(arr).distinct().toArray();
		System.out.println(Arrays.toString(u));
		
	}

}
