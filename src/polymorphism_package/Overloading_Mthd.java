package polymorphism_package;

public class Overloading_Mthd {
	
	
	public void add(int a,int b) {
		System.out.println("Method 1 : "+(a+b));
	}
	
	public void add(int a,int b,int c) {
		System.out.println("Method 2 : "+(a+b+c));
	}
	
	public void add(int a,double b) {
		System.out.println("Method 3 : "+(a+b));
	}
	
	public void add(double a,int b) {
		System.out.println("Method 4 : "+(a+b));
	}
	

	
	
	public static void main(String[] args) {
		Overloading_Mthd ovr = new Overloading_Mthd();
		ovr.add(2, 4, 6);//method 2
		ovr.add(3, 2);//method 1
		ovr.add(2.5, 4); //method 4
		ovr.add(4, 4.5); //method 3

	}

}
