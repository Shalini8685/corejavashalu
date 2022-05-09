/**
 * 
 */
package patterns;

/**
 * @author Shalini
 *
 */
public class modulus {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 1;
		for(int i=0;i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if (i%2==0) 
				//if (j%2==0) --> vertical printing 
				{
					System.out.print("1");
					System.out.print("	");
					
				}
								
				else {
					System.out.print("0");
					System.out.print("	");
				}
				
			}
			System.out.println();
		}

	}

}
