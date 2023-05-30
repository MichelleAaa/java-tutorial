
public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = (int)(Math.random()*20);
		System.out.println(num);
		
		if(num>10) {
			System.out.println("Number is Greater than 10");
		} else if(num == 10) {
			System.out.println("Number is 10");
		} else {
			System.out.println("Number is less than 10");
		}
	}
	
}
