package Chapter_4;

import java.util.Scanner;
	
//This program will calculate the sides and
//angles of a triangle and print out the results.
public class ComputeAngles {
	public static void main(String[] args) {
		
// The user will enter three sets of coordinates with spaces in between.  
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the coordinates of three points separated "
				+ "by spaces like x1 y1 x2 y2 x3 y3: " );

//The variables need to be double because we will be finding the angles of a triangle.
		double x1 = in.nextDouble();
		double y1 = in.nextDouble();
		double x2 = in.nextDouble();
		double y2 = in.nextDouble();
		double x3 = in.nextDouble();
		double y3 = in.nextDouble();

//We will calculate the sides of the triangle. 		
		double a = Math.sqrt((x2 - x3) * (x2 -x3)
				 + (y2 - y3) * (y2 - y3));
		double b = Math.sqrt((x1 - x3) * (x1 -x3)
				 + (y1 - y3) * (y1 - y3));		
		double c = Math.sqrt((x1 - x2) * (x1 -x2)
				 + (y1 - y2) * (y1 - y2));

//We will calculate the angles of the triangle.		
		double A = Math.toDegrees(Math.acos((a * a - b * b - c * c)
				/ (-2 * b * c)));
		double B = Math.toDegrees(Math.acos((b * b - a * a - c * c)
				/ (-2 * a * c)));
		double C = Math.toDegrees(Math.acos((c * c - b * b - a * a)
				/ (-2 * a * b)));

//The computer will print out the angles of the triangle.		
		System.out.print("The three angles are "
				+ Math.round(A * 100) / 100.0 + " "
				+ Math.round(B * 100) / 100.0 + " "
				+ Math.round(C * 100) / 100.0);
	}	
}
