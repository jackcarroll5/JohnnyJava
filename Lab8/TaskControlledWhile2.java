//TaskControlledWhile2.java
/*This program uses a task-controlled while loop which takes an initial investment
 *amount of 1000 euro and a user-supplied interest rate and displays the compounded
 *balance at the end of each year until the balance exceeds 2000 euro*/
 
 import java.util.Scanner;
 
 public class TaskControlledWhile2 {
   public static void main(String args[])
      {
   
        float rate,balance = 1000;
        int year = 1;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter the interest rate: ");
        rate = input.nextFloat();
        
        System.out.println("\n\n");
        
        while(balance <= 2000)
        {
          balance += (balance*rate)/100;
          System.out.println("Balance at the end of year " + year + " is EUR" +
           String.format("%.2f",balance));
           year++;  
        }
        
        }
      }