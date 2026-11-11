package conditionalstatements;

public class Nestedifpgm {

	public static void main(String[] args) {
		int age=21 , weight=47;
		if (age >=18) 
		{
			if(weight >= 50) 
			{
				System.out.println("Eligiable for blood donation"); // Result will be returned only if both conditions are met
			}else 
			{
				System.out.println("Underweight"); //Result will be returned if condition2 is false
			}
			
		}else {
			System.out.println("The age is low"); //Result will be returned if condition1 is false
		}

	}

}
