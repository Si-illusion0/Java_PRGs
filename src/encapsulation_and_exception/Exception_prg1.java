package encapsulation_and_exception;

public class Exception_prg1 {

	public static void main(String[] args) {
		try {
		String name = null;
		System.out.println(name.length());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
