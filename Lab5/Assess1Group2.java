//Assess1Group2.java
/*This program will read the coordinates of 2 points of a rectangle to ensure that they are valid
 *and, if so, determines whether or not they describe a square*/
 
 import java.util.Scanner;
 	
public class Assess1Group2 {
   public static void main(String args[])
      { 
   int xUpperLeft,xBottomRight,yUpperLeft,yBottomRight;
 
 Scanner input = new Scanner(System.in);
 
 System.out.println("\t\t\t\t------------Square Determinator------------\n\n");
 
 System.out.print("Please enter the x-coordinate of the upper-left point: ");
 xUpperLeft = input.nextInt();
 
 System.out.print("Please enter the y-coordinate of the upper-left point: "); 
 yUpperLeft = input.nextInt();
 
 System.out.print("Please enter the x-coordinate of the bottom-right point: "); 
 xBottomRight = input.nextInt();
 
  System.out.print("Please enter the y-coordinate of the bottom-right point: ");
  yBottomRight = input.nextInt();
 
 if(xBottomRight > xUpperLeft)
  if(yBottomRight < yUpperLeft)
   if(xBottomRight - xUpperLeft == yUpperLeft - yBottomRight)
      System.out.println("\n\nThe rectangle described by these points is a square");
        else
      System.out.println("\n\nThe rectangle described by these points is not a square");
     else 
     System.out.println("\n\nError! The bottom-right x-coordinate is invalid ..... quitting program"); 
     else 
      System.out.println("\n\nError! The bottom-right y-coordinate is invalid ..... quitting program");
      
      }   
}            