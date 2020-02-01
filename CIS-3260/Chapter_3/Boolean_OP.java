package Chapter_3;

import java.util.Scanner;

//This program will display What is the sum of two numbers the user enter.
//It will also display the answer the user enter.
public class Boolean_OP {
	public static void main(String[] args) {
	
//The user will enter two numbers and the sum of the two numbers.		
	Scanner in = new Scanner(System.in);
		int number1 = in.nextInt();
		int number2 = in.nextInt();
		int answer = in.nextInt();
		
		System.out.println("What is " + number1 + " + " + number2 + "?");
		System.out.print(number1 + " + " + number2 + " is " + answer);
	}
}