package Assignmetns;

import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args) {
		
		int n;
		int noOfPositive = 0;
		int noOfNegative = 0;
		int noOfZero = 0;
		System.out.println("How many numbers you want to type - ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int array[] = new int [n];
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Enter any number - ");
			array[i] = sc.nextInt();
			System.out.print("\n");
			
			if(array[i]>0) {
				noOfPositive++;
			}
			else if(array[i] == 0) {
				noOfZero++;
			}
			else {
				noOfNegative++;
			}
		}
		
		System.out.println("Numbers of zero - " + noOfZero);
		System.out.println("Numbers of positive number - " + noOfPositive);
		System.out.println("Numbers of negative number - " + noOfNegative);
	}
	
}
