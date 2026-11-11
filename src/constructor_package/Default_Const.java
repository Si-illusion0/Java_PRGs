package constructor_package;

public class Default_Const {
	int age;
	String name;

	public static void main(String[] args) {
		Default_Const obj = new Default_Const();// Default_Const()- it is a default constructor without parameter
		obj.display();

	}
	public void display() {
		System.out.println("Age : "+age); //age=0 as by default constructor
		System.out.println("Name : "+name); //name=null as it act as default constructor
	}

}
