package encapsulation_and_exception;

class Employee{
	private int id=5;
	String name="John";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Encapsulation_prg {

	public static void main(String[] args) {
		Employee e = new Employee();
		//System.out.println("Value of ID "+e.id); //id is a private variable bcz it can't call
		
		//id
		System.out.println("Value od ID : "+e.getId());//accessing private variable 
		e.setId(10);//to update the value
		System.out.println("Value od ID(After update) : "+e.getId());
		
		//name
		System.out.println("Name : "+e.getName());
		e.setName("Ebin");
		System.out.println("Name (After update): "+e.getName());

	}

}
