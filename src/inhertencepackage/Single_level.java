package inhertencepackage;

class Parent{	//parent class
	int a=5;
	public void parentmethod() {
		System.out.println("ParentMethod");
	}
}


class Child extends Parent{	//child class which inherits the properties of class parent
	public void childmethod() {
		System.out.println("ChildMethod");
	}
}



public class Single_level {

	public static void main(String[] args) {
		Child obj = new Child();
		System.out.println("Value of a : "+obj.a); //calling parent class variable using child class object
		obj.parentmethod(); //calling parent class method using child class
		obj.childmethod();
	}

}
