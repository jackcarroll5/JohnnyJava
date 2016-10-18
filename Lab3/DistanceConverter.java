//DistanceConverter.java
/*This program reads in a distance in yards and converts it to metres using the
 *appropriate conversion factor*/

import java.util.Scanner;

public class DistanceConverter {
   public static void main (String args[])
      {
          float yards;
          final float CONVERSION_FACTOR = 0.9144f;

          Scanner input = new Scanner(System.in);

          System.out.print("Please enter the distance in yards: ");

          yards = input.nextFloat();

          System.out.println("\n\nThe equivalent distance in metres is " +
          String.format("%.2f",CONVERSION_FACTOR*yards)+"metres");

      }
}