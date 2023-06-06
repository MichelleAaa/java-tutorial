package comparisons;

public class SingleTonTest {
	
	private static SingleTonTest instance = new SingleTonTest(); //This will enable us to create an object of this class.
	
	private SingleTonTest() {
		System.out.println("Creating Object");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	Normally if we have a private constructor another class can't make an object of this class. To get around this, we can create a function like below that has a return method of this class:
	public static SingleTonTest getInstance() {
		return instance; //here we return the instance of this class.
	}

}
