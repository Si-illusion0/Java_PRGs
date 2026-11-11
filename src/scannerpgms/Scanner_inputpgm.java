package scannerpgms;

import java.util.Scanner;

public class Scanner_inputpgm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Roll Number : ");
		int a=sc.nextInt();
		
		System.out.println("Enter Name : ");
		String n=sc.next();
		
		sc.nextLine();
		
		System.out.println("Enter Address : ");
		String ad=sc.next();
		
		System.out.println("Grade : ");
		char g=sc.next().charAt(0);
		
		System.out.println("Enter Height : ");
		double d=sc.nextDouble();
		
		System.out.println("Roll Number : "+a);
		System.out.println("Name : "+n);
		System.out.println("Address : "+ad);
		System.out.println("Grade : "+g);
		System.out.println("Height : "+d);
		

	}

}
