package poloymorphism;

public class OverloadingExample {
	
//	You can even overload the main method, but it can't have the same arguments -- the signature has to be different, as in the methods can't be the same.
	public static void main(int a) {
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingExample obj = new OverloadingExample();
		obj.add(a,  b, c);
//		At times you may need to add two numbers together, and at other times you need to add three numbers together.  So below we have two add() functions, and they have a different number of parameters.
		obj.doLogin("asadf","asadf"); // This will call the second function, since the first data type is String.
		
//		in the case of bytes, you would have to specifcy their data type for the compiler to know to use that add() function, instead of the first one, assuming it's ints.
		byte b1=20;
		byte b2=10;
		obj.add(b1, b2); // When you hover over add(), it will show you which of the add() methods it's going to use based on your entry.
		
//		If you are working with int and double, just like with byte, you may need to indicate the data type so the compiler doesn't get confused. It depends on your entries.
	}
	
	public void add(int a, int b) {
		
	}
	
	public void add(int a, int b, int c) {
		
	}
	
	public void add(byte a, byte b) {
		
	}
	
//	Here the person may want to login with either the mobile number or the username for the first field. So when you call the function and pass in an int for the first parameter, then it will call this first doLogin function. When you give a string argument for the first parameter, then it would call the second doLogin function.
	public void doLogin(int mobile, String password) {
		
	}
	
	public void doLogin(String username, String password) {
		
	}

//	This allows you to pass in multiple parameters, without specifying how many.
	public void addition(int... a) {
//		note that to access, you would have to access into[] and use a loop to go through them.
		
	}
}
