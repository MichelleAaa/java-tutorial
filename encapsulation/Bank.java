package encapsulation;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int accountNo=123456;
	private int pinNo=1234;
	private double balanceAmount = 100000;
	
	public void setPinNo() {
		
	}
	
	
	
	public double getBalanceAmount() {
		return balanceAmount;
	}



	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}



	public int getAccountNo() {
		return accountNo;
	}



	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}



	public void withdrawAmount(int acctNo, int pin, int amount) {
		
		if(acctNo==accountNo && pin==pinNo) {
			if(amount <= balanceAmount) {
				balanceAmount = balanceAmount-amount;
				System.out.println("Amount withdrawn: " + amount);
			} else {
				System.out.println("insufficient balance");
			}
		} else {
			System.out.println("Invalid credentials");
		}
	}
	
	public double depositCash(int acctNo, int pin, double amount) {
		if(acctNo==accountNo && pin==pinNo) {
			balanceAmount=balanceAmount+amount;
			return balanceAmount;
		} else {
			System.out.println("Invalid Credentials");
			return balanceAmount;
		}
	}
	
	public void updatePin(int acctNo, int oldPin, int newPin) {
		if(acctNo==accountNo && oldPin==pinNo) {
			pinNo=newPin;
			System.out.println("Pin changed successfully.");
		} else {
			System.out.println("Invalid credentials");
		}
	}
}


