package polymorphism_package;

public class StaticFinal {
	int a=5;
	static String company="Luminar";
	final double pi=3.14;
	static final double pivalue=3.14;

	public static void main(String[] args) {
		StaticFinal obj = new StaticFinal();
		System.out.println("Value of a : "+obj.a);
		
		System.out.println("Value of company : "+company);//Company is a static variable , we can call it without the help of object
		company = "Luminar Technolab";//the value of static variable can be update
		System.out.println("Update value : "+company);
		
		System.out.println("Value of pi : "+obj.pi);
		//obj.pi=4.5; final variable can't be modified
		
		System.out.println("Value of pi : "+pivalue);//variable declare using static final can be call without help of object 
		

	}

}
