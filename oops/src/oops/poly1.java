/**
 * 
 */
package oops;

/**
 * @author Shalini
 *
 */
//POLYMORPHISM WITHOUT REPETITION
class animal{
	void eat() {
		System.out.println("CAN EAT");
	}
	void sleep() {
		System.out.println("CAN SLEEP");
	}
	void run() {
		System.out.println("CAN RUN");
	}
}

class deer extends animal{
	@Override
	void run() {
		System.out.println("DEER RUNS VERY FAST");
	}
	void breath() {
		System.out.println("DEER BREATHS HEAVILY");
	}
}

class lion extends animal{
	@Override
	void run() {
		System.out.println("LION RUNS FAST");
	}
	void roar() {
		System.out.println("LION ROARS LOUD");
	}
}

class monkey extends animal{
	@Override
	void run() {
		System.out.println("MONKEY RUNS SLOW");
	}
	void jump() {
		System.out.println("MONKEY JUMPS HIGH");
	}
}

public class poly1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deer d = new deer();
		lion l = new lion();
		monkey m = new monkey();
		
		animal ref;
		
		d.breath();
		System.out.println();
		
		f.allow(l);
		l.roar();
		System.out.println();
		
		f.allow(m);
		m.jump();
	}

}
