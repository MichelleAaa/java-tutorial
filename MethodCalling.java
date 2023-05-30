
public class MethodCalling {
//	A static component cannot call a non-static component directly.
//	A static component can call a static component directly -- without creating an instance of the object.
//	A non-static method CAN call a non-static method directly -- without creating an instance of the object.
//	A non-static method CAN call a static method directly.
	
//	Direct calling without instantiating an object:
//	static can call static
//	non-static can call non-static and static.
	
//	Static is for Object Oriented programming -- we can't do inheritance, polymorphism, etc, if we keep everything static.

	
//	In Java, it's compiled, interpreted, and the JVM is called. The first thing it does is look for the main method. -- the main method is public static void(String[] args){...} 
//	You can't even change the name of the main method such as to main2, it has to be main, or else it will launch an error.
//	Then all the methods will be called in sequence.
	

//	Because we have static here, we are not able to call the methods directly. (You can't just list go() and have it work.)
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		we have to create a method of the class to call the methods
		MethodCalling m = new MethodCalling();
//		Then we can call the methods by accessing the object:
		m.go();
	}
	
	
//	CALL STRUCTURE:
//	As mentioned earlier, first the public static void main(String[] args(){} method will be called. It will go in order of what was listed in the main method. So in this case, we listed go(). So it will:
//	In the case of go():
//	Inside Go Method (from first system print)
//	go1()- it will go inside and print the code - Inside Go Method
//	After calling go1 Method - it will then finish with the code in go().
	
	
	
	public void go() {
		System.out.println("Inside Go method");
		go1();
//		note that inside this method, since both are not static, we can call go1() without creating an object of the class first.
		System.out.println("after calling go1 Method");
	}
	public void go1() {
		System.out.println("Inside Go method");
	}
	public static void go11() {
		System.out.println("Inside Go method");
	}
	public static void go2() {
		System.out.println("Inside Go method");
		go11(); // note that both go11 and this method are both static methods. So we are allowed to call the method without creating an object of it first.
	}

}
