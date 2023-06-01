package interfaceExample;

// Same as an abstract class, you can't use the final keyword, aka public final interface WebDriver .... -- The reason is that with final you can't override those methods, but the entire point of an interface is to override the methods.

// Typically interfaces are used to standardize our project, to create a structure of which functions will be needed.

public interface WebDriver {

//	We can't specify a body in any of the methods in an interface.
	public void click();
	
//	You can use or not use the abstract keyword. But note above -- even if you don't use the keyword abstract, it's still abstract -- we can't create a body to any methods in an interface.
	public abstract void clickTwo();
}
