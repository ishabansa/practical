package controlstatement;

public class Pyramidpatten {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)  {//outer loop print row i
			for(int j=1; j<=i; j++)  {//inner loop print column j star print
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
