package conditionalstatements;

public class Switchpgm {

	public static void main(String[] args) {
		int n=5;
		
		switch(n) 
		{
			case 1: System.out.println("Sunday");
			break; // to stop the switch after the matching case is executed
			
			case 2: System.out.println("Monday");
			break;
			
			case 3: System.out.println("Tuesday");
			break;
			
			case 4: System.out.println("Wednesday");
			break;
			
			case 5: System.out.println("Thusday");
			break;
			
			case 6: System.out.println("Friday");
			break;
			
			case 7: System.out.println("Saturday");
			break;
			
			default : System.out.println("Invalid input");
		}

	}

}
