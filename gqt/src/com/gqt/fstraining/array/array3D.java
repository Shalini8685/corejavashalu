/**
 * 
 */
package com.gqt.fstraining.array;

import java.util.Scanner;

/**
 * @author Shalini
 * description:This is the code for demonstration of 3-dimentional array
 * requirement to store marks of n students for m classrooms and o colleges
 *
 */
public class array3D {
	/**
	 * @param args
	 * @param sc
	 * @param arr
	 * @param n
	 * @param m
	 * @param o
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENTER THE TOTAL NUMBER OF COLLEGES : ");
		  int o = sc.nextInt();
		System.out.println("ENTER THE TOTAL NUMBER OF CLASSROOMS : ");
		  int m = sc.nextInt();
		System.out.println("ENTER THE TOTAL NUMBER OF STUDENTS IN EACH CLASSROOM : ");
		int n = sc.nextInt();
		
		int arr[][][] = new int[o][m][n];
		
		System.out.println("ARRAY IS READY FOR OPERATION");
		System.out.println("THE LENGTH OF THE OUTER PORTION OF ARRAY IS:" +arr.length);
		
		
		//THE CODE TO STORE THE MARKS OF n STUDENTS INSIDE m CLASSROOMS IN o COLLEGES
		for (int i=0; i<arr.length; i++) {
		System.out.println("THE COUNT OF CLASSROOMS IN COLLEGE  "+(i+1)+" IS:" +arr[i].length);
		for(int j=0; j<arr[i].length; j++) {
		System.out.println("THE COUNT OF STUDENTS IN EACH CLASSROOM  "+(j+1)+ " IS:" +arr[j].length);
		for(int k=0; k<arr[i][j].length; k++) {
		System.out.println("ENTER THE MARKS OF STUDENT -"+(k+1)+ "IN CLASSROOM - "+(j+1));
		arr[i][j][k] = sc.nextInt();
				}
				
			}
		}
		//THE CODE TO DISPLAY THE MARKS OF STUDENTS
		for(int i=0; i<arr.length; i++) {
			System.out.println("IN COLLEGE : "+(i+1));
		for(int j=0; j<arr[i].length; j++) {
			System.out.println("INSIDE CLASSROOM : "+(j+1));
		for(int k=0; k<arr[i][j].length;k++) {
			System.out.println("THE MARKS OF STUDENT - "+(k+1)+" IS: "+arr[i][j][k]);
		}
		}
		}
	}

}
