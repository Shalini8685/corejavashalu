package oops;
/**
 * @author Shalini
 *
 */
class car3{
	private String name;
	private int cost;
	private String registration;
	private int speed;
	
	public car3() {
		this("MINICOOPER");
}
	public car3(String name) {
		this("BALENO", 2000000);
		this.name=name;
	}
	public car3(String name, int cost) {
		this("ECOSPORT", 1200000,"KARNATAKA");
		this.name=name;
		this.cost=cost;
	}
	public car3(String name, int cost, String registration) {
		this("FERRARI", 4000000, "TAMILNADU", 120);
		this.name=name;
		this.cost=cost;
		this.registration=registration;
	}
	public car3(String name, int cost, String registration, int speed) {
		super();
		this.name=name;
		this.cost=cost;
		this.registration=registration;
		this.speed=speed;
	}
	void getData() {
		System.out.println(name);
		System.out.println(cost);
		System.out.println(registration);
		System.out.println(speed);
	}
}
public class construct1 {
		public static void main(String[] args) {
		
			car3 c1=new car3();
//			car3 c2= new car3("MINI COOPER");
//			car3 c3= new car3("BALENO", 100000);
//			car3 c4= new car3("ECOSPORT", 1200000,"KARNATAKA");
//			car3 c5= new car3("FERRARI", 4000000, "TAMILNADU", 120);
			
			c1.getData();
			System.out.println("-------------");
//			c2.getData();
//			System.out.println("-------------");
//			c3.getData();
//			System.out.println("-------------");
//			c4.getData();
//			System.out.println("-------------");
//			c5.getData();
	}
}
