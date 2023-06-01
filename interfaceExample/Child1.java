package interfaceExample;

// A child class can only extend one class, but it can implement multiple interfaces with the implements keyword.

//If you want to extend one class, and implement any number of interfaces, extends comes first.

public class Child1 extends ParentClass1 implements Parent1, Parent2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child1 c = new Child1();
		c.show();
	}

//	If we remove this method, we are fine, because it's in the parent class ParentClass1.
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
		System.out.println("Child show()");
		
	}

}
