package inheritance;

public class MultilevelInheritance3 {
	//main class
public static void main(String[] args) {
	SIChild child=new SIChild();  //create a object of child class
	child.display();
	child.show();
	}
}
class SIParent{ //parent class
	void show() {  //parent class user defined method
		System.out.println("show the details");
	}
}
//child class of SIParent & parent class of SIChild2
class SIChild1 extends SIParent{  //child class
	void display() {  //child class user defined method
		System.out.println("display the result");
	}
}
class SIChild2 extends SIChild1{  //child class
	void print() {  //child class user defined method
		System.out.println("print the output");
	}
}