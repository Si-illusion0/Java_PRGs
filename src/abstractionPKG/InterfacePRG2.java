package abstractionPKG;

interface Tvremote{
	abstract public void poweron();
	abstract public void poweroff();
}

interface Smarttv extends Tvremote{ //Inherit one  interface to another using extends keyword
	abstract public void display();
}

class Sumsang implements Smarttv{ // smart tv has already inherited the properties of Tvremote

	@Override
	public void display() {
		System.out.println("Display Method");
		
	}

	@Override
	public void poweron() {
		System.out.println("Power On Method");
		
	}

	@Override
	public void poweroff() {
		System.out.println("Power Off Method");
		
	}
	
}


public class InterfacePRG2 {

	public static void main(String[] args) {
		Sumsang s = new Sumsang();
		s.display();
		s.poweron();
		s.poweroff();

	}

}
