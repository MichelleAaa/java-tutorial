package collectionexample;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.Map<String,String> map = new java.util.HashMap<String,String>();
		
		map.put("firstName", "Ramen"); 
		map.put("LastName", "Smith"); 
		map.put("subject", "Selenium"); 
		map.put("Location", "US");
		
		System.out.println(map);//This shows the key value pairs.
		System.out.println(map.size());//This prints 4 for the 4 key/value pairs.
		
		System.out.println(map.get("firstName"));
		
		Set<String> keys = map.keySet();//This returns a set of the key names.
		
		for(String key: keys) {
			System.out.println("Key --> " + key + " Value is --> " + map.get(key));
		}
		
		java.util.Map<String,List<String>> map1 = new HashMap<String,List<String>>();
		
//		This is how you could create the list, and then add it to the map1.
		List<String> listofEmails = new ArrayList<String>();
		listofEmails.add("test@test.com");
		listofEmails.add("anotheremail@test.com");
		listofEmails.add("test@thisisatest.com");
		
		map1.put("email", listofEmails);
		
		
	}

}
