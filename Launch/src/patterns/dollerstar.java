/**
 * 
 */
package patterns;

import java.util.Scanner;

/**
 * @author Shalini
 *
 */
public class dollerstar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NO. OF STARS AND DOLLERS : ");
		 int n = sc.nextInt();
		 
		for (int i=1;i<=n;i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(" $ ");
				System.out.print("	");
			}
			for (int j=1;j<=n;j++) {
				System.out.print(" * ");
				System.out.print("	");
			}
			System.out.println();
		}
		

	}

}
