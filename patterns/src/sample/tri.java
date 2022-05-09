/**
 * 
 */
package sample;

/**
 * @author Shalini
 *
 */
public class tri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 5;		
		for (int i = 1; i <= count; i++) {
              for (int j = count; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++) 
                        { 
                                System.out.print("*"); 
                        } 
                        System.out.println(); 
                } 
                for (int i = count - 1; i >= 1; i--) {
			for (int j = count - 1; j >= i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= (i * 2) - 1; k++)
			{
				System.out.print(" ");
			}
			System.out.println();
		}
	}	
	}
	