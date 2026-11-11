package abstractionPKG;

abstract class Parent{  //abstract class
	abstract public void display(); //abstract method - method without implementations

	public void normalMthd() { // it a normal method without implementation
		System.out.println("Normal Method");
	}
}

class Child extends Parent{

	@Override
	public void display() { //Overriding abstract method 
		System.out.println("Absract Method");
		
	}
}

public class AbstractiomPRGM {

	public static void main(String[] args) {
		Child c = new Child();
		c.display(); // calling abstract method using child class object
		c.normalMthd(); // calling normal method using child class object

	}

}
