//Exercise4Lab7.java



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
   
    if(character >= '0' && character <= '9') {
      
       count++;
       index++;
                        }
     else 
   	  index = text.length();      
     }
   
   if(count == text.length())
   System.out.println("\nYou entered a positive whole number");
  else    
 System.out.println("\nYou did not enter a positive whole number");
    
   
           	  
  }
}   