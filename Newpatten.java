package controlstatement;

public class Newpatten {
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {  //outer loop for row number
			if(i%2 !=0) {  //odd no 1 3 5
				for(int j=5;j>=i;j--) {  //odd position print star
					System.out.print(" * ");
				}
				System.out.println();
			}
		}
		for(int i=2;i<=5;i++){ // outer loop for  row no
			if(i%2 !=0) {   //odd no 1 3 5
				for(int j=5;j>=i;j--) {  //odd position print star
					System.out.print(" * ");
				}
				System.out.println();
			}}}}
