package abstractClass;

//When you extend an abstract class, you will get an error saying that you need to have the abstract methods listed in that parent class. -- You can hover over the error and select to add the missing methods. That will auto-fill the method names along with the @Override at the top of the methods.
//It's mandatory to override all abstract methods, but not the concrete ones.

public class FireFoxDriver extends WebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
//	If you don't include the @Override it will still work, but it's good to keep it.

	@Override
	public void click() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendKeys() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getTitle() {
		// TODO Auto-generated method stub
		
	}
	
}
