package overriding;

public class Base {
// All the test cases will extend the Base class.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	Note the return type -- we have to use a polymorphic reference - aka the parent class name of WebDriver. (If we only were returning one driver type, we could put FireFoxDriver or ChromeDriver, but since it could be either, we go with the parent class name.
	public WebDriver getBrowserInstance(String browserName) {
		if(browserName.equals("firefox")){
				return new FireFoxDriver();
	} else if(browserName.equals("chrome")){
			return new ChromeDriver();
	} else {
		return new FireFoxDriver();
	}

}
