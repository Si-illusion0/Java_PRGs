package inhertencepackage;

class Animal{  //parent class
	int a =5;
	public void animalmetod() {
		System.out.println("Animal Class Method");
	}
}

class Dog extends Animal{  //child class of animal
	public void dogmethod() {
		System.out.println("Dog Class Method");
	}
}

class Puppy extends Dog{  //child class of dog
	public void puppymethod() {
		System.out.println("Puppy Class Method");
	}
}


public class Multi_level {

	public static void main(String[] args) {
		Puppy obj = new Puppy();
		System.out.println("Value of a : "+obj.a); //calling parent class(Animal) variable using child class object
		obj.animalmetod();  //calling parent class method(animal) using child class object
		obj.dogmethod();  //calling parent class (dog) method using child class object
		obj.puppymethod(); //calling parent class (puppy) method using child class object
 
	}

}
