package scannerpgms;

public class Varibletypes 
{

	int a; //instance variable
	int b=5; //instance variable
	static int c=10; //static variable
	
	
	public void display() 
	{
		System.out.println("The value of a= "+a);
		System.out.println("The value of b= "+b);
		System.out.println("The value of c= "+c);
		
		int x= 15; //local variable
		System.out.println("The value of x= "+x);
	}

	public static void main(String[] args) 
	{
		Varibletypes obj = new Varibletypes(); //object declaration
		obj.a=2; //assigning value to instance variable
		obj.display(); //calling method using object
		
		System.out.println("The value of instance varible= "+obj.b); //calling instance variable with the help of object
		
		System.out.println("The value of static variable ="+c); //calling static variable without using object
		//System.out.println(obj.x); //x is a local variable we can't call it outside display() method

	}

}
