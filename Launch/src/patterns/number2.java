/**
 * 
 */
package patterns;

/**
 * @author Shalini
 *
 */
public class number2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 1;
		for(int i=1; i<=5; i++) {
			//c =i; - 1 to 25 vertically
			for(int j=1; j<=5; j++) {
				if (c<10) {
					System.out.print("0");
				}
				System.out.print(c);
				System.out.print("	");
				//c = c+5;
				c = c+1;
			}
			System.out.println();
		}
	}

}
