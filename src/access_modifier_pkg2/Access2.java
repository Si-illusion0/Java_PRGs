package access_modifier_pkg2;

import access_modifier_pkg.Access_Modifierprgm;

public class Access2 extends Access_Modifierprgm{ //Access2 is the the child class of Access_Modifierprgm

	public static void main(String[] args) {
		Access2 amp = new Access2();
		//System.out.println("Private variable = "+amp.a); // a is a private variable so it can't be accessed here
		//System.out.println("Default variable = "+amp.b); //b is a default variable so it can't be accessed here
		System.out.println("Protected variable = "+amp.c);
		System.out.println("Public variable = "+amp.d);

	}

}
