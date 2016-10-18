//Exercise2.java
/*This program will calculate the square metres of a cylinder through using the volume of cylinder formula*/

import java.util.Scanner;

public class Exercise2 {
   public static void main (String args[])
      { 
   final float PI =3.142f;
   float radius,height;	
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Please enter the radius of the cylinder:");
   radius = input.nextFloat();
   
   System.out.print("Please enter the height of the cylinder:");
   height = input.nextFloat();
  
   System.out.println("\n\n=====Calculation Result=====" +"\n\nVolume of cylinder is " + String.format("%.2f",PI*(radius*radius)*height) + " metres squared");
   
      }
}    	