//ProblemSolving2.java
/*This program will display the equivalency of ounces to pounds with ounces*/

import java.util.Scanner;

public class ProblemSolving2 {
   public static void main(String args[])
      {
   
   
      int ounces, pounds, remainingOunces;
   
      Scanner input = new Scanner(System.in);
 
      System.out.print("Please enter an amount in ounces: ");
      ounces = input.nextInt();
      
      pounds = ounces/16;
      remainingOunces = ounces%16;
 
      System.out.println("\n" + ounces + " oz is equivalent to " + pounds + "lbs " + remainingOunces + "oz\n\n\n");
      
      }
} 
   	