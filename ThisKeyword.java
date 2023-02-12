//without /with this keyword
package method;

public class ThisKeyword { //class 1 outer class
	//instance variable
	int Id;
	String ename;
	double salary;
	//parameterized constructor
	ThisKeyword(int Id, String ename, double salary){
		this.Id=Id;
		this.ename=ename;
		this.salary=salary;}
	//method
	void display() {
		System.out.println(Id+" "+ename+" "+salary);
		}
	public class ThisKeyword1{  //main class
		public static void main(String[] args) {
			//objects
			ThisKeyword s1 = new ThisKeyword(01,"ISHA",5000);
			ThisKeyword s2 = new ThisKeyword(02,"YASHI",6000);
			s1.display();
			s2.display();
		}}}
