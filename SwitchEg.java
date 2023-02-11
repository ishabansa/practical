package controlstatement;

public class SwitchEg {
public static void main(String[] args) {
	int no1=10;  //declare in variable for switch
	switch(no1) {  //switch expression
	//case statement(multiple condition)
	case 1:
		System.out.println("20"); //syso+ctrl+space
		break;
	case 10:
		System.out.println("30"); 
		break;
	case 3:
		System.out.println("10"); 
		break;
	case 4:
		System.out.println("50"); 
		break;
	case 5:
		System.out.println("60"); 
		break;
		default:System.out.println("Invalid number");
	}
}
}
