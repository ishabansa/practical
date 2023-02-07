package method;
//display default value
public class Differentclassname {  //class
	int age;
	String name;
	void show() {  //method to display age and name (user defined)
		System.out.println(age+ " "+name);}
	public static void main(String[] args) {
		//1st object for name & age
		Differentclassname d=new Differentclassname();
		//2st object for name & age
		Differentclassname d1=new Differentclassname();
		d.show();
		d1.show();
		Differentclassname d3=new Differentclassname();
		d3.age=100;
		d3.name="JAVA";
		System.out.println(d3.age+d3.name);
	}
	}
