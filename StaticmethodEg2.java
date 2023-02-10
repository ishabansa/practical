package method;

public class StaticmethodEg2 {
	static int add(int a, int b) {
		return a+b;
		}
	public static void main(String[] args) {
		int c= StaticmethodEg2.add(5, 4);
		System.out.println(c);
	}

}
