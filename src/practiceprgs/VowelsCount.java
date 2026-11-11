package practiceprgs;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentance : ");
		String s = sc.nextLine();
		char c[]=s.toCharArray();
		int v=0;
		for(char t:c) {
			if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u') {
				v++;
			}
		}System.out.println("Vowels are : "+v);
	}

}
