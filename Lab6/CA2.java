//CA2.java
/*This program will ask users to choose from 3 options when the PIN is entered
 *which will depend on the user's choice to withdraw, to display the balanxe on screen or
 *exit the system  Jack Carroll*/

import java.util.Scanner;

  public class CA2{
    public static void main(String args[])
       {
    
   String password123,choiceAsString;
   char choice;
   float amount,
   balance = 1000,
   newBalance;
   final String PIN = "password123";
 Scanner input = new Scanner(System.in);

System.out.print("Please enter your PIN: ");
password123 = input.nextLine();

if(password123="PIN")
System.out.println("You have entered an invalid PIN, exiting system now ...... ");
else
System.out.println("\n\n\t\t****************Welcome to the ATM System****************" +
                   "\n\n\t\tA. Make a withdrawal\n\t\tB. Display balance on screen" +
                   	"\n\t\tC. Exit the system\n\n");

System.out.print("Please enter your choice: ");/*This input is used to choose between A, B and C*/
choiceAsString = input.nextLine();
choice = choiceAsString.charAt(0);
switch(choice) 
           {              
case 'A':  
System.out.print("\n\nPlease enter the amount you wish to withdraw: ");
amount = input.nextFloat();

balance = 1000;
newBalance = 1000-amount;

if(amount>balance)
System.out.println("\nYou are attempting to withdraw more than your current balance! Exiting system now .....");
else
System.out.println("You have made a successful withdrawal. Your new balance is EUR" + String.format("%.2f",newBalance));
break;
               
case 'B': 
System.out.println("\n\nYour current balance is EUR" + String.format("%.2f",balance));
break;
           
case 'C':              
System.out.println("\n\nThank you for using the ATM ..... goodbye");
                       
           }    
     }
  }