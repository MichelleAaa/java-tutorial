package pckg1;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		We can access ClassA becuase it's public:
		ClassA obj = new ClassA();
		obj.add();
		
//		we are in the same package, so we can access ClassB, even though it's a default class instead of public.
		ClassB obj2 = new ClassB();
		obj2.show();
	}

}
