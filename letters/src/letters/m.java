/**
 * 
 */
package letters;

import java.util.Scanner;

/**
 * @author Shalini
 *
 */
public class m {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE SIZE");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			for(int j=0 ; j<n; j++) {
				
				if ( j==0 || j==(n-1) || i==j && i<=(n/2) ||
						i<=(n/2) && i+j==(n-1))
				{
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}



	}

}
