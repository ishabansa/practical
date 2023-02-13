package inheritance;
class SIParent {  //parent class
	void show() {  //parent class user defined method
		System.out.println("Show the details");
	}
}
class SIChild extends SIParent{  //child class
	void display() { //child class user defined method
		System.out.println("Display the result");
	}
}

public class SingleInheritance1 {  
	public static void main(String[] args) {
		SIChild child = new SIChild();  //create a object of child class
		child.display();
		child.show();
	}}