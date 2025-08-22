package Exam;

public class Task4 {

	public static void main(String[] args) {
		int[][] matrix = {
		    {1, 2, 3},
		    {4, 5, 6},
		    {7, 8, 9}
		};
		for (int j = 0; j < 3; j++) {
			System.out.print(matrix[0][j]);
		}
		for (int i = 1; i < 3; i++) {
			System.out.print(matrix[i][2]);
		}
		for (int j = 1; j >= 0; j--) {
			System.out.print(matrix[2][j]);
		}
		for (int i = 1; i > 0; i--) {
			System.out.print(matrix[i][0]);
		}
		System.out.print(matrix[1][1]);
	}

}