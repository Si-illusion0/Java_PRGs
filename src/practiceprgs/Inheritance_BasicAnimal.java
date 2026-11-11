package practiceprgs;

interface Basicanimal{
	abstract public void eat();
	abstract public void sleep();	
}

class Monkey{
	public void jump() {
		System.out.println("Monkey is jumping");
	}
	public void bite() {
		System.out.println("Monkey is bite");
	}
}

class Human extends Monkey implements Basicanimal{

	public void speak() {
		System.out.println("Human is speaking");
	}
	@Override
	public void eat() {
		System.out.println("Human is eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("Human is sleeping");
		
	}
	
}
public class Inheritance_BasicAnimal {

	public static void main(String[] args) {
		Human h = new Human();
		h.bite();
		h.eat();
		h.jump();
		h.sleep();
		h.speak();

	}

}
