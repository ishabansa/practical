//Area of the circle pi*r*r
package Aggregation;
 class AggregationEg {  //class 1
	 int Squre(int r) {  //method name square
		 return r*r;
	 }
}
 class circle1{  //class 2
	 AggregationEg ag; //obj (entity ref)
	 double pi = 3.14;
	 double area(int radius) {  //circle class method pi*r*r
		 ag = new AggregationEg();// object
		 int psqure = ag.Squre(radius); //radius *radius
		 return pi*psqure; //area
	 }
	 public static void main(String[] args) {
		circle1 c=new circle1();
		double result = c.area(5);  //3.14*5*5
		System.out.println(result);
	}
 }
