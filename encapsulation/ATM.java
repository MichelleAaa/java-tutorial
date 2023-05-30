package encapsulation;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank obj = new Bank();
		
		obj.updatePin(123456, 1234, 3333);
		
		obj.withdrawAmount(123456, 3333, 1000);

	}

}
