package inhertencepackage;

class Moblie{
	public void mobliemethod() {
		System.out.println("Moblie class method");
	}
}class Samsung extends Moblie{ //Inherit from class mobile
	public void samsungmeth() {
		System.out.println("Samsung Method");
	}
}

class Iphone extends Moblie{  //Inherit from class mobile
	public void iphonemeth() {
		System.out.println("Iphone Method");
	}
}



public class Hierarchial_pgm {

	public static void main(String[] args) {
		Samsung sobj=new Samsung();
		sobj.mobliemethod();
		sobj.samsungmeth();
		
		Iphone iobj = new Iphone();
		iobj.mobliemethod();
		iobj.iphonemeth();

	}

}
