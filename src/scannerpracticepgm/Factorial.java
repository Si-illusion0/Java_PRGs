package scannerpracticepgm;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int num;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Numbers : ");
		num =sc.nextInt();
		
		int f=1;
		for(int i=1;i<=num;i++) {
			f=f*i;
		}System.out.println("Factorial = "+f);

	}

}
