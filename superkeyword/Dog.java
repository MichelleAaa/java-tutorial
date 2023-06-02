package superkeyword;

public class Dog extends Animal {
	
	public Dog(int num) {
		System.out.println("Dog constructor");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	This will override the sound method from the Animal class.
	public void sound() {
		super.sound(); // Now when sound() is called, it will also call the sound() method of the parent, Animal.
//		The super keyword is used to access the methods of the parent class. (aka the superclass) -- it allows you to call the overriden method from the super/parent class. So if you want to call the original behavior of the parent.
		System.out.println("Dog sound!");
	}

}
