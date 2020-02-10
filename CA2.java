//CA2.java
/*This program will give the user three choices for using a length converter where the person can
 *choose to convert inches to feet and inches, convert metres to feet or to quit the menu*/
//JackCarroll

import java.util.Scanner;

public class CA2 {
 public static void main(String args[])
 {
 
 String menuText = "\t\t\t\t============Length Converter============" + 
 	                "\n\n\t\t\t\t1. Convert Inches to Feet and Inches\n\t\t\t\t2. Convert Metres to Feet" +
 	                "\n\t\t\t\t3. Quit\n\n\t\t\t\tPlease enter your choice: ",choice;
 int inches;
 float feet,metres;
 
 Scanner input = new Scanner(System.in);
 
 System.out.print(menuText);	
 choice = input.nextLine();
 
 if(!choice.equals("1") && !choice.equals("2") && !choice.equals("3")){
 
 	System.out.print("\nInvalid choice! Must be 1, 2 or 3. Please re-enter: ");
    choice = input.nextLine();
    
    System.out.print("\nInvalid choice! Must be 1, 2 or 3. Please re-enter: ");
    choice = input.nextLine();
    
    System.out.print("\nInvalid choice! Must be 1, 2 or 3. Please re-enter: ");
    choice = input.nextLine();
    
    System.out.print("\nInvalid choice! Must be 1, 2 or 3. Please re-enter: ");
    choice = input.nextLine();
    
    
  
    }
    
 do{
    		
 switch(choice)	
 {	
 case "1":	
           System.out.print("\n\nPlease enter a quantity in inches: ");	        
 	        inches = input.nextInt();
 
 if(inches < 0) {
 
 System.out.print("\nInvalid quantity! Must be at least zero. Please re-enter: ");
 inches = input.nextInt();
 
  System.out.print("\nInvalid quantity! Must be at least zero. Please re-enter: ");
 inches = input.nextInt();
 
  System.out.print("\nInvalid quantity! Must be at least zero. Please re-enter: ");
 inches = input.nextInt();
 
 }
 
 System.out.println("\n\n" + inches + " inches is equivalent to " + inches/12 + " feet " + inches%12 + " inches ");
 
 input.nextLine();
 
 System.out.print("\n\n\n\n\n" + menuText);	
 choice = input.nextLine();
 
 case "2":
 	      System.out.print("\n\n\nPlease enter a quantity in metres: ");
 	      metres = input.nextFloat();
 	      
 	System.out.println("\n\n" +metres + " metres is equivalent to " + String.format("%.2f",metres*3_281) + " feet ");      
 	      
 	input.nextLine();
 	
 	System.out.print("\n\n\n\n\n" + menuText);	
    choice = input.nextLine();      
 	      
 case "3":	      
 	      System.out.println("\n\n\n\nThanks for using the length converter .... goodbye");	     	     
 }
 
 }while(choice.equals(3));
 		
 }	
}	