 import java.util.Scanner;

public class Hello {
	
	static final String  uniname = "UCSY";
	String name;
	int age;
	String major;
	
	public void askNans () {
		System.out.println("Enter name :");
		Scanner n = new Scanner(System.in);
		name = n.nextLine();
		
		System.out.println("Enter age :");
		age = n.nextInt();
		
		n.nextLine();
		System.out.println("Enter major :");
		major = n.nextLine();
		
	}
	
	public void display () {
		System.out.println("Your name is " + name);
		System.out.println("Your age is " + age);
		System.out.println("Your major is " + major);
	}
	
	
	public static void main(String args[]) {
		System.out.println("Hello");
		
		Hello obj1;
		
		obj1 = new Hello();
		
		obj1.askNans();
		obj1.display();
		
	}
}

