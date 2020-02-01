package Chapter_2;
import java.util.Scanner; 

public class ComputeSum {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);   
     
     System.out.print("Enter first int number: ");
     int number1 = input.nextInt();
     
     System.out.print("Enter second double number: ");
    double number2 = input. nextDouble();

     System.out.print("Enter third int number: ");
     int number3 = input.nextInt();

    // Compute average
    double sumOfThree = number1 + number2 + number3 ;

    // Display result
    System.out.println("The sum of " + number1 + " " + number2
      + " " + number3 + " is " + sumOfThree);
  } 
}