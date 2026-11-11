package arraypackage;

import java.util.Scanner;

public class Singlearray {

	public static void main(String[] args) {
		int [] arr=new int [3];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		
		//arr[0]=1;
		//arr[1]=5;
		//arr[2]=10;
		
		for(int i=0;i<3;i++) {
			arr[i]= sc.nextInt();
		}
		
		System.out.println("The array is : ");
		for(int i=0;i<3;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
