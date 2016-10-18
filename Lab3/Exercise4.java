//Exercise4.java
/*This program will display variables for speed, time and acceleration
 *The distance travelled by the object can be shown here as well*/
 
 import java.util.Scanner;
 
 public class Exercise4 {
    public static void main(String args[])
       {
           float speed,time,acceleration;
           
    
           Scanner input = new Scanner(System.in);
          
          System.out.println("***********Distance Calculator*********** \n\n"); 
          	
          System.out.print("Please enter the initial speed: ");
           speed = input.nextFloat();
           
          System.out.print("Please enter the acceleration: ");
           acceleration = input.nextFloat();
           
         System.out.print("Please enter the time spent travelling: "); 
          time = input.nextFloat(); 	
          	
         System.out.println("The object travelled a distance of " + String.format("%.2f",speed*time + (0.5*(acceleration*(time*time))))+ "metres"); 		   	                
          	                
       }       	                
 } 