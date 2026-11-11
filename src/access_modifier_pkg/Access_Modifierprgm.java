package access_modifier_pkg;

public class Access_Modifierprgm {
	private int a = 10;//Private variable
	int b = 15;//default variable
	protected int c = 20;//protected variable
	public int d = 25;//public variable
	
	
	public static void main(String[] args) {
		Access_Modifierprgm amp = new Access_Modifierprgm();
		System.out.println("Private variable = "+amp.a);
		System.out.println("Default variable = "+amp.b);
		System.out.println("Protected variable = "+amp.c);
		System.out.println("Public variable = "+amp.d);

	}

}
