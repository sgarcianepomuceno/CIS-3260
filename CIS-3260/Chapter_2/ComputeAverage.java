package Chapter_2;

import java.util.Scanner;

public class ComputeAverage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		
		int sum = (num1 + num2 + num3);
		int ave = sum / 3;
		
		System.out.print("The average of" + " " + num1 + " " + num2
				+ " " + num3 + " " + "is" + " " + ave + "!");
	}
}
