package method;

public class Staticvariable {  //class1
	int rollno;
	String name;
	float fee;
	static String college="SRM";
			//static void change(){
			//college="ITC";}
			//constructor
			Staticvariable(int rollno, String name, float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		}
	//method
	void display() {
		System.out.println(rollno+" "+name+" "+fee+" "+college);
	}
	public class Staticvariable1{  //class2
		public static void main(String[] args) {
			//Staticvariable1.change();
			//objects
			Staticvariable s1=new Staticvariable(134,"ISHA",5000);
			Staticvariable s2=new Staticvariable(579,"YASHI",6000);
			s1.display();
			s2.display();
			}}}
