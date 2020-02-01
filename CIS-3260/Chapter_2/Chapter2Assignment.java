package Chapter_2;

//Import Scanner to receive input from user.

import java.util.Scanner;

//Class name: Chapter2Assignment
public class Chapter2Assignment {
	
//Write main method and have user input number of days.
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of days: ");
		int days = in.nextInt();

//If statement to determine the number of weeks and days. 
	if (days >= 0) {
		int weeks = days/7;
		int remainder = days % 7;
		System.out.println(days + " days is" + " " + weeks + " weeks and" + " " + remainder + " day(s).");
		}
		else {
		System.out.print("Enter a number greater than 0!");
		}
	}
		
		
}