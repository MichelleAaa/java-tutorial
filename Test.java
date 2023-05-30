import java_tutorial.String;

public class Test {

//	public static void main (String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Hello world!");
//
//	}
	
// Return type --> dataType of the value returned by method.
	//Keyword --> return

//	If the data type is int here, where it says public int, then the return must be int.
	public int display() {
		
		return 23;
	}
	
//	If you are not returning anything, it should be a void method. exmaple:
	
	public void display() {
		System.out.println("test");
	}
	
}

public static void main(String[] args) {
	LearningMethods learn = new LearningMethods();
//	LearningMethods is a class. Here we are instantiating the class, and then calling the methods from the class.
	learn.show();
	//learn.display(k, c, f, b);
}


int i = 123; // instance variable - Global variable. Can be accessed in classes.

public void go() {
	
	i = 345; //We can access the global variable i and change it inside the class.
	
	int j = 234; // Instance variable. We can access it anywhere within the class. But we can't access it outside the method. It's a local variable.
}
