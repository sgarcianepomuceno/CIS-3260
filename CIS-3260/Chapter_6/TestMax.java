package Chapter_6;

import java.util.Scanner;

public class TestMax {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		int greater = max(num1, num2);
		
		System.out.println("The maximum number of " + num1 + " and " + num2
				+ " is " + greater);
}
	public static int max(int num1, int num2) {
	
		int result;
			if(num1 > num2)
				result = num1;
			else
				result = num2;
			
			return result;
	}
}
