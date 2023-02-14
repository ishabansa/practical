//Hierarchical Inheritance
package inheritance;
class Vehiclel { //parent class A
	void running() {
		System.out.println("running mode on");
	}
}
class Car1 extends Vehiclel { //child class 1
	void run() {
		System.out.println("Car run mode on");
	}
}
class Bikel extends Vehiclel{ //child class 2
	void Speed() {
		System.out.println("Speed is very high");
	}
}
public class Hierarchicalin {
	public static void main(String[] args) {
		Bikel b = new Bikel();
		b.running();
		b.Speed();
		Car1 c = new Car1 ();
		c.running();
		c.run();
		}

}
