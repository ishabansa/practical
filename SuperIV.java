//by using super keyword we can use parent class data member
package Super;
class Shape  { //parent class
	String name= "circle";  //data member of parent class
}
class Size extends Shape{ //child class
	String name="No Size"; //data member of child class
	void print() { //child class method
		System.out.println(name);  //it represent child class
		System.out.println(super.name);  //it represent immidiate parent class IV
	}
}
 class SuperIV {
	public static void main(String[] args) {
		Size obj=new Size();
		obj.print();
	}

}
