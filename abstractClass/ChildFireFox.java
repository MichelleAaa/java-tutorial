package abstractClass;

// Note that there's no error here, for a child of a child of an abstract class -- because the first child has to declare the abstract methods. -- The first concrete class has to declare the methods.
// If we set ForeFoxDriver also as an abstract class, then this child class would need to implement the abstract methods. 
public class ChildFireFox extends FireFoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
