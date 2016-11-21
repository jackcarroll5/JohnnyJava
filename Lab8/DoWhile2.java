//DoWhile2.java
/*This program presents the user with a menu containing 3 options. The user can select any of
 *the 3 options and a different course of action takes place with each choice. A do-while loop
 *is used for the iteration process and a switch for the menu selection process*/
 
 import java.util.Scanner;
 
  public class DoWhile2{
   public static void main(String args[])
      {
  
        String menuText = "\n\n\n\t\t1. Convert Fahrenheit to Celsius\n\t\t2. Convert Celsius " +
        "to Fahrenheit\n\t\t3. Quit\n\nPlease enter your choice: ";
        
        int choice;
        float celsius,fahrenheit;
        
        Scanner input = new Scanner(System.in);
        
        do{
           System.out.print(menuText);
           choice = input.nextInt();
           
        switch(choice)   
          {
           case 1:
                  System.out.print("\nPlease enter a temperature in Fahrenheit: ");
                  fahrenheit = input.nextFloat();
           
                  celsius = (fahrenheit-32)*(5f/9);
           
                  System.out.println(fahrenheit + "F is equivalent to " + String.format("%.2f",celsius) + "C");
                  
                  break;
                  
           case 2 :       
                   System.out.print("\nPlease enter a temperature in Celsius: ");
                   celsius = input.nextFloat();
           
                 fahrenheit = (9/5f)*celsius+32;
           
                  System.out.println(celsius + "C is equivalent to " + String.format("%.2f",fahrenheit) + "F");
                  
                  break;
                  
          case 3:        
                  System.out.println("Thanks for using the system .... goodbye");
         } 
      
        }while(choice!=3);    	
                  
        }             
      }        