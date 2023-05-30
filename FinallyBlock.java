
public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
//			DB Connection - successfully
			
//			Executing Some Queries
			
//			Validating the data and comparing from websites
			
//			Closing connection
			
			int i[] = new int[4];
			
			i[5] = 100;
			System.out.println("Close db connection in try block");
			
		} catch(Exception e) {
			System.out.println("Error occured");
		} finally { // The finally block is always executed.
			System.out.println("Closing the DB Connection");
		}
	}

}
