package Exam;
import java.util.*;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch;
		int[][] tickets =new int[10][10];
		boolean[][] status =new boolean[10][10];

		for(int i = 0;i < 10;i++) {
			for(int j = 0;j < 10;j++) {
				tickets[i][j] = 0;
			}
		}
		for(int i = 0;i < 10;i++) {
			for(int j = 0;j < 10;j++) {
				System.out.print(tickets[i][j]+" ");
			}
			System.out.println();
		}
		boolean flag = true;
		while(flag) {
//			for(int i = 0;i < 10;i++) {
//				for(int j = 0;j < 10;j++) {
//					System.out.print(tickets[i][j]+" ");
//				}
//				System.out.println();
//			}
			System.out.println("=====================");
			System.out.println("1.For Booking Tickets"+"\n"+"2.Cancel Tickets"+"\n"+"3.exit"+"\n"+"4.Print Status");
			System.out.println("=====================");
			System.out.println("Enter your Choice:");

			ch = sc.nextInt();
			switch(ch) {
				case 1:
					int row,col;
					System.out.println("Enter the row:");
					row = sc.nextInt();
					System.out.println("Enter the col:");
					col = sc.nextInt();
					tickets[row-1][col-1] = 1;
					status[row-1][col-1] = true;
					System.out.println("Ticked Booked");
					break;
				case 2:
					int row1,col1;
					System.out.println("Enter the row:");
					row1 = sc.nextInt();
					System.out.println("Enter the col:");
					col1 = sc.nextInt();
					tickets[row1-1][col1-1] = 0;
					status[row1-1][col1-1] = false;

					System.out.println("Ticked Cancled");
					break;
				case 3:
					flag = false;
					break;
				case 4:
					for(int i = 0;i < 10;i++) {
						for(int j = 0;j < 10;j++) {
							System.out.print(status[i][j]+" ");
						}
						System.out.println();
					}
			}
		}

	}

}
