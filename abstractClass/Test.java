package abstractClass;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		new WebDriver(); This is not allowed - you can't instantiate an abstract class.
		
//		so we can only instantiate an object from the concrete class, in this case, ChildFireFox. And from there we could access concrete methods from the abstract class.
		
		ChildFireFox c = new ChildFireFox();
		c.captureScreenshot();//This is a concrete method from the abstract class.
		
		WebDriver d = new ChildFireFox();
		d.captureScreenshot();//This works as well. -- note that you can't access the child methods though if you do it this way.
		
	}

}
