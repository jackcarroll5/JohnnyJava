//ReadingIntegerInput.java
/*This program declares integer variables and then reads in user-supplied values for these*/
import java.util.Scanner;
public class ReadingIntegerInput {
     public static void main (String args[])
        {
            int numberOfCPU, RAM;
            	
            Scanner input = new Scanner(System.in);
            
            System.out.print("Please enter the number of CPUs in your computer: ");
            numberOfCPU = input.nextInt();
            
            System.out.print("Please enter the amount of RAM in your computer in MB: ");
            RAM = input.nextInt();
            
            System.out.println("\n\n\nThe details you entered were as follows:\n\nNumber of " +
            "CPUs: " + numberOfCPU + "\nAmount of RAM: " + RAM+"MB\n\n\n");
        }     
}            	          