package exception;
class InvaildAgeException extends Exception{
	public InvaildAgeException(String str) {  //constructor
		super(str); // call the constructor of parent exception
	}
}
public class Custom_Excep {
	static void checksage(int age) throws InvaildAgeException{
		if(age<25) {
			throw new InvaildAgeException("Not eligible for java course");
		}
		else {
			System.out.println("java course registred successfully");
		}
	}
	//public static void main(String[] args) throws InvaildAgeException {
	// checkage (23)	
	//}}
	public static void main(String[] args) {
		try {
			checksage(23);	
		}
		catch(InvaildAgeException e) {
			System.out.println(e);
		}
	}
}