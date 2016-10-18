//Assess1Group4.java
/*This program will determine the moment of inertia of a thin rectangular plate about
 *an axis perpendicular to the plate and going through its centre. It's based on user-supplied
 *values for the mass,length and width of the plate.*/

import java.util.Scanner;

public class Assess1Group4 {
   public static void main(String args[])
      {
   
float mass,length,width,inertia;

  Scanner input = new Scanner(System.in);

 System.out.println("========================================================\n" +
 	               "\t\t\t\tMoment of Inertia Calculator" +
 	               "\n========================================================");

 System.out.print("\n\nPlease enter the mass of the rectangular plate: ");
 mass = input.nextFloat();

if(mass<0)
System.out.println("\n\nMass of object cannot be negative ..... exiting program now!");
else
    {
 System.out.print("Please enter the length of the rectangular plate: ");
 length = input.nextFloat();

 if(length<0)
 System.out.println("\n\nLength of object cannot be negative ..... exiting program now!");

else
      {

System.out.print("Please enter the width of the rectangular plate: ");
width = input.nextFloat();

inertia = 1/12f*mass*(length*length + width*width);

System.out.println("\n\nThe moment of inertia of the rectangular plate is " + String.format("%.3f",inertia) +
                    "kg m" +(char)178);

        }
    }
  }
}