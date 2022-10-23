package Day2;

public class Operator {

	public static void main (String[] args) {
		int num1 = 100 , num2 = 200;
		
		System.out.println("100 + 200 = " + (num1 + num2) );
		System.out.println("100 == 200 ?" + (num1 == num2) );
		
		int result = (num1 > num2) ? num2 : num1;
		
		System.out.println(result);
	}
	
}
