//Method overloading - same name method with different arguments
//two way we can overload the methods
//1. changing no. of arguments
//2. changing data type of arguments
public class Overloading_changing_argdatatype {
	static int sum(int a, int b) { //integer type arguments
		return a + b;
	}
	//double type arguments
	static double sum(double a, double b) { 
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(Overloading_changing_argdatatype.sum(5,6));
		System.out.println(Overloading_changing_argdatatype.sum(2.5,3.7));
	}
	}
