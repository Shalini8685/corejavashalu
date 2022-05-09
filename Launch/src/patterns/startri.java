/**
 * 
 */
package patterns;

import java.util.Scanner;

/**
 * @author Shalini
 *
 */
public class startri {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NO. OF STARS : ");
		 int n = sc.nextInt();
		 
		 for (int i=0; i<n; i++) {
			 for (int j=0; j<i; j++) {
				 System.out.print(" * ");
			 }System.out.println();
		 }
		 
		 Scanner sc1 = new Scanner(System.in);
			System.out.println("ENTER THE NO. OF STARS : ");
			 int m = sc1.nextInt();
			 
			 for (int i=0; i<m; i++) {
				 for (int j=m; j>i; j--) {
					 System.out.print(" * ");
				 }System.out.println();
			 }
	}

}
