/**
 * 
 */
package sample;

import java.util.Scanner;

/**
 * @author Shalini
 *
 */
public class name {

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
				
				if (i==0 || j==0 && i<=(n/2) || i==(n/2) || 
						j==(n-1) && i>=(n/2) || i==(n-1)) //S
				{
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			for(int j=0 ; j<n; j++) {
			if ( j==0 || j==(n-1) ||i==(n/2)) //H
			{
				System.out.print(" *");
			}
			else {
				System.out.print("  ");
			}
		}
			System.out.print("  ");
			
			for(int j=0 ; j<n; j++) {
				if (i==(n/2) || j==0 && i>=(n/2) || 
						 i+j==(n/2) || j-i==(n/2)||
						j==(n-1) && i>=(n/2)) //A
				{
					System.out.print(" *");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.print("  ");
			
		
		for(int j=0 ; j<n; j++) {
	
			if ( j==0 || i==(n-1)) //L
			{
				System.out.print(" *");
			}
			else {
				System.out.print("  ");
			}
		}
          System.out.print("  ");
					
		for(int j=0 ; j<n; j++) {
			
			if (i==0 || i==(n-1) ||j==(n/2)) //I
			{
				System.out.print(" *");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.print("  ");
		
		for(int j=0 ; j<n; j++) {
			if ( j==0 || j==(n-1) || i==j) //N
			{
				System.out.print(" *");
			}
			else {
				System.out.print("  ");
			}
		}
		 System.out.print("  ");
			
			for(int j=0 ; j<n; j++) {
				
				if (i==0 || i==(n-1) ||j==(n/2)) //I
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
