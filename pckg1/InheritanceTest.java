package pckg1;

import pckg1.VariableTest;

public class InheritanceTest extends VariableTest {

//	Inheritance - one class object will inherit the properties of the other class.
//	extends, implements
//	A, B
//	A extends B
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		CREATING THE OBJECT - Note that you could create an object of the parent class, VariableTest, or the current class, InheritanceTest.
//		Each method has it's own access rights as to which of these variables you can access.
		InheritanceTest obj = new InheritanceTest();
		
		System.out.println(obj.privatevariable); 
		System.out.println(obj.publicVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.defaultVariable);
	}

}
