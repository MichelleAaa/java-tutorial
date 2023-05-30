package pckg1;

public class VariableTest {

	public int publicVariable = 10;
	private int privatevariable = 20; //private variables are only accessible in their own class.
	protected int protectedvariable = 30;
	int defaultVarable = 40;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test obj = new Test();
		
		System.out.println(obj.privatevariable); 
		System.out.println(obj.publicVariable);
		System.out.println(obj.protectedVariable);
		System.out.println(obj.defaultVariable);
	}

}
