package Chapter_6;

import java.util.Scanner;

public class PrintMyName { 
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter your name: ");
       String name = input.nextLine();
       printlovejava (name);
}

     public static void printlovejava(String s) {
         System.out.println(s + " Loves Java!");
      }
}
