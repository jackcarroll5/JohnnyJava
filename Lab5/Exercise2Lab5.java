//Exercise2Lab5.java
/*This program will take a user-supplied character and determine whether the value
 *is an uppercase letter, a lowercase letter, a digit or neither a digit or a letter*/

import java.util.Scanner;

public class Exercise2Lab5 {
   public static void main(String args[])
      {
   
         char character;
         String characterAsString;

         Scanner input = new Scanner(System.in);

         System.out.print("Please enter a keyboard character: ");
         characterAsString = input.nextLine();

         character = characterAsString.charAt(0);

         if(character >= '0' && character <= '9')
           System.out.println("\nYou entered a digit ");
           
           else if(character >= 'a' && character <= 'z')
           System.out.println("\nYou entered a lowercase letter "); 
           
           else if(character >= 'A' && character <= 'Z')
           System.out.println("\nYou entered an uppercase number "); 
           
           else
             System.out.println("You entered neither a letter nor a digit ");
 
      }
} 















