package arraypackage;

import java.util.Scanner;

public class Stringarraypgm {

	public static void main(String[] args) {
		String ar[]=new String[3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your names : ");
		
		for(int i=0;i<3;i++) {
			ar[i]=sc.next();
			
		}
		System.out.println("The array values are : ");
//		for(int i=0;i<3;i++) {
//		System.out.print(ar[i]+" ");
//}
		
		for (String v:ar) {
			System.out.print(v+" ");
		}

	}

}
