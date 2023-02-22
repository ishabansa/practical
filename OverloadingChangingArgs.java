//Method overloading - same name method with different arguments
//two way we can overload the methods
//1. changing no. of arguments
//2. changing data type of arguments
public class OverloadingChangingArgs {
static int sum(int a, int b) { //two parameters/arguments
	return a + b;
}
static int sum(int x, int y, int z, int c) { //three arguments
	return x+y+z+c;
}
public static void main(String[] args) {
	System.out.println(OverloadingChangingArgs.sum(5,6));
	System.out.println(OverloadingChangingArgs.sum(2,3,4,1));
}
}
