package methodpackages;

public class AreaPgms {
	

	public static void main(String[] args) {
		AreaPgms obj=new AreaPgms();
		obj.tri();
		obj.cri(4);
		int rectangle=obj.rect();
		System.out.println("Area of rectangle :"+rectangle);
		int v=obj.sq(5);
		System.out.println("Area of square :"+v);
		

	}
	
	//1.without parameter and without return type
	public void tri() {
		double b=10;
		double h=6;
		double at=0.5*b*h;
		System.out.println("Area of triangle :"+at);
	}
	
	//2.with parameter and without return type
	public void cri(double r) {
		double areac= 3.14*r*r;
		System.out.println("Area of cricle :"+areac);
	}
	
	//3.without parameter and with return type
	public int rect() {
		int l=10;
		int w=5;
		return l*w;
	}
	//4.with parameter and with return type
	public int sq(int s) {
		return s*s;
	}

}
