package Chapter_5;

import java.util.Scanner;

//This program will count the number of upper case letters, lower case letters,
//and numbers from what the user inputs.
public class Chapter5Assignment {
	public static void main(String[] args) {

//Create scanner so that user can input string.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sent = scan.nextLine();

//Count the number of lower case letters.
		int lower = 0;
		for (int i = 0; i < sent.length(); i++) {
			if (Character.isLowerCase(sent.charAt(i)))
				lower++;
		}

//Count the number of upper case letters.
		int upper = 0;
		for (int i = 0; i < sent.length(); i++) {
			if (Character.isUpperCase(sent.charAt(i)))
				upper++;
		}

//Count the number of numbers .		
		int number = 0;
		for (int i = 0; i < sent.length(); i++) {
			if (Character.isDigit(sent.charAt(i)))
				number++;
		}
//Display the results.
		System.out.println(sent + " has " + lower + " lowercase letters, "
				+ upper + " uppercase letters, and " + number + " numbers.");
	}
}
