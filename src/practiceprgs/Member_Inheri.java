package practiceprgs;


class Member{
	int age;
	int salary;
	String name;
	
	public void printdet() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
	}
	
}


class Emp extends Member{
	String specification;
	public void empdetails() {
		System.out.println("Specification : "+specification);
	}
}

class Manger extends Member{
	String dept;
	public void mangerdetails() {
		System.out.println("Department : "+dept);
	}
}
public class Member_Inheri {

	public static void main(String[] args) {
		Emp em = new Emp();
		em.name="siva";
		em.age=21;
		em.salary=55000;
		em.specification="Software Testing";
		System.out.println("Empoyee Details");
		em.printdet();
		em.empdetails();
		
		Manger man = new Manger();
		man.age=45;
		man.name="sankar";
		man.salary=77000;
		man.dept="Software";
		man.printdet();
		man.mangerdetails();

	}

}
