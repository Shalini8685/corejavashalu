/**
 * 
 */
package oops;

/**
 * @author Shalini
 *
 */
//COMPOSITE OBJECT
class os{
	private float version;
	private String name;
	//USING THIS CONSTRUCTOR, WE WILL ASSIGN VALUES OF COMPOSITE OBJECT
	public os(float version, String name) {
		super();
		this.version = version;
		this.name = name;
	}
	//USING THIS CONSTRUCTOR,WE WILL GET VALUE OF VERSION INDEPENDENTLY
	public float getVersion() {
		return version;
	}
	//USING THIS CONSTRUCTOR,WE WILL GET VALUE OF NAME INDEPENDENTLY
	public String getName() {
		return name;
	}
	
}
//AGGREGATE OBJECT
class charger{
	private String brand;
	private int volts;
	//USING THIS CONSTRUCTOR, WE WILL ASSIGN VALUES OF AGGREGATE OBJECT
	public charger(String brand, int volts) {
		super();
		this.brand = brand;
		this.volts = volts;
	}
	//USING THIS CONSTRUCTOR,WE WILL GET VALUE OF BRAND INDEPENDENTLY
	public String getBrand() {
		return brand;
	}
	//USING THIS CONSTRUCTOR,WE WILL GET VALUE OF VOLTS INDEPENDENTLY
	public int getVolts() {
		return volts;
	}
}
//MAIN OBJECT
class mobile{
	os os = new os(11,"ANDROID");
	void hasACharger(charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getVolts());
	}
}

public class hasA2 {

	public static void main(String[] args) {
		mobile m = new mobile();
		charger c = new charger("REDMI11", 11);
		System.out.println("OS DETAILS:");
		System.out.println(m.os.getName());//ANDROID
		System.out.println(m.os.getVersion());//11
		System.out.println();
		System.out.println("CHARGER DETAILS:");
		m.hasACharger(c);//REDMI11 AND 11
		
		m=null;   //nullifying values of main object
//		System.out.println("OS DETAILS:");
//		System.out.println(m.os.getName());
//		System.out.println(m.os.getVersion());
//		System.out.println();
//		
//		System.out.println("CHARGER DETAILS:");
//		System.out.println(c.getBrand());//REDMI11
//		System.out.println(c.getVolts());//11
			}
}
