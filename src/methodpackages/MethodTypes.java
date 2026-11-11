package methodpackages;

public class MethodTypes {

	public static void main(String[] args) {
		
		MethodTypes obj = new MethodTypes();
		//obj.add(2,5);
		int res = obj.add(2,5); //to store the res to a variable
		System.out.println("Addition :"+res);
		
		obj.sub(); //calling the method sub
		
		obj.mul(7, 6); // calling method mul() and passing parameters
		
		
		int value=obj.div();// calling method div to store the result
		System.out.println("Division : "+value);
		//System.out.println(obj.div());
	}
	
	//Methods
	//1. with parameter and with return type
	public int add(int a, int b) {
		return a+b; // the value will returned to the main method
	}
	
	//2.without parameter and without return type
	int x=10,y=5;
	public void sub() {
		System.out.println("Substraction :" +(x-y));
	}
	
	//3.method with parameter and without return type
	public void mul(int a,int b) {
		System.out.println("Multiplication :"+(a*b));
	}
	
	//4.method without parameter and with return type
	public int div() {
		return x/y;
	}

}
