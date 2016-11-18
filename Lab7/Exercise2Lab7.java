//Exercise2Lab7.java
/*This program will ask the user for their username and password where there will be
 *3 attempts to enter the correct details. If the inputs are wrong within 3 attempts, the
 *the system will terminate*/
 
import java.util.Scanner;

public class Exercise2Lab7 {
  public static void main(String args[])
  {
 
 String password,username;
 int attempts = 3;
 
 Scanner input = new Scanner(System.in);
 
 while(attempts >= 1)
 {
 System.out.print("Please enter your username: ");
 username = input.nextLine();
 System.out.print("Please enter your password: ");
 password = input.nextLine();
 
attempts--;

 if(username.equals("t00012345") && password.equals("java"))
 {
  System.out.println("\nWelcome to the system!");
  break;
 }
 else 
 	{
 if(attempts >= 1)
  System.out.println("\nInvalid username/password combination. "+attempts+ " attempts remainingan");
  else
  System.out.println("\nInvalid username/password combination. IP address noted. Banned for 24 hours");
     }
   } 
     
  }                                              
} 
 
