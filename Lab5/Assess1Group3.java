//Assess1Group1.java
/*This program will determine the ideal weight in kilos by using the Robinson
 *formula based on the person's height and age*/

import java.util.Scanner;

public class Assess1Group1 {
   public static void main(String args[])
      {
   
 float height, idealWeight;
 int age;
 String gender;
 final float ONE_INCH = 0.0254f; 

    Scanner input = new Scanner(System.in);

 System.out.print("************Ideal Weight Calculator************\n\nPlease enter your gender: ");
 gender = input.nextLine();

 System.out.print("Please enter your height: ");
 height = input.nextFloat();

 System.out.print("Please enter your age: ");
 age = input.nextInt();

if (age<18)
System.out.println("\n\n\nError: the age entered is too low for the Robinson formula to work ... exiting program now!");
else if (height<1.22)
System.out.println("\n\n\nError: the height entered is too low for the Robinson formula to work ... exiting program now!");

else
    {
  if(gender.equals("male"))
 idealWeight = 28.6f + 1.7f((height-1.22f)/ONE_INCH);
else
idealWeight = 29.2f +1.9f((height-1.22f)/ONE_INCH);

System.out.println("The ideal weight of this person is " + String.format("%.0f",idealWeight) + "kg");

    }
  }    
}