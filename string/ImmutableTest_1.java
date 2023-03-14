package String;

public class ImmutableTest_1 {
	public static void main(String[] args) {
		String str ="Pallabi";
		str.concat("Bhaduri"); //insert the string at the end
		str=str.concat("Bhaduri");  //it will print pallabi bhaduri
		System.out.println(str); //it will print pallabi only 
	}
}

