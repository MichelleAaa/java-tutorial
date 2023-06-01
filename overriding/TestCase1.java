package overriding;

public class TestCase1 extends Base {
	
	String browserName = "firefox";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		FireFoxDriver driver = new FireFoxDriver();
//		driver.click();
//		driver.sendKeys();
//		driver.getTitle();
//		Another option, instead of pulling from the parent, to create new methods in the FireFoxDriver class specifically for that browser. (Instead of overriding with the same-name method repeat.)
//		The problem is that between browsers, you could have a ton of different method names. While if you use overriding, then you make it easier, becuase the names remain the same. So writing the test cases is a lot easier.
		
		
		TestCase1 tc = new TestCase1();
		tc.initBrowser();
	}
	
	public void initBrowser() {
		
		WebDriver driver = getBrowserInstance(browserName);
		driver.click();
		driver.sendKeys();
		driver.getTitle();
	}

}
