package scannerpracticepgm;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Numbers : ");
		num =sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}

	}

}
