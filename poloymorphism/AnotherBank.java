package poloymorphism;

public class AnotherBank extends RBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnotherBank obj = new AnotherBank();
		obj.getHomeLoanROI(); //This is coming from the parent class, at first. But when we had one inside the class itself, then the one listed inside overrides the one from the parent.
		
		RBI obj2 = new AnotherBank(); // This is possible.
		
//		The below is not possible:
//		AnotherBank obj2 = new RBI(); //The child class can't reference to the parent class though.
	}
	
//	This is method overriding -- now we created the same method name and parameter numbers with a new method body. So when we call it from this child class, it's going to run this one, instead of the parent's method of the same name.
	public double getHomeLoanROI() {
		return 10.5;
	}

//	We can't do this, changing the return type to int instead of double, to override the parent method's getHomeLoandROI. -- It's not possible when the data types are primitive - aka int, double, boolean, byte, char, short, long, float, etc.
	
//	public int getHomeLoanROI() {
//		return 10.5;
//	}
	
	
//	This is how to write for a function to return a class as a return type. -- this can override the parent's getObject() method with overriding.
	public AnotherBank getObject() {
		AnotherBank obj = new AnotherBank();
		return obj;	
	}
	
//	Covariant - the return types are className and there is a parent - child relationship between them. It's possible to change the return type with overriding.
}
