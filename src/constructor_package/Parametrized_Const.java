package constructor_package;

public class Parametrized_Const {
	int age;
	String name;

	//syntax to create a parameterized constructor - access modifier classname(parameters){}
	
	public Parametrized_Const(int age , String name) {
		this.age=age; //this.age refer to the instance variable
		this.name=name; //this.name refer to the instance variable
	}
	
	public void display() {    	//normal method
		System.out.println("Age : "+age);
		System.out.println("Name : "+name);
	}
	public static void main(String[] args) {
		Parametrized_Const obj = new Parametrized_Const(10,"Sankar"); // the call is passed to parametrized constructor and the value will be assigned to instance variable
		obj.display();

	}

}
