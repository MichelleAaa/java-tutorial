package collectionexample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.HashSet<String> set = new java.util.HashSet<String>();
		
		set.add("Ramen");
		set.add("Automation");
		set.add("Selenium");
		set.add("Appium");
		
		System.out.println(set);
		
//		Instead of HashSet, you can also use Set:
java.util.HashSet<String> set2 = new java.util.HashSet<String>();
		
		set2.add("Ramen");
		set2.add("Automation");
		set2.add("Selenium");
		set2.add("Appium");
		
		System.out.println(set);
//		System.out.println(set.get());//This doesn't work -- In a set, it's unordered, so you can't use .get(). (You can't fetch index values in a set)
		

//		You can use the for loop to get the values from a set:
		for(String var: set2) {
			System.out.println(var);
		}
		
//		Another option for printing out all the items in the set:
		
//		When retrieving or adding the values you specify the type:
		Iterator<String> itr = set2.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
//			if you only want to print out one value:
			String val = itr.next();
			if(val.equals("Appium")){
					System.out.println(val);
			}
		}
		
		
	}

}
