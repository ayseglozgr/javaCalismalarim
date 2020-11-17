package animal;

public class Animal {

	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog extends Animal {

	public void move() {
		System.out.println("Dogs can walk and run");
	}
}

 class Challenge {

	public static void main(String args[]) {
        Animal a = new Animal();
        a.move();
        a = new Dog();
        a.move();            
	}
}
