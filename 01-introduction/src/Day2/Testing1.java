package Day2;

import java.util.Scanner;

public class Testing1 {

	public static void main (String[] args) {
		
		switch_function();
		
	}
	
	private static void switch_function() {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter food - ");
		String name = sc.nextLine();
		String category;
		
		switch(name) {
		case "burger":
			category = "Fast Food";
			break;
			
		case "pizza" :
			category = "Fast Food";
			break;
			
		case "yogurt":
			category = "Dessert";
			break;
			
		case "monhinga": 	
			category = "Burmese Food"; 	
			break;
			
		case "sushi":
			category = "Japanese Food";
			break;
			
		default:
			category = "Unknown";
		}
		
		System.out.println( name + " is " + category);
		sc.close();
	}
	
}
