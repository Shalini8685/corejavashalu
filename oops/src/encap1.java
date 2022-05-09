/**
 * 
 */


/**
 * @author Shalini
 *
 */
class cricketer{
	private String name;
	private int age;
	private int matches;
	private int runs;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getMatches() {
		return matches;
	}
	
	public void setMatches(int matches) {
		this.matches = matches;
	}
	
	public int getRuns() {
		return runs;
	}
	
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	void setData(String name, int age, int matches, int runs) {
		this.name=name;
		this.age=age;
		this.matches=matches;
		this.runs=runs;
	}
	void getData() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(matches);
		System.out.println(runs);
	}
	void bat() {
		System.out.println("CRICKETER IS BATTING");
	}
}void bowl(){
	System.out.println("CRICKETER IS BOWLING");
}
public class encap1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cricketer c1 = new cricketer();
		cricketer c2 = new cricketer();
		
		c1.setData("DHONI", 28, 40, 600);
		c2.setData("GANGULY",35, 60, 800);
		
		c1.getData();
		c2.getData();
		System.out.println("-------------------");
		
		c1.bat();
		c1.bowl();
		
		c2.bat();
		c2.bowl();
		}

}
