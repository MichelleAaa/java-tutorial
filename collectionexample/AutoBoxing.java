package collectionexample;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int var = 10;
		Integer obj = new Integer(var);//This creates an object of the Integer class. -- it's called wrapping (when you convert a primitive into an object.)
		
		System.out.println(obj);
		
		int i = obj; //This is called unwrapping. (Convert an object into a primitive.)
	}

}
