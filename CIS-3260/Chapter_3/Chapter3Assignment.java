package Chapter_3;

import java.util.Scanner;

public class Chapter3Assignment {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter today's day: ");
		int day = in.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		int elapsed = in.nextInt();
		
		int future = (day + elapsed % 7);
		
		String today;
		String newday;
		
		switch(day) {
		case 0:
			today = "Sunday"; break;
		case 1:
			today = "Monday"; break;
		case 2:
			today = "Tuesday"; break;
		case 3:
			today = "Wednesday"; break;
		case 4:
			today = "Thursday"; break;
		case 5:
			today = "Friday"; break;
		case 6:
			today = "Saturday"; break;
		default:
				today = "Please enter a number between 0-6.";
				System.exit(1);	
		}
		
		switch(future) {
		case 0:
			newday = "Sunday"; break;
		case 1:
			newday = "Monday"; break;
		case 2:
			newday = "Tuesday"; break;
		case 3:
			newday = "Wednesday"; break;
		case 4:
			newday = "Thursday"; break;
		case 5:
			newday = "Friday"; break;
		case 6:
			newday = "Saturday"; break;
		default:
				newday = "Please enter a valid number.";
				System.exit(1);
		}
	System.out.print("Today is " + today + " and the future day is " + newday + ".");
	
	}
}
