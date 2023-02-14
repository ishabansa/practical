//Area of the circle pi*r*r
package Aggregation;
public class Aggregation1 { //class 1
	 int Squre(int r) {  //method name square
		 return r*r;
	 }
}
class circle{  //class 2
	 double pi = 3.14;
	 double area(int radius) {  //circle class method pi*r*r
		  Aggregation1 ref_var = new Aggregation1();  // object
		 int psqure = ref_var.Squre(radius); //radius *radius
		 return pi*psqure; //area
	 }
	 public static void main(String[] args) {
		circle c=new circle();
		double result = c.area(5);  //3.14*5*5
		System.out.println("Area:"+result);
	}
}