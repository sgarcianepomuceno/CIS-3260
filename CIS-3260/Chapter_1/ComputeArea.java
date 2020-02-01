package Chapter_1;

import java.util.Scanner;

//This program computes the area of a circle using users input.
public class ComputeArea {
	
//Main Method and scanner.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		int radius = in.nextInt();
		
//Assign variables.
		double pi;
		double area;
		
		pi = 3.1415;
	
//Equation to compute area.
	area = pi * radius * radius;
	
//Display results.
	System.out.println("The area of a circle with a radius of" + " " + radius + " " + "is" + " " + area);
				
	}
}
