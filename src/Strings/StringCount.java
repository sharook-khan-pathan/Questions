package Strings;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "refrigerator";
		int count = 0;
		for(int i = str.length()-1; i >= 0; i--) {
			count++;
		}
		System.out.println(count);
	}

}
