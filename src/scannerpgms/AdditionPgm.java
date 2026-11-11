package scannerpgms;

import java.util.Scanner;

public class AdditionPgm {

	public static void main(String[] args) {
		
		int a,b;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter 2 Numbers : ");
		a =sc.nextInt();
		b=sc.nextInt();
		
		int s;
		
		System.out.println("Sum = "+(a+b));
		
	}

}
