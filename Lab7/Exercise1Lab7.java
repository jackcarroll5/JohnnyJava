//Exercise1Lab7.java
/*This program will use a counter-controlled while loop to read in the weights of 5
 *people which will determine the average weight with the percentage of people whose
 *weight is at least 80kg*/
 
import java.util.Scanner;

public class Exercise1Lab7 {
  public static void main(String args[])
      {

   float weight,totalWeight = 0,percentAtLeast80 = 0;
    int count = 0;

 Scanner input = new Scanner(System.in);
 
  while(count < 5)
     {
     	System.out.print("Please enter the weight of person " + (count+1) + ": ");
        weight = input.nextFloat();
  
  
         if(weight >= 80)   
  	     percentAtLeast80++; 
         
         totalWeight += weight;
        
         count++;
     }
  
    System.out.println("\n\n===========================" + "\n\t\tProgram Results " +
    	               "\n===========================" + "\n\nAverage weight: " + String.format("%.2f",totalWeight/5f) + "kg " +
    	               	"\n\nPercentage >= 80kg: " + String.format("%.2f",percentAtLeast80/5f*100) + "% ");
    	               	 
      }
}	