package Strings;

public class EinUmbrella {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Umbrella";
		char[] s = str.toCharArray();
		boolean flag = false;
		for(int i = 0; i < s.length;i++) {
			if(s[i] == 'e') {
				flag = true;
				break;
			}
			
		}
		if(flag) {
			System.out.println(flag);
		}
		else {
			System.out.println(false);
		}
	}

}
