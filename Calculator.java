
public class Calculator {

	public int getSum(int num1, int num2) {
		int result = num1+num2;//this is a local variable
		return result;
	}
	
	public int getSub(int num1, int num2) {
		return num1-num2;
	}
	
}

//In another file, in another class, you could use:
	
Calculator calc = new Calculator();
int i = calc.getSum(10, 4);