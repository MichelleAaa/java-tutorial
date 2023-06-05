package collectionexample;

import java.util.ArrayList;
//import java.util.List;
import java.util.Collections;
import java.util.Iterator; 

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.ArrayList list = new java.util.ArrayList();
		
//		Becuase we didn't specify a type, we can enter various data types into the arraylist:
		list.add(10); //This converts 10 into an object.
		list.add(10.25);
		list.add("String");
		
		System.out.println(list.size());
		
		System.out.println(list);
		
//		Retrieve values from a list:
		System.out.println(list.get(0));//lists start from zero. The parameter is the index.
		
//		Remove value from a list
		list.remove(2);
		
		System.out.println(list);
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(Object var : list) {
			System.out.println(var);
		}
		
		Iterator itr = list.iterator();
		
//		hasNext() returns true as long as there's a value at that index. -- you can use this to loop through all items in the ArrayList:
		while(itr.hasNext()) {
			System.out.println(itr.next()); //This returns the value at the index.
		}
		
		Object var1 = list.get(0); //Note that we have to store this as an object, as that's how it's stored in ArrayList. -- you would have to type cast it to an int to work with it as an integer.
		
		
	}

}
