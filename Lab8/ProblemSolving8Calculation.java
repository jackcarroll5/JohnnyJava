//ProblemSolving8Calculation.java


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
  	       		                 String.format("%.1f",(Math.log(num))));
  	       	 break;	                 
  	       		                 
   case "B": 	       		                 
  	        System.out.print("\nPlease enter a number: ");
  	       	num = input.nextFloat();
  	       	System.out.println("\nThe square root of this number is: " +
  	       		                 String.format("%.1f",(Math.sqrt(num))));
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