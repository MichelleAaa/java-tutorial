package poloymorphism;

public class RBI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	This is overloading -- we have the same method name, with different parameters. (If the parameters were exactly the same, then we can't do this -- you can only use the same name when there's a different parameter.
	public void getLoan(String bankName) {
		
	}
//	You technically could use the same parameters, as long as there's multiple in both you could re-arrange them and they would be considered different signatures. (Or if the method names are the same but one doesn't have a parameter and the other one does.)
	public void getLoan(String bankName, int amount) {
		
	}
	
	public double getHomeLoanROI() {
		return 8.5;
	}
	
	public double getCarLoanROI() {
		return 10.5;
	}

}
