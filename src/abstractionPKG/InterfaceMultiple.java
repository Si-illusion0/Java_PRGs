package abstractionPKG;

interface BikeDetails{
	abstract public void color();
	abstract public void speed();
}

interface Vehicle{
	abstract public void model();
}

class Yamaha implements BikeDetails , Vehicle{

	@Override
	public void model() {
		System.out.println("Model Method");
		
	}

	@Override
	public void color() {
		System.out.println("Colour Method");
		
	}

	@Override
	public void speed() {
		System.out.println("Speed Method");
		
	}
	
}


public class InterfaceMultiple {

	public static void main(String[] args) {
		Yamaha y = new Yamaha();
		y.color();
		y.model();
		y.speed();

	}

}
