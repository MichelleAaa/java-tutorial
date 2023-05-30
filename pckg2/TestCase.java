package pckg2;

import pckg1.ClassA;
import pckg1.ClassB;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		We can access ClassA because it's public:
		ClassA obj = new ClassA();
		obj.add();
		
//		we can't import ClassB because it's from another package, and it's a default class, not a public class.
		ClassB obj2 = new ClassB();
		obj2.show();
	}

}
