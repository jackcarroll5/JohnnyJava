//SimpleIf.java
/*This program uses simple if statements to determine whether or not the user likes Java*/

import java.util.Scanner;

public class SimpleIf {
   public static void main(String args[])
      {
   	      String answerAsString;
   	      char answer;
   	
   	      Scanner input = new Scanner(System.in);
   	      
   	      System.out.print("Do you like java (y/n)? ");
   	      answerAsString = input.nextLine();
   	      
   	     answer = answerAsString.charAt(0);
   	     
   	     if(answer == 'y')
   	         System.out.println("\nYou said you like Java");
   	         
   	     if(answer == 'n')    
   	         System.out.println("\nYou said you dislike Java");
   	         
      }        
}   	         