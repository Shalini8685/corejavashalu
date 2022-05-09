package oops;
/**
 * @author Shalini
 *
 */
class dog1{
	private String name;
	private int cost;
	private String breed;
	private String color;
	
	public dog1() {//zero parameter constructor
}
	public dog1(String name) {//one parameter constructor
		this.name = name;
	}
	public dog1(String name,int cost) {//two parameter constructor
		this.name = name;
		this.cost = cost;
	}
	public dog1(String name,int cost,String breed) {//three parameter constructor
		this.name = name;
		this.cost = cost;
		this.breed = breed;
	}
	public dog1(String name,int cost,String breed,String color) {//three parameter constructor
		this.name = name;
		this.cost = cost;
		this.breed = breed;
		this.color = color;
	}
	void getData() {
		System.out.println(name);
		System.out.println(cost);
		System.out.println(breed);
		System.out.println(color);
	}
}
public class construct2 {
	public static void main(String[] args) {
		dog1 d1 = new dog1();
		dog1 d2 = new dog1("ROCKY");
		dog1 d3 = new dog1("TOMMY",5000);
		dog1 d4 = new dog1("PUMMY",4000,"PUG");
		dog1 d5 = new dog1("JIMMY",7000,"GR","WHITE");
		
		d1.getData();
		System.out.println("-------------------");
		d2.getData();
		System.out.println("-------------------");
		d3.getData();
		System.out.println("-------------------");
		d4.getData();
		System.out.println("-------------------");
		d5.getData();
		System.out.println("-------------------");
		}
}
