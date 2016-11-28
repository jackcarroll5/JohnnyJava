//ProblemSolving8Calculation.java
/*This program will determine the natural log and the square root of a number. 3 choices are given which is
 *carried out by the do-while loop which enables users to choose from the 3 outcomes*/

import java.util.Scanner;

public class ProblemSolving8Calculation{
  public static void main(String args[])
     {
  
 String textMenu = "\n\t\t\t\tA. Calculate the natural log of a number\n\t\t\t\tB. Calculate the square root of a number " +
 	                "\n\t\t\t\tC. Exit\n\nPlease enter your choice: ",choice;   
 float num;
  
  
  Scanner input = new Scanner(System.in); 
  
  do{
  System.out.print(textMenu);
  choice = input.nextLine();
  
  
  switch(choice){
  case "A":
  	       System.out.print("\nPlease enter a number: ");
  	       	num = input.nextFloat();
  	       	System.out.println("\nThe natural log of this number is: " +
  	       		                 Math.log(num));
  	       	 break;	                 
  	       		                 
   case "B": 	       		                 
  	        System.out.print("\nPlease enter a number: ");
  	       	num = input.nextFloat();
  	       	System.out.println("\nThe square root of this number is: " +
  	       		                Math.sqrt(num));
  	       	 break;	                          		                 
   case "C":	       		                 
  	         System.out.println("\nThanks for using the system");
              }	
          
          if(!choice.equals("C"))
          {
           	
          System.out.print("\nPlease hit return to continue: ");
          input.nextLine();
          input.nextLine();  
          }        	    	
                    	                
  }while(!choice.equals("C"));   		                 	                 
  	       		                 
  	       		                 
     }
} 	       		                 