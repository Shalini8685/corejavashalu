/**
 * 
 */
package sample;

/**
 * @author Shalini
 *
 */
public class conditionex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 25;
		int exp = 3;
		int salary = 25000;
		
		if (age>=25) {
			if (exp>=3) {
				if (salary<=25000) {
					salary = salary + 5000;
					
					System.out.println("SALARY IS INCREMENTED");
					System.out.println("NEW SALARY IS "+salary);
				}
				else {
					System.out.println("YOUR SALARY IS MORE THAN 25000");
				}
			}
			else {
				System.out.println("EXPERIENCE IS LESS THAN EXPECTED");
			}
		}
		else {
			System.out.println("YOUR AGE IS LESS THAN 25");
			
		}

	}

}
