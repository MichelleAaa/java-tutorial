package inheritance;

// Sound is from the Animal class -- Dog inherited from Animal class, and now BullDog is inheriting from Dog -- A child can access any parent's method. -- this is multilevel inheritance.
//If a hierarchy is formed, such as Animal being inherited by another child, then it turns into hierarchical.
public class BullDog extends Dog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BullDog obj = new BullDog();
		obj.sound();
		
	}

}
