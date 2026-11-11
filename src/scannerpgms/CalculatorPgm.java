package scannerpgms;

import java.util.Scanner;

public class CalculatorPgm {

	public static void main(String[] args) {
		int a,b;
		char op;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Num1 : ");
		a =sc.nextInt();
		System.out.println("Enter Num2 : ");
		b=sc.nextInt();
		System.out.println("Enter the operator : ");
		op=sc.next().charAt(0);
		
		switch(op) {
		case '+':System.out.println("Sum ="+(a+b));
		break;
		
		case '-':System.out.println("Substraction ="+(a-b));
		break;
		
		case '*':System.out.println("Multiply ="+(a*b));
		break;
		
		case '/':System.out.println("Division ="+(a/b));
		break;
		
		default : System.out.println("Invalid input");

	}

}
}
