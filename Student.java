package Aggregation;

public class Student {  //class 1
	int id;
	String name;
	Address address; //aggretion (entity ref of address class)
	public Student(int id, Address address, String name) {  //parameterized cons
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {  //method
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
		}
	public static void main(String[] args) {
		Address address1 = new Address("dgp","wb","india");
		Address address2 = new Address("kol","wb","india");
		Student s=new Student(12,address1,"ISHA");
		Student s1 =new Student(12,address2,"Anudip");
		s.display();
		s1.display();
	}}
