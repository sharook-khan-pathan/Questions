package Arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,6,2,3,4,5,9,8};
		int n = 9;
		int accSum = 0;
		int sum = n * (n + 1) / 2;
		for(int i : arr)
			accSum = accSum + i;
		int me = sum - accSum;
		System.out.println(me);
	}

}
