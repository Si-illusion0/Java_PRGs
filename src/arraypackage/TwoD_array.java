package arraypackage;

import java.util.Scanner;

public class TwoD_array {

	public static void main(String[] args) {
		// 2X3 Matrix
		// 2 rows
		// 3 columns
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];
//		arr[0][0]=5; //0th row 0th col
//		arr[0][1]=6; //0th row 1st col
//		arr[0][2]=2; //0th row 2nd col
//		arr[1][0]=7; //1st row 0th col

		System.out.println("Enter the values:");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("The values are :");
		for (int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {

				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

	}

}
