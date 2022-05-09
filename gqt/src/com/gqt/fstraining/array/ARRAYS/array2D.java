/**
 * 
 */
package com.gqt.fstraining.array;

import java.util.Scanner;

/**
 * @author Shalini
 *description:This is the code for demonstration of 2-dimentional array
 *requirement to store marks of n students from m classrooms
 */
public class array2D {

	/**
	 * @param args
	 * @param sc
	 * @param arr
	 * @param n
	 * @param m
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE TOTAL NUMBER OF CLASSROOMS :");
		  int m = sc.nextInt();
		System.out.println("ENTER THE TOTAL NUMBER OF STUDENTS IN EACH CLASSROOM:");
		  int n = sc.nextInt();
		
		  int arr[][] = new int[m][n];
		 System.out.println("ARRAYS ARE READY FOR OPERATION");
		 System.out.println("THE LENGTH OF OUTER PORTION OF ARRAY : "+arr.length);
		 
		 //THE CODE TO STORE THE MARKS OF n STUDENTS INSIDE M CLASSROOMS
		 for (int i=0; i<arr.length; i++) {
			 System.out.println("THE COUNT OF STUDENTS INSIDE CLASSROOM - "+(i+1)+ " IS " +arr[i].length);
		 for (int j=0; j<arr[i].length; j++) {
			 System.out.println("ENTER THE MARKS OF STUDENT -"+(j+1));
			 
			 arr[i][j] = sc.nextInt();
			 		 }
					 }
        //THE CODE TO DISPLAY THE MARKS OF STUDENTS IN CLASSROOMS
		 for (int i=0 ; i<arr.length; i++) {
			 System.out.println("INSIDE CLASSROOM :"+(i+1));
		 for (int j=0; j<arr[i].length; j++) {
			 System.out.println("THE MARKS OF STUDENT - "+(j+1)+ " IS " +arr[i][j]);
			 		 }
		 }
	}

}
