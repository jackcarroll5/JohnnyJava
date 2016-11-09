//Exercise2Lab7.java
/*This program will ask the user for their username and password where there will be
 *3 attempts to enter the correct details. If the inputs are wrong within 3 attempts, the
 *the system will terminate*/
 
import java.util.Scanner;

public class Exercise2Lab7 {
  public static void main(String args[])
  {
 
 String password = "",username = "", rightName = "t00012345", rightPassword = "java";
 int attempts = 3;
 
 Scanner input = new Scanner(System.in);
 
 
 while(attempts > 0)
 {
 System.out.print("Please enter your username: ");
 username = input.nextLine();
 System.out.print("Please enter your password: ");
 password = input.nextLine();

 if (username.equals(rightName) && password.equals(rightPassword))
  System.out.println("\nWelcome to the system!");
 else 
  System.out.println("\nInvalid username/password combination.2 attempts remaining");	
 	attempts--;	
    
  System.out.print("\nPlease enter your username: ");
 username = input.nextLine();
 System.out.print("Please enter your password: ");
 password = input.nextLine();
	
if (username.equals(rightName) && password.equals(rightPassword))
  System.out.println("\nWelcome to the system!");
 else 
  System.out.println("\nInvalid username/password combination.1 attempt remaining");		
 attempts--;
 	 		
  System.out.print("\nPlease enter your username: ");
 username = input.nextLine();
 System.out.print("Please enter your password: ");
 password = input.nextLine();
	
 if (username.equals(rightName) && password.equals(rightPassword))
  System.out.println("\nWelcome to the system!");
 else 
   System.out.println("\nInvalid username/password combination.IP address noted. Banned " +
 	                 "\nfor 24 hours");	
 attempts--;	
 
   } 
     
  }
                                               
} 
 
