/**
 * 
 */
package com.gqt.fstraining.array;

import java.util.Scanner;

/**
 * @author Shalini
 * description:This is the code for demonstration of 1-dimentional array
 * requirement to store marks of n students
 */
public class array1D {
			/**
			 * @param args
			 * @param sc
			 * @param arr
			 * @param n
			 */
			public static void main(String[] args) {
						
				System.out.println("ENTER THE NUMBER OF STUDENTS");
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int arr[] = new int [n];
			System.out.println("ARRAY IS READY FOR OPERATION");
			System.out.println("THE LENGTH OF THE GIVEN ARRAY IS:" +arr.length);
			
			//THE CODE TO COLLECT AND STORE THE MARKS OF n STUDENTS
			for (int i=0; i<arr.length;i++) {
				System.out.println("ENTER THE MARKS OF STUDENT - "+(i+1));
				arr[i] = sc.nextInt();
			}
			
			//THE CODE TO DISPLAY THE MARKS OF STUDENTS n
			for (int i=0; i<arr.length; i++) {
				System.out.println("THE MARKS OF STUDENT -"+(i+1)+" IS:" +arr[i]);
			}
				
			
	}

}
