
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] myArray = new int[2][3];
		
//		This is like arrays within arrays. You can assign values as follows:
		myArray[0][2] = 10;
		myArray[1][1] = 20;
		
		System.out.println(myArray[1][1]);
		
		System.out.println(myArray.length); //this will print two numbers.
		
		System.out.println(myArray[0].length);//If you want to use print the length of one of the arrays.
		
		for(int i=0; i<myArray.length; i++) {
			
			for(int j=0;j<myArray[i].length; j++) {
				System.out.println(myArray[i][j]);
			}
		}
		
	}

}
