import java.util.Scanner;

/**
 * 
 */

/**
 * @author Shalini
 *
 */
public class aadhar {
	String name;
	String ad_id;
	String father_name;
	String addr;
	static String nationality;
	long phn;
	String dob;
	
	static {
		nationality = "INDIAN";
	}
	
	void collect_data() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NAME : ");
		name = sc.next();
		
		System.out.println("ENTER THE AADHAR ID : ");
		ad_id = sc.next();
		
		System.out.println("ENTER THE FATHER NAME : ");
		father_name = sc.next();
		
		System.out.println("ENTER THE ADDRESS : ");
		addr = sc.next();
		
		System.out.println("ENTER THE PHONE NO. : ");
	    phn = sc.nextLong();
	    
	    System.out.println("ENTER THE DATE OF BIRTH : ");
	    dob = sc.next();
	}
	
	void display() {
		System.out.println(name);
		System.out.println(ad_id);
		System.out.println(addr);
		System.out.println(phn);
		System.out.println(dob);
		System.out.println(nationality);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		aadhar a1 = new aadhar();
		a1.collect_data();
		a1.display();
		System.out.println("-----------------------");
		aadhar a2 = new aadhar();
		a2.collect_data();
		a2.display();
	}

}
