
public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int divide = 10/0;
			System.out.println(divide);
			
			Thread.sleep(1000); //1000 miliseconds - halts the execution of the program. -- It must be in a try/catch block?
			
		} catch (Exception e) {	
//		} catch(Throwable t) {
			System.out.println("Error occured");
			System.out.println(e.getMessage());
			e.printStackTrace(); //this prints out more details.
		}
		System.out.println("Ending");
	}

}
