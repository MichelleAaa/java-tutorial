package javaproperties;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class TestCase1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
//		Note that when you add the below it will show an error. Hover and click to Add Throws declaration.
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\psi33\\eclipse-workspace\\MyFirstJavaApp\\src\\javapropertiesexcel\\object.properties");//This accepts the constructor, and that will be the path of your object.properties file. -- right click on the file and select properties to get the path. -- Java expects double backslashes.
		
//		Another option:
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\javapropertiesexcel\\object.properties");
		
		
//		When you add this as well it will show an error. Hover it and select to add throws declaration.
		prop.load(fis); //This loads the properties file.
		
//		Here we are specifying a key from the object.properties file to pull in the value.
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("course"));
		System.out.println(System.getProperty("user.dir")); // This will give you your current directory. In this case: C:\Users\psi33\eclipse-workspace\MyFirstJavaApp
		
		
		
	}

}
