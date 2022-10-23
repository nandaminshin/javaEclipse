package Assignmetns;

import java.util.Scanner;

public class Assignment2 {
	
	public static void main (String[] args) {
		
		int c1 =-1,c2=-1,c3=-1,c4=-1;
		int totalSleep = 0;
		String k = "";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("When do you go bed? - ");
			String goTime = sc.nextLine();
			switch (goTime) {
			case "1 am":
				c1= 1;
			break;
			
			case "2 am":
				c1= 2;
			break;
				
			case "3 am":
				c1= 3;
			break;
			
			case "4 am":
				c1= 4;
			break;
			
			case "5 am":
				c1= 5;
			break;
			
			case "6 am":
				c1= 6;
			break;
			
			case "7 am":
				c1= 7;
			break;
			
			case "8 am":
				c1= 8;
			break;
			
			case "9 am":
				c1= 9;
			break;
			
			case "10 am":
				c1= 10;
			break;
			
			case "11 am":
				c1= 11;
			break;
			
			case "12 am":
				c1= 0;
			break;
			
			
			case "1 pm":
				c2= 1;
			break;
			
			case "2 pm":
				c2= 2;
			break;
				
			case "3 pm":
				c2= 3;
			break;
			
			case "4 pm":
				c2= 4;
			break;
			
			case "5 pm":
				c2= 5;
			break;
			
			case "6 pm":
				c2= 6;
			break;
			
			case "7 pm":
				c2= 7;
			break;
			
			case "8 pm":
				c2= 8;
			break;
			
			case "9 pm":
				c2= 9;
			break;
			
			case "10 pm":
				c2= 10;
			break;
			
			case "11 pm":
				c2= 11;
			break;
			
			case "12 pm":
				c2= 0;
			break;
			
			default:
				c1=-1;
				c2=-1;
			}
			
			System.out.println("When do you get up? - ");
			String upTime = sc.nextLine();
			switch(upTime) {
			case "1 am":
				c3= 1;
			break;
			
			case "2 am":
				c3= 2;
			break;
				
			case "3 am":
				c3= 3;
			break;
			
			case "4 am":
				c3= 4;
			break;
			
			case "5 am":
				c3= 5;
			break;
			
			case "6 am":
				c3= 6;
			break;
			
			case "7 am":
				c3= 7;
			break;
			
			case "8 am":
				c3= 8;
			break;
			
			case "9 am":
				c3= 9;
			break;
			
			case "10 am":
				c3= 10;
			break;
			
			case "11 am":
				c3= 11;
			break;
			
			case "12 am":
				c3= 0;
			break;
			
			
			case "1 pm":
				c4= 1;
			break;
			
			case "2 pm":
				c4= 2;
			break;
				
			case "3 pm":
				c4= 3;
			break;
			
			case "4 pm":
				c4= 4;
			break;
			
			case "5 pm":
				c4= 5;
			break;
			
			case "6 pm":
				c4= 6;
			break;
			
			case "7 pm":
				c4= 7;
			break;
			
			case "8 pm":
				c4= 8;
			break;
			
			case "9 pm":
				c4= 9;
			break;
			
			case "10 pm":
				c4= 10;
			break;
			
			case "11 pm":
				c4= 11;
			break;
			
			case "12 pm":
				c4= 0;
			break;
			
			default:
				c3=-1;
				c4=-1;
			}
			
			if(c1==-1 || c2==-1 || c3==-1 ||  c4==-1) {
				totalSleep = -1;
			}
			
			if( c1 >= 0 && c3 >= 0) {
				totalSleep = c3-c1;
			}
			if(c1 >= 0 && c4 >= 0) {
				totalSleep = (12-c1)+c4;
			}
			if(c2 >= 0 && c3 >= 0) {
				totalSleep = (12-c2)+c3;
			}
			if(c2 >= 0 && c4 >= 0) {
				totalSleep = c4 - c2;
			}
			
			
			
			if(totalSleep == -1) {
				System.out.println("Syntax Error!!! Check again.");
			}
			
			else if(totalSleep > 8) {
				System.out.println( "Your total sleep time is " + totalSleep + " hours.You are abnormal!");
			}
			else if(totalSleep >= 5 && totalSleep < 8) {
				System.out.println( "Your total sleep time is " + totalSleep + " hours.You take care your health well!");
			}
			else {
				System.out.println( "Your total sleep time is " + totalSleep + " hours.You are very hardworking!");
			}
			
			System.out.println("Press 'exit' to exit the program :");
			k = sc.nextLine();
		}
		while(!k.equals("exit"));
	}
}
