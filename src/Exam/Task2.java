package Exam;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] sudoku = {
	            {5, 3, 4, 6, 7, 8, 9, 1, 2},
	            {6, 7, 2, 1, 9, 5, 3, 4, 8},
	            {1, 9, 8, 3, 4, 2, 5, 6, 7},
	            {8, 5, 9, 7, 6, 1, 4, 2, 3},
	            {4, 2, 6, 8, 5, 3, 7, 9, 1},
	            {7, 1, 3, 9, 2, 4, 8, 5, 6},
	            {9, 6, 1, 5, 3, 7, 2, 8, 4},
	            {2, 8, 7, 4, 1, 9, 6, 3, 5},
	            {3, 4, 5, 2, 8, 6, 1, 17, 9}
	        };
		int temp = 0;
		for(int i = 0;i < 9;i++) {
//			if(sudoku[i][0] > 0 && sudoku[i][0] < 10) {
//				temp = sudoku[i][0];
//			}
//			else {
//				System.out.println("error");
//				break;
//			}
			for(int j = 0;j < sudoku[i].length;j++) {
				if(sudoku[i][j] > 0 && sudoku[i][j] < 10) {
					if(temp == sudoku[i][j]) {
						System.out.println("Error");
					}
					else {
						temp = sudoku[i][j];
					}
				}
				else {
					System.out.println("Error");
				}
			}
		}
	}

}
