package inheritance;
class SIParenteg2{ //parent class
	int salary = 30000; //parent class member
}
public class SIChildEg2 extends SIParenteg2 {
	int bonus= 1500; //child class member
	int annualsal= salary+bonus;
	public static void main(String[] args) {
		SIChildEg2 object = new SIChildEg2();
		System.out.println("Salary is:"+ object.salary);
		System.out.println("Annual Salary is:"+ object.annualsal);
	}

}