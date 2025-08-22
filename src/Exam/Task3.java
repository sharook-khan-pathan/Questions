package Exam;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,2,6,4,5,8,2,1,7,9,1,2,3,6,7,4,4,6,4,8}; 
		boolean occur[] = new boolean[arr.length];
		for(int i = 0 ; i < arr.length; i++) {
			if(occur[i])
				continue;
			int count = 1;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					occur[j] = true;
					count++;
				}
			}
			System.out.println(arr[i]+" Occurs "+count+" times");
		}
	}

}
