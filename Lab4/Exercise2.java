//Exercise2.java
/*This program will ask the user to input a series of prices to determine the correct PAYE
 *owed by the at employee for that month's work*/

import java.util.Scanner;

public class Exercise2 {
   public static void main(String args[])
      {
   
          int grossIncome,pensionPayment,cutOffPoint,taxCredits;
          final float CONSTANT1 = 20f, 
          	          CONSTANT2 =42f;
          	
   
          Scanner input = new Scanner(System.in);

          System.out.print("Please enter your gross income: ");
          grossIncome = input.nextInt();
          
          System.out.print("Please enter your pension payment: ");
          pensionPayment = input.nextInt();
          
          System.out.print("Please enter your cut-off point: ");
          cutOffPoint = input.nextInt();
          
          System.out.print("Please enter your tax-credits: ");
          taxCredits = input.nextInt();
          
          if (grossIncome > cutOffPoint)
              System.out.println("\nThe PAYE due by this employee is EUR " + String.format("%.2f" ,((CONSTANT1/100 *cutOffPoint)+((CONSTANT2/100) * (grossIncome-cutOffPoint-pensionPayment))-(taxCredits))));
          else
          	  System.out.println("\nThe PAYE due by this employee is EUR " + String.format("%.2f",(CONSTANT1/100) * (grossIncome - pensionPayment) - (taxCredits)));
          	  
      }    	  
}          	  