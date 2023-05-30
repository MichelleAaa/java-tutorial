
public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Days 
		
//		Make sure that the data type you specify matches the one for the case.
		int day = 3;
		
		switch(day) {
		default:
			System.out.println("This would print everytime");
//			Without a break statement, it will then go down and match the case as well.
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("No case matched!!!");
		}
		
	}

}
