/**
 * 
 */
package com.gqt.fstraining.array;

import java.util.Scanner;

/**
 * @author Shalini
 *
 */
public class array3Djag {

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
		System.out.println("ENTER THE NO. OF COLLEGES ");
		int m = sc.nextInt();
		int arr[][][] = new int[m][][];
		
	//COLLECTING THE NO. OF CLASSROOMS
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the no. of classrooms in college "+i);
		arr[i] = new int[sc.nextInt()][];
				}
		//COLLECTING THE NO. OF STUDENTS IN CLASSROOMS
		for (int i=0; i<arr.length; i++) {
			System.out.println("INSIDE COLLEGE :" +i);
		for(int j=0; j<arr[i].length; j++) {
			System.out.println("ENTER THE NUMBER Of STUDENTS IN CLASSROOM :"+(j+1));
			
		arr[i][j] = new int[sc.nextInt()];
			}
		}
		//COLLECTING THE MARKS OF STUDENTS
		for(int i=0; i<arr.length; i++) {
			System.out.println("INSIDE COLLEGE- "+i);
		for (int j=0;j<arr[i].length; j++) {
			System.out.println("IN CLASSROOM "+j);
		for (int k=0;k<arr[i][j].length; k++) {
			System.out.println("ENTER THE MARKS OF STUDENT "+(k+1));
		arr[i][j][k] = sc.nextInt();
				}
		}
		}
		//TO DISPLAY THE MARKS OF STUDENTS IN CLASSROOMS OF COLLEGES
		for(int i=0;i<arr.length; i++) {
			System.out.println("INSIDE COLLEGE : "+i);
		for(int j=0;j<arr[i].length; j++) {
			System.out.println("IN C : "+j);
		for(int k=0;k<arr[i][j].length; k++) {
			System.out.println("THE MARKS OF STUDENT "+(k+1)+ " IS "+arr[i][j][k]);
				}
		}
		}
	}

}
