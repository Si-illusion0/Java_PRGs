package stringpackagepgm;

import java.util.Scanner;

public class Palindromeornot {

	public static void main(String[] args) {
		System.out.println("Enter a word");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();

		int len=s.length()-1;
		String r="";
		String temp=s;
		char value;

		for(int i=len;i>=0;i--) {
			//r=r+s.charAt(i);
			//or
			value=s.charAt(i);
			r=r+value;
		}
		System.out.println("Reverse : "+r);

		if(temp.equals(r)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}

	}

}
