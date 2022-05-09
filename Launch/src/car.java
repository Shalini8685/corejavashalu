/**
 * @author Shalini
 *
 */
public class car {
	String model;
	String color;
	int cost;
	/**
	 * description:this is the method to indicate the start of the car
	 * return type:void
	 */
	void start() {
		System.out.println("CAR IS STARTING");
	}
	/**
	 * description:this is the method to indicate the run of the car
	 * return type:void
	 */
	void run() {
		System.out.println("CAR IS RUNNING");
	}
}
public class car {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		car c = new car(); //object creation
		c.model = "BALENO";
		c.color = "GREY";
		c.cost = 1000000;
		
		System.out.println("THE PROPERTIES OF THE CAR ARE:");
		System.out.println(c.model);
		System.out.println(c.color);
		System.out.println(c.cost);
		
		System.out.println("THE BEHAVIOURES OF THE CAR ARE:");
		c.start();
		c.run();
		}
	}

