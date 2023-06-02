package superkeyword;

public class BullDog extends Dog {
	
//	Note that this class extends the Dog class. If the Dog class has parameters in it's constructor, then we have to add the super keyword and pass in the parameters:
	public BullDog() {
		super(123);
		System.out.println("BullDog constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
