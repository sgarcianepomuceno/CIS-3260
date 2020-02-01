package Chapter_2;

import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number for seconds: ");
		int seconds = in.nextInt();
		
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		
		System.out.print(seconds + " " + "seconds is" + " " + minutes + " " 
		+ "minutes and" + " " + remainingSeconds + " " + "seconds!");
		
	}
}
