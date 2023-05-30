
public class CaughtException {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			int divide = 10/0;
			System.out.println(divide);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //1000 miliseconds - halts the execution of the program.
//			It's mandatory to add the Thread.sleep inside of a try/catch block. -- the other option is to add throws declaration.
//	If you use the throws declaration, you don't need it to be in the try/catch block. so if you have to use Thread.sleep() a lot, then it's ideal to use this option.
			
			
		Thread.sleep(1000);
	}
}
