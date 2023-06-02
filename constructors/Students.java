package constructors;

public class Students {
//	Constructors have the same name as the className
//	It's called automatically once you have created an object of this class. (which has been done in the main method.)
//	It's used for variables.
//	constructors can have access modifiers, like public, private, etc. -- Private means that this constructor would only be accessible within this class.
//	If the constructor is private, and you still want to access it in another class, we have to use getter/setter.
	
//	Types of constructors:
//	Default constructor - When you don't specify one, the default one is used. (There's no arguments)
//	Non-Arg Constructor - No arguments are included
//	Parameterized Constructor - 

//	CONSTRUCTOR OVERLOADING:
//	Note that below we have two constructors, one has no arguments, and the other has arguments. Depending on how you create the object from the Students class (either passing in arguments or not) it will select the appropriate constructor to use.
	
	
	public Students(){
		this();//you can call the constructor with this() so the code inside this block will execute. -- you could also call it with:
//		new Students();
		System.out.println("Calling constructor");

	}
	
	String studentName;
	int rollNum;
	
	
	public Students(String studentName, int rollNum){
		System.out.println("Calling constructor");
		this.studentName = studentName;
		this.rollNum = rollNum;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Students st = new Students();
		
		Students st = new Students("Rahul", 101);
		System.out.println(st.studentName);
		System.out.println(st.rollNum);
		
		Students sl = new Students();//This would create the object with the first constructor, which has no parameters, due to constructor overloading.
		
		
		
//		Here, we are trying to create an object of the Test class, which has a private constructor. There's an error and this is not allowed:
//		Test t = new Test();
	}

}
