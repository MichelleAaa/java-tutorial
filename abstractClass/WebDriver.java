package abstractClass;

// We have to add the abstract keyword to the class as well as the method names. 
public abstract class WebDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	An abstract method can't have a body:
	public abstract void click();
	
	public abstract void sendKeys();
	
	public abstract void  getTitle();
	
//	An abstract class can have abstract methods (as above) along with concrete methods (as below). It can be any distribution/number of each. But typically if you have no abstract methods, you wouldn't mark the class as abstract.
//	With an interface, all the methods have to be interface in nature. But here we are fine with a mix.
	public void captureScreenshot() {
		
	}
//	Note about the above -- we can't instatiate an object of this WebDriver class becuase it's an abstract class. So to access the concrete method captureScreenshot, we would need to instantiate an object of the child class (which is a concrete class) and then call the method through inheritance there.
}
