//ProblemSolving.java
/*This program will display the product of three numbers to 3 decimal places*/

import java.util.Scanner;

public class ProblemSolving {
   public static void main(String args[])
      {
   
   float firstNumber,secondNumber,thirdNumber;
   	
   Scanner input = new Scanner(System.in);    	
   	
   System.out.print("Please enter the first number: ");
   firstNumber = input.nextFloat();
   
   System.out.print("Please enter the second number: ");
   secondNumber = input.nextFloat();
   
   System.out.print("Please enter the third number: ");
   thirdNumber = input.nextFloat();
   
   System.out.println("\n*****Results of Calculations*****" + "\n\n\nThe product of the three numbers is " +
   	                  String.format("%.3f",(firstNumber*secondNumber*thirdNumber)));
   	                  
      }               
}   	                     	                  	