
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		In Java arrays are objects. To initiate an array, you create an object of an array with the new keyword.
//		if the array will hold 10 values, we put 10 in []:
		int[] array = new int[10];
//		Whenever we define the reference, we have to indicate what's inside the array.
		
//		Here we are defining the length of the string as 13. The length becomes static when you specify it.
		String[] myArray = new String[13];
		
//		The array index starts at 0. If there's 5 elements, the last element is at index 4.
		
		System.out.println(array.length);
		
//		Assign values to the indexes of the array:
//		this will assign int 10 to index 0.
//		Note that you can't store a string in an int array.
		array[0] = 10;
		array[2] = 20;
		
//		Loop through all indexes of the array:
		for(int index=0; index<array.length; index++) {
			System.out.println(array[index]);
		}
		
		System.out.println(array);
		
		
//		You can also directly assign the values to an array:
//		It's ideal to not do it this way though.
		int[] array1 = {1,2,3,4,5};
	}

}
