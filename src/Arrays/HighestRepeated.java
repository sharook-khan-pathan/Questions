package Arrays;

public class HighestRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,3,2,1,4,5,2,3,6,7,1,2,3,1};
		int maxcount = 0;
		int repeated = -1;
		for(int i = 0; i < arr.length; i++) {
			int count = 0;
			for(int j = 0; j < arr.length; j++) {
				if(arr[j] == arr[i]) {
					count++;
				}
			}
			if(maxcount < count) {
				maxcount = count;
				repeated = arr[i]; 
			}
		}
		System.out.println(repeated +" repeated "+maxcount+" times");
	}

}
