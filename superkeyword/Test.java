package superkeyword;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		d.sound(); // This calls the method from the Dog class, not the parent, Animal, class.
		
		Animal a = new Dog();
		a.sound();//this still calls the sound method of the child class.
		
		BullDog b = new BullDog(); //When we create an object of the BullDog class, it calls the Animal, Dog, and then it's own constructor. They get called in that order. (since BullDog extends Dog, and Dog extends Animal.)
	}

}
