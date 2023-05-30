
public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		This returns a decimal value:
//		double num = Math.random() * 10;
		
//		type cast -- adding (int) to the front will type cast it into an int. It returns whole numbers.
//Then we have to change double to int for the variable type in the front as well:
		int num = (int)(Math.random() * 100);
		
		System.out.println(num);
	}

}
