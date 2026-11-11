package polymorphism_package;

class Parent{
	public void qual() {
		System.out.println("BCA");
	}
}

class Child extends Parent{
	//right click - source - override/implement methods
	
	@Override
	public void qual() {
		
		System.out.println("B.Tech");
		super.qual(); //calling immediate parent class method
	}
	
}
public class Overriding_Mthd {

	
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.qual();
		
		
//		Parent pa = new Parent();
//		pa.qual();

	}

}
