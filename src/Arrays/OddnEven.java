package Arrays;

public class OddnEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int odd = 0;
		int even = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0)
				even++;
			else
				odd++;
		}
		System.out.println("Evens: "+even);
		System.out.println("Odd: "+odd);
	}

}
