package inheritance;

public class MultilevelInheritance1 {
 //main class
	public static void main(String[] args) {
		SIChild1 child = new SIChild1();  //create a object of child class
		child.display();
		child.show();
		child.print();
		}
}
class SIParent1{ //parent class
	void show() { //parent class user defined method
		System.out.println("show the details");
	}
}
//child class of SIParent & parent class of SIChild2
class SIChild1 extends SIParent2{
	void display() {  //child class user defined method
		System.out.println("display the result");
	}
}
class SIChild1 extends SIChild2 {  //child class
	void print() {  //child class user defined method
		System.out.println("print the output");
	}
}

