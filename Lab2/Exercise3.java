//Exercise3.java
/*This program will display the name, height and address of the person when integer
 *variables are declared and reads in user-supplied values for these*/
 import java.util.Scanner;
 
 public class Exercise3 {
      public static void main (String args[])
         {
             String Name, Address;
             float Weight, Height;
             
             Scanner input = new Scanner(System.in);
             
             System.out.print("Please enter your name: ");        	
             Name = input.nextLine();
             
             System.out.print("Please enter your weight: ");
             Weight = input.nextFloat();
             
             System.out.print("Please enter your height: ");
             Height = input.nextFloat();
             
             System.out.print("Please enter your address: ");
             input.nextLine();
             Address = input.nextLine();
             
             System.out.println("\n\n\n\n\t\t\t\tDetails" + "\n\n\nName :" + Name + "\nWeight : " + Weight + 
                               "\nHeight :" + Height + "\nAddress :" + Address);
         }
 }
             