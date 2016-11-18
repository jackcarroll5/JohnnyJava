//ProblemSolving7Activity1.java
/*This program validates a person's age by using a counter-controlled data loop to read in
 *the age from the user*/

import java.util.Scanner;

public class ProblemSolving7Activity1 {
  public static void main(String args[])
  {
  
String ageAsString;
char character;
     int index = 0, count = 0,age;
     boolean valid = false;

      Scanner input = new Scanner(System.in);

      System.out.print("Please enter the age of the person: ");
       ageAsString = input.nextLine();
   
      while(valid == false)
      {
      	count = ageAsString.length();//Determines number of characters in age value entered
        character = ageAsString.charAt(0);//Extract first character

    while(index < count  &&  character >= '0' && character <= '9' ) 
    {
    index++;
    if(index < count)
    character = ageAsString.charAt(index); 
    }
    
    if(index == count)
    {
     age = Integer.parseInt(ageAsString);
      	
    if(age >= 0 && age <= 140)	
    {
      System.out.println("\nYou have entered a valid age value. The value entered is " + age);
      valid = true;
    }  
    else 
    {
     System.out.println("Invalid age entered - please enter a valid age: ");
     ageAsString = input.nextLine();
     index = 0;
    }
    }
    
    else 
    {
     System.out.println("Invalid age entered - please enter a valid age: ");
     ageAsString = input.nextLine();
     index = 0;
    } 
    
   
    }
    }
  }
