package conditionalstatements;

public class Switchpgm2 {

	public static void main(String[] args) {
		int a=15,b=5;
		char c='+';
		switch(c) {
		case '+':System.out.println(a+b);
		break;
		
		case '-':System.out.println(a-b);
		break;
		
		case '*':System.out.println(a*b);
		break;
		
		case '/':System.out.println(a/b);
		break;
		
		default : System.out.println("Invalid input");
		}

	}

}
