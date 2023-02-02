//3 way to initialize object in java- by reference variable, by method, by constructor
package FieldsAndObject; 

 class ObjectEg {  //class 2
	//instance variable
	int id;
	String name;
	}
           class Object{ //main class
        	   public static void main(String[] args) {
				ObjectEg obj=new ObjectEg();  //create object -- obj is our ref variable
				obj.id=101;
				obj.name="isha";
				System.out.println(obj.id+" "+obj.name);  //printing members with a white space
			}
           }