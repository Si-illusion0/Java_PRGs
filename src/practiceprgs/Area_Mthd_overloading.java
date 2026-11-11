package practiceprgs;

public class Area_Mthd_overloading {
	
	public void area(int s) {
		System.out.println("Area of square : "+(s*s));
	}
	
	public void area(int l,int w) {
		System.out.println("Area of rectangle : "+(l*w));
	}
	
	public void area(double b,double h) {
		System.out.println("Area of triangle : "+(.5*b*h));
	}

	public static void main(String[] args) {
		Area_Mthd_overloading ar = new Area_Mthd_overloading();
		ar.area(6);
		ar.area(5, 3);
		ar.area(8.5, 5);

	}

}
