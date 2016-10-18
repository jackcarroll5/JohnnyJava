//KWh.java
/*This program uses a nested-if statement to determine the cost of using
 *a certain number of units of electricity*/

import java.util.Scanner;

public class KWh {
   public static void main(String args[])
      {
          int units;
          float cost;

          Scanner input = new Scanner(System.in);

          System.out.print("Please enter the units used: ");
          units = input.nextInt();
          
          if(units<= 240)
                cost = units * 0.14f;
          else if(units<= 540)
                  cost = 240*0.14f + (units-240)*0.13f;
          else
                  cost = 240*0.14f + 300*0.13f + (units-540)*0.11f;
  
         System.out.println("\n\nThe cost of your electricity bill is EUR" +String.format("%,2f",cost));

      }
}




