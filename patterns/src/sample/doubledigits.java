/**
 * 
 */
package sample;

/**
 * @author Shalini
 *
 */
public class doubledigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if (count<10) {
					System.out.print("0");
					System.out.print(count);
					System.out.print("   ");
					count++;
				}
				
		System.out.print(count);
		System.out.print("	");
		count++;
	}
	System.out.println();
}
	}
}
