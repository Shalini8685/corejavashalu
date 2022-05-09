/**
 * 
 */
package sample;

/**
 * @author Shalini
 *
 */
public class code1 {
		String name;
		String color;
		int cost;
		String breed;
		/**
		 * description : this is the method to indicate the run
		 * return type : void
		 */
		void run() {
			System.out.println("DOG IS RUNNING");
		}
		/**
		 * description : this is the method to indicate the walk
		 * return type : void
		 */
		void walk() {
			System.out.println("DOG IS WALKING");
		}
		
	}
	public class dog {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Dog d = new Dog (); //object creation
			d.name = "Tommy";
			d.color = "white";
			d.cost = 4000;
			d.breed = "GR";
			
			System.out.println("THE PROPERTIES OF DOG ARE");
			System.out.println(d.name); //Tommy
			System.out.println(d.color); //white
			System.out.println(d.cost); //4000
			System.out.println(d.breed); //GR
			
			System.out.println("THE BEHAVIOURS OF DOG ARE");
			d.run(); //DOG IS RUNNING
			d.walk(); //DOG IS WALKING
			
		}
	}