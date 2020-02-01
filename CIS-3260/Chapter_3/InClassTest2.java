package Chapter_3;

import java.util.Scanner;

//This program will tell user if the number they entered is even or odd
public class InClassTest2 {
public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	System.out.print("Enter number: ");
	int number = in.nextInt();

//Insert equation to determine whether the entered number's remainder is 0 or 1	
	int remainder = number % 2;
			
//DO NOT forget that if you're having something equal to a value then it must be double equal
	if(remainder == 0) {
		System.out.print("I love Java!");
	}	
	else {
		System.out.print("I hate Java!");
	}
			
}

}
