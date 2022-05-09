/**
 * 
 */
package patterns;

import java.util.Scanner;

/**
 * @author Shalini
 *
 */
public class starline {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NO. OF STARS : ");
		 int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.print(" * ");
		}
		System.out.println();
			for(int i=0; i<n; i++) {
			System.out.println(" $ ");
		}
	
	}
}
