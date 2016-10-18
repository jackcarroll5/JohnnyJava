//Exercise3Lab5.java
/*This program will ask the user for the area of a circle and for the volume of a sphere
 *to carry out certain actions to calculate the area and volume where possible*/

import java.util.Scanner;

public class Exercise3Lab5 {
   public static void main(String args[])
      {
   
final float PI = 3.142f;
float area,radiusCircle,radiusSphere;
char choice;
String choiceAsString;

Scanner input = new Scanner(System.in);

System.out.println("\t\t\t\t\t1.Calculate the area of a circle" +
                    "\n\t\t\t\t\t2.Calculate the volume of a sphere" +
                    "\n\t\t\t\t\t3.Quit");

System.out.print("\n\nPlease enter your choice (1-3): ");
choiceAsString = input.nextLine();

choice = choiceAsString.charAt(0);

switch (choice)
   {
  case'1':System.out.print("\n\nPlease enter the radius of the circle: ");
  radiusCircle = input.nextFloat();
  System.out.println("\nThe area of the circle is " + String.format("%.3f",PI *radiusCircle*radiusCircle) + " metres squared");
  break;
 case'2': System.out.print("\n\nPlease enter the radius of the sphere: ");
 radiusSphere = input.nextFloat();
 System.out.println("\nThe volume of the sphere is " + String.format("%.3f",4f/3 * PI * (radiusSphere*radiusSphere*radiusSphere)) + " metres cubed");
 break;
 case'3': System.out.println("\n\nThanks for using the system. Goodbye!");
 break;
 default:
 	System.out.println("\n\nSorry - you must have entered an invalid choice - must be between 1 and 3");
         }
      }
}