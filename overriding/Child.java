package overriding;

public class Child extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.show(); //This will call the show method from the child class, not the parent.
		c.display();
		
//		If you create an instance of the class like this, then you can only access the methods that are in both the parent and child classes.
		Parent d = new Child();
		d.show();
		d.add(); //This is only in the parent class, not in the child class. 
//		d.display(); We can't call display() because it only exists in the child class, not the parent.
	}
	
//	This is overriding the show() method from the parent class. Note that we can change it to void show() (for default), but we can't change it to private void show(). -- You can't reduce the visibility of inherited methods.
	public void show() {
		
	}
	
	public void display() {
		
	}

}
