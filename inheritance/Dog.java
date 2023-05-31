package inheritance;

//Dog is a child class, inheriting from the Animal class.

public class Dog extends Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog obj = new Dog();
		obj.sound();
	}
	
	public void sound() {
//		Here we are overwriting the sound method from the animal class:
		System.out.println("woof woof");
	}

}
