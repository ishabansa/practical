package method;
import java.util.*;
public class Method1 {
	public static void main(String[] args) {
		// create scanner class
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers : ");
		//Read numbers from user
		int num=sc.nextInt();
		//call the method
		findevenodd(num);
		}
	// Create a method
	public static void findevenodd(int num) {
		if(num%2==0) {
			System.out.println(num +" "+ "Even");
		}
		else {
			System.out.println(num +" "+ "Odd");
		}
	}

}
