package collectionexample;


import java.util.ArrayList;
import java.util.List;

public class GeneralArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Here we are defining the type (It's the class type, not the primitive type that we have to list -- so Integer not int):
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
//		list.add(10.25);//note that we can't do this, as it's not type Integer, not double.
		list.add(null); //We can add null to any list type.
		
		int i = list.get(0);// You can directly store it as an int, there's no need to type cast it.
		
	}

}
