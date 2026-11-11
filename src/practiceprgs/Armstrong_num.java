package practiceprgs;

import java.util.Scanner;

public class Armstrong_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value : ");
		
		int a =sc.nextInt();
		int res=0 ,r , t=a;
		
		while(a>0) {
		r=a%10;
		res=res+r*r*r;
		a=a/10;
		}
		if(t==res) {
			System.out.println("Num Is Armstrong");
		}else {
			System.out.println("Num is Not Armstrong");
		}

	}

}
