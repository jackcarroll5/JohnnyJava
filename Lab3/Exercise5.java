
//Exercise5.java
/*This program will attempt to display the gravitational force through calculating the masses of
 *two objects and the distance of the two objects*/

import java.util.Scanner;

public class Exercise5 {
   public static void main(String args[])
      {
   
          final float G = 6.67300E-11f;
          float massOfFirstObject, massOfSecondObject;
          int distance;
          
          Scanner input = new Scanner(System.in);

          System.out.print("Please enter the mass in kg of the first object: ");
          massOfFirstObject = input.nextFloat();

          System.out.print("Please enter the mass in kg of the second object: ");
          massOfSecondObject = input.nextFloat();

          System.out.print("Please enter the distance in metres between the objects: ");
          distance = input.nextInt();
          
          System.out.println("\n\n\n******Results of Program******" + "\n\nThe mass of the first object is "+massOfFirstObject+"kg"+"\nThe mass of the second object is "
          	                 +massOfSecondObject+"kg" + "\nThe distance between the two objects is "+(massOfFirstObject-massOfSecondObject)+ "m" + "\nThe force " +
          	                 "exerted on the objects is " + String.format("%.2f",G*(massOfFirstObject*massOfSecondObject)/(distance*distance)) + "N"); 
      }        	
}          	         