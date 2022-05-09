/**
 * 
 */
package oops;
/**
 * @author Shalini
 *
 */
//POLYMORPHISM WITHOUT REPETITION
class animal1{
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

class deer1 extends animal1{
	@Override
	void run() {
		System.out.println("DEER RUNS VERY FAST");
	}
	void breath() {
		System.out.println("DEER BREATHS HEAVILY");
	}
}
class lion1 extends animal1{
	@Override
	void run() {
		System.out.println("LION RUNS FAST");
	}
	void roar() {
		System.out.println("LION ROARS LOUD");
	}
}
class monkey1 extends animal1{
	@Override
	void run() {
		System.out.println("MONKEY RUNS SLOW");
	}
	void jump() {
		System.out.println("MONKEY JUMPS HIGH");
	}
}
public class poly1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		deer1 d = new deer1();
		lion1 l = new lion1();
		monkey1 m = new monkey1();
		
		animal1 ref;
		ref = d; 
		ref.eat();
		ref.sleep();
		ref.run();
		d.breath();
		System.out.println("-------------------");
		ref = l;
		ref.eat();
		ref.sleep();
		ref.run();
		l.roar();
		System.out.println("-------------------");
		ref = m;
		ref.eat();
		ref.sleep();
		ref.run();
		m.jump();
		
	}

}
