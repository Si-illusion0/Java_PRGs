package encapsulation_and_exception;

public class Exception_prg {

	public static void main(String[] args) {
		try { //Contains code which may contain exception 
		int a=10;
		int b=0;
		double c=a/b;
		System.out.println("Value after divisio : "+c);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println("Hello");//Executes only after successfully complete the prg

	}

}
