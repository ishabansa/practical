//display default value
package method;

public class Defaultcons {  //class
	int age;
	String name;
	void show() {  //method to display age and name (user defined)
		System.out.println(age+ " "+name);}
	public static void main(String[] args) {
		//1st object for name & age
		Defaultcons d=new Defaultcons();
		//2st object for name & age
		Defaultcons d1=new Defaultcons();
		d.show();
		d1.show();
	}
}
