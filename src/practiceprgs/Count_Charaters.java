package practiceprgs;

import java.util.Scanner;

public class Count_Charaters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sentance :");
		String sen=sc.nextLine();
		
		int c=0;
		for(int i=0;i<sen.length();i++) {
			if(sen.charAt(i)!=' ') {
				c++;
			}
		}System.out.println("Number of characters :"+c);

	}

}
