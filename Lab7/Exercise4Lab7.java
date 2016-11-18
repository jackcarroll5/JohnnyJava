//Exercise4Lab7.java
/*This program will use a counter-controlled while loop to observe a piece of text, character by 
character to determine if the text features a positive whole number*/

import java.util.Scanner;

public class Exercise4Lab7 {
  public static void main(String args[]) 
  {
  
    char character;
    String text;
    int count = 0, index = 0;
    
    Scanner input = new Scanner(System.in);
        
    System.out.print("Please enter a piece of text: ");  
    text = input.nextLine();
    
    while(index < text.length())
    {
    character = text.charAt(index);
   
    if(character >= '0' && character <= '9') 
       count++;
       
       index++;
              }
   
     if(count == text.length())
      System.out.println("\nYou entered a positive whole number");
  else    
    System.out.println("\nYou did not enter a positive whole number");
            	  
  }
}   