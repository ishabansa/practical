package controlstatement;

public class Nestedif {
	public static void main(String[] args) {
		String address = "Kolkata, India";
		if(address.endsWith("India")) {  //true
			if(address.contains("Dunlop")) {  //false
				System.out.println("Your city is Dunlop");
			}
			else if(address.contains("Newtown")) {  //false
				System.out.println("Your city is Newtown");
			}
			else {
				System.out.println(address.split(",")[0]);
			}
		}
		else {
			System.out.println("You are not living in India");
		}
	}

}
