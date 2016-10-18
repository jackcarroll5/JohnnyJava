//IfElse.java
/*This program uses an if-else statement to ask the user a question and give them a message
 *based on their reply*/
 
import java.util.Scanner; 
 
public class IfElse {
   public static void main(String args[]) 
      {
          String answer;
          
          Scanner input = new Scanner(System.in); 
          
          System.out.print("What is half a byte called - (one word please)? ");
          answer = input.nextLine();
          
          if (answer.toLowerCase().equals("nibble"))
             System.out.println("\nThat's the correct answer - well done!");
             
          else   
             System.out.println("\nIncorrect - it is a \"nibble\"");
     
      }        
}            