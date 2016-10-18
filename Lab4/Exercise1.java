//Exercise1.java
/*This program allows the user to enter their age to determine if the user is 20 years
 *old.*/
 
import java.util.Scanner;
 
public class Exercise1 {
public static void main(String args[])  
   {
       int age;
 
       Scanner input = new Scanner(System.in);
       
       System.out.print("Pleaee enter your age: ");
       age = input.nextInt();
       
       if (age < 20)
          System.out.println("\nYou are under 20 years old ");
          
       else
       	  System.out.println("\nYou are at least 20 years old "); 
       
   } 
}       