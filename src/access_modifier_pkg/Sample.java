package access_modifier_pkg;

public class Sample {

	public static void main(String[] args) {
		Access_Modifierprgm amp = new Access_Modifierprgm(); //the variable are contains in Access_Modifierprgm class
		//System.out.println("Private variable = "+amp.a);//the variable is not visible bcus it is a private variable
		System.out.println("Default variable = "+amp.b);
		System.out.println("Protected variable = "+amp.c);
		System.out.println("Public variable = "+amp.d);

	}

}
