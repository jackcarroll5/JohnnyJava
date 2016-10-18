//Assess1Group1.java


import java.util.Scanner;

public class Assess1Group1 {
   public static void main(String args[])
   {

float densityBallBearing,densityFluid,radius,velocity,viscosity;
final float gravity = 9.8f;

Scanner input = new Scanner(System.in);

System.out.print("***********Viscosity Calculator***********" + 
"\n\nPlease enter the density of the ball-bearing: ");
densityBallBearing = input.nextFloat();

if(densityBallBearing<0)
  System.out.println("\nError! The density of the ball-bearing must be positive ..... now quitting program");
else
     {
     System.out.print("Please enter the density of the fluid: ");
     densityFluid = input.nextFloat();

if(densityFluid<0)
   System.out.println("\nError! The density of the fluid must be positive ..... now quitting program");
   
   else
   {
   
   System.out.print("Please enter the radius of the ball-bearing: ");
   radius = input.nextFloat();
   
   System.out.print("Please enter the velocity of the ball-bearing: ");
   velocity = input.nextFloat();
   
  viscosity = 2 * (densityBallBearing - densityFluid) * gravity * radius * radius / (9 * velocity); 
   
    System.out.println("\n\n\nThe viscosity of the fluid is " + String.format("%.2f",viscosity) + "Pa s"); 
 
               }
   
         }
     }
}


