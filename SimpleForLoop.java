package controlstatement;
//nested for loop
public class SimpleForLoop {
public static void main(String[] args) {
	//code of for loop
	for(int i = 1; i<=10; i++) { //iterate 10 times
		for(int j = 10; j<=20; j++) {
			System.out.println("The output is " + i+ " "+j);  //1 2 3 4 5 6 7 8 9 10
		}
	}
}
}
