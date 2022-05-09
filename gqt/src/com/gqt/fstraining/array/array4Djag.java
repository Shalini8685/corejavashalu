/**
 * 
 */
package com.gqt.fstraining.array;

import java.util.Scanner;

/**
 * @author Shalini
 *
 */
public class array4Djag {

	/**
	 * @param <arr>
	 * @param args
	 * @param sc
	 * @param arr
	 * @param n
	 * @param m
	 * @param o
	 * @param p
	 */
	public static <arr> void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NO. OF UNIVERSITIES ");
		int p = sc.nextInt();
		int arr[][][][] = new int[p][][][];
		
		//COLLECTING NO. OF COLLEGES IN p UNIVERSITIES
		for(int i=0; i<arr.length; i++) {
			System.out.println("ENTER THE NO. OF COLLEGES IN UNIVERSITY  "+i);
		arr[i]= new int[sc.nextInt()][][];
				}
								
		//COLLECTING NO. OF CLASSROOMS
		for(int i=0; i<arr.length; i++) {
			System.out.println("INSIDE UNIVERSITY "+i);
		for(int j=0; j<arr[i].length; j++) {
			System.out.println("ENTER THE NO. OF CLASSROOMS IN COLLEGE "+j);
		arr[i][j] = new int[sc.nextInt()][];
		}
		}
		//COLLECTING NO. OF STUDENTS
		for (int i=0; i<arr.length; i++) {
			System.out.println("INSIDE UNIVERSITY "+i);
		for(int j=0; j<arr[i].length; j++) {
			System.out.println("IN COLLEGE "+j);
		for(int k=0; k<arr[i][j].length; k++) {
			System.out.println("ENTER THE NO. OF STUDENTS IN CLASSROOM "+k);
		arr[i][j][k] = new int[sc.nextInt()];
		}
		}
		}
		//COLLECTING MARKS OF STUDENTS
		for (int i=0; i<arr.length; i++) {
			System.out.println("INSIDE UNIVERSITY "+i);
		for(int j=0; j<arr[i].length; j++) {
			System.out.println("IN COLLEGE "+j);
		for(int k=0; k<arr[i][j].length; k++) {
			System.out.println("INSIDE CLASSROOM "+k);
		for(int l=0;l<arr[i][j][k].length; l++) {
			System.out.println("ENTER THE MARKS OF STUDENT "+(l+1));
			arr[i][j][k][l] = sc.nextInt();
		}
		}}}
		//DISPLAYING THE MARKS OF STUDENTS
		for (int i=0; i<arr.length; i++) {
			System.out.println("INSIDE UNIVERSITY "+i);
		for(int j=0; j<arr[i].length; j++) {
			System.out.println("IN COLLEGE "+j);
		for(int k=0; k<arr[i][j].length; k++) {
			System.out.println("INSIDE CLASSROOM "+k);
		for(int l=0;l<arr[i][j][k].length; l++) {
			System.out.println("THE MARKS OF STUDENT "+(k+1)+" IS "+arr[i][j][k][l]);
		}}}
		}
		}
}


