package Arrays;

public class PrimeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0 ; i < arr.length; i++) {
			if(arr[i] == 0 || arr[i] == 1)
				continue;
			else {
				boolean flag = false;
				for(int j = 2; j <= arr[i]/2; j++) {
					if(arr[i] % j == 0) {
						flag = true;
						break;
					}	
				}
				if(!flag)
					System.out.println(arr[i]);
			}
		}
	}

}
