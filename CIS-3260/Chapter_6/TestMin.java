package Chapter_6;

import java.util.Scanner;

	public class TestMin { 
     public static void main(String[] args) { 
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter two numbers with a space inbetween: ");
    int i = in.nextInt();
	int j = in.nextInt();
      
       int k = min(i, j); 
       System.out.println("The minimum number between " + i + " and " + j + " is " + k); 
    }
     public static int min(int num1, int num2) { 
    	 int result; 
    	 	if (num1 < num2)
    	 		result = num1; 
    	 	else
    	 		result = num2; 
    	 	return result; 
     }
}