package Chapter_1;

import java.util.Scanner;

//This program allows users to input a radius with a few restrictions.
//The user must enter a number greater than 0.
public class ComputeAreaWithSelection {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = in.nextDouble();

//Assign variables such as pi and area.		
		double pi = 3.1415;
		double area;

//If statement to allow only numbers greater than 0 to be entered.
	if(radius >= 0) {
		area = pi * radius * radius;
		System.out.print("The area of a circle of" + " " + radius + " " + "is" + " " + area + "");
	}
	else {
		System.out.print("Please enter a number greater than 0.");
		}
	}
}