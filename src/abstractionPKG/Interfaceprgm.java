package abstractionPKG;

interface Bike {
	
	abstract public void speedlimit(); //by default access modifier - public
	public void accelarate();
	
	//public void bikemthd(); //it shows an error. You can hover on the class name and choose “Add unimplemented 

}

class Honda implements Bike
{
	@Override
	public void speedlimit()
	{
		System.out.println("Honda Speed limit");
	}

	@Override
	public void accelarate() {
		System.out.println("Honda accelaration");
	}

//	@Override
//	public void bikemthd() {
//		System.out.println("bikemthd");
//	}

}

public class Interfaceprgm {

	public static void main(String[] args) {
		
		//creating object using interface reference
		Bike obj=new Honda();  //interface interface ref name=new classname();
		obj.speedlimit();
		obj.accelarate();
		
		//we cannot call class methods using an interface reference. Only interface methods can be call

	}

}
