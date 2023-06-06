package comparisons;

public class ComparisonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 = "Way2Automation";
		String name2 = "Way2Automation";
	
		
//		Both of these print true:
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
		
		int x = 100;
		int y = 100;
		
		System.out.println(x==y);
//		== is the comparison operator. It compares the object references and addresses.
//		.equals() - this will validate whether the content is the same or not.
		
		String name_1 = new String("Test");
		String name_2 = new String("Test");
		
		System.out.println(name_1.equals(name_2)); //This will print true.
		System.out.println(name_1 == name_2); // This prints false. That's because when we used new String(), it created the object at a different address.
//		If both references (aka variable names) are pointing to the same object address, then it will return true.
		
		
		
		
//		SingleTonTest s = new SingleTonTest();//This won't work due to the private constructor.
		
		SingleTonTest s1 = SingleTonTest.getInstance();//We aren't allowed to make an instance of the SingleTonTest class normally because of the private constructor... but in the SingleTonTest class, we have created a work-around that allows another class to return this class. That method is called getInstance().
		SingleTonTest s2 = SingleTonTest.getInstance();
		
		System.out.println(s1==s2);//This returns true. Both references, s1 and s2, are both pointing to the same object address. -- == validates the address of the two, ensuring they are the same.
		
		
		
	}

}
