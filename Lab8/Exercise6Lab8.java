//Exercise6Lab8.java
/*This program will ask the user to choose between 1 and 4. There will be conversions from Fahrenheit
 *to Celsius.*/


 import java.util.Scanner;
 
 public class Exercise6Lab8 {
   public static void main(String args[])
   {
    
  String textMenu = "\n\t\t1. Convert Fahrenheit to Celsius\n\t\t2. Convert Celsius to Fahrenheit " +
  "\n\t\t3. Convert Kelvin to Celsius\n\t\t4. Quit\n\nPlease enter your choice: ";
 
  int choice;
  float fahrenheit,celsius,kelvin;
 
  Scanner input = new Scanner(System.in);
 
 do{ 
 	System.out.print(textMenu); 
    choice = input.nextInt();	
 
 	while(choice < 1 || choice > 4 ) 
      	{      
       System.out.print("Invalid choice - must be 1,2,3 or 4. Please re-enter: ");    
  	   choice = input.nextInt();
      	}
  	  
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
           
                  while(celsius < -273)
                  {
  	            System.out.print("Invalid temperature - must be >= -273. Please re-enter: ");	
  	            celsius = input.nextFloat();
                  }
                 
                 fahrenheit = (9/5f)*celsius+32;
           
                  System.out.println(celsius + "C is equivalent to " + String.format("%.2f",fahrenheit) + "F");
                  
                  break;
                  
          case 3:
          	      System.out.print("\nPlease enter a temperature in Kelvin: ");
                   kelvin = input.nextFloat();
           
                  celsius = kelvin-273;
           
                  System.out.println(kelvin + "K is equivalent to " + String.format("%.2f",celsius) + "C");
                  
                  break;        
                  
          case 4:        
                  System.out.println("Thanks for using the system .... goodbye");   
          }
      
      }	while(choice!=4); 
   }
 } 		