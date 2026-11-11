package conditionalstatements;

public class Elseifladder {

	public static void main(String[] args) {
		int a=5, b=2,c=13;
		if(a>b && a>c)
		{
			System.out.println("A is greater"); //will execute if A is greater
		}
		
		else if(b>a && b>c){
			System.out.println("B is greater"); //will execute if B is greater
		}
		
		else {
			System.out.println("C is greater"); //will execute if C is greater
		}

	}

}
