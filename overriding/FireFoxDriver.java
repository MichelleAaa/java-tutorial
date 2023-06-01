package overriding;

public class FireFoxDriver extends WebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	FireFoxDriver inherits from the WebDriver class. In some cases though, maybe for the firefox browser the click() method or any other method from the WebDriver class doesn't work for that browser. So we can override by creating one in the child class.
	
//	Another option is to just create a new method name, instead of overriding the one from the WebDriver parent class.
	
	public void clickOnFF() {
		
	}
	public void sendKeysOnFF() {
		
	}

}
