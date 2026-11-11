package iterativestatements;

public class Whilesum {

	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=10) {
			sum=sum+i; // sum=0+1=1 , sum=1+2=3, .....
			i++;
			
		}System.out.println("Sum is : "+sum);

	}

}
