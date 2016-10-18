//ProblemSolving5Sandals.java
/*This program will determine if a person wears shoes or sandals depending on whether it is
 *raining*/

import java.util.Scanner;

public class ProblemSolving5Sandals {
   public static void main(String args[])
      {
  String raining;
  
  Scanner input = new Scanner(System.in); 	
   	
  System.out.print("Is it currently raining (yes/no)? "); 	
  raining = input.nextLine(); 	
   	
  if(raining == ("yes")) 	
   System.out.println("\nStick the shoes on!!");	
  else 	
  System.out.println("\nYou're safe to wear shoes (but this is Ireland so maybe keep the shoes handy!!");
  
      }  	
}  	