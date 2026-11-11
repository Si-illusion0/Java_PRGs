package practiceprgs;

import java.util.Scanner;

public class LargestArrrayNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[5];
		System.out.println("Enter 5 numbers:");
		for (int i = 0; i < 5; i++) {
			ar[i] = sc.nextInt();
		}
		int largest = ar[0];
		for (int i = 1; i < 5; i++) {

			if (ar[i] > largest) {
				largest = ar[i];
			}
		}
		System.out.println("Largest number = " + largest);

	}

}
