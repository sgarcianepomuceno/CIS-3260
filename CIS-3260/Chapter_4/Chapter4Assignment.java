package Chapter_4;

import java.util.Scanner;

//This program will display the length and order the
//substring in alphabetical order from the two cities the user enters. 
public class Chapter4Assignment {
	public static void main(String[] args) {

//User will enter two cities.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first city: ");
		String city1 = scan.nextLine();
		System.out.println("Enter second city: ");
		String city2 = scan.nextLine();

//The console will print out the length of the two cities
		System.out.println("The length of " + city1 + " is " + city1.length());
		System.out.println("The length of " + city2 + " is " + city2.length());

//Determine the index of the two cities.
	int sub1 = city1.length();
	String subCity1 = city1.substring(sub1/2);
	int sub2 = city2.length();
	String subCity2 = city2.substring(sub2/2);

//Order the substring in alphabetical order.
	if (subCity1.compareTo(subCity2) < 0) {
		System.out.println(subCity1);
		System.out.println(subCity2);
	}	else {
		System.out.println(subCity2);
		System.out.println(subCity1);	
		}
	}
}
