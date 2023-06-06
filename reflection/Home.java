package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Home {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		System.out.println(t.getClass().getSimpleName());//This prints out your class name.
		
		Class clazz = t.getClass(); //.getClass returns you an object of a class.
		
		Constructor[] cons = clazz.getDeclaredConstructors();//Returns a constructor.
		System.out.println(cons.length); //This will return 2, becuase we have two constructors in the Test class.
		
//		To print the package and class name where the constructors are coming from:
		
		for(Constructor con: cons) {
			System.out.println(con.getName());
		}
		
		
		
		System.out.println(clazz.getSimpleName());
		Method[] arrayOfMethods = clazz.getDeclaredMethods();
		System.out.println(clazz.getMethods().length); //It returns the count of methods. Note that it returns the methods inherited from super class or super interfaces.
		System.out.println(arrayOfMethods.length);
		
//		To print all the method names:
		for(Method m:arrayOfMethods) {
				System.out.println(m.getName());
				
//				To print out how many parameters are in a method:
				Parameter[] params = m.getParameters();//This returns an array of parameter objects. 
				
				for(Parameter param:params) {
					System.out.println(param.getName());
				}
				
		}
		

	}
	
	
	
//	Whenever you call a method, the information of the method is stored inside the Method class, referenced above.
//	Whenever a constructor is called, all the information of the constructor is stored in a class called Constructor. (It's a class as well.)
	
	
//	Log4j is used to generate logs.
//	log.debug(dologin test executed);
//	log.debut(ddUserReg test executed);
	
//	
//	@BeforeMethod
//	public void beforeMethod(Method m) {
//		(Test case executed is : + m.getName) //This could be set up to print the name of each test case before it.
//	}
//	
//	@Test
//	doLogin(String username, STring password){
//		
//	}
//	
//	@Test
//	ddUserReg(){
//		
//	}

}
