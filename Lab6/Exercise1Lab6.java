//Exercise1Lab6.java
/*This program will use a data-sentinel-controlled while loop to repeat for a
 *arbitrary number of conversios from degrees Fahrenheit to degrees Celsius*/
 
 import java.util.Scanner;
 
 public class Exercise1Lab6 {
    public static void main(String args[])
       {
    	
  float fahrenheitTemp,totalTemp = 0; 	
  int numPerformed = 0, greaterThanThirty = 0,lessThanTen = 0,greaterEqualThan20 = 0;
  	
  Scanner input = new Scanner(System.in);	
  	
 System.out.print("Please enter the first Fahrenheit temperature " +
 "(below -459.67 to exit): "); 	
 fahrenheitTemp = input.nextFloat(); 	
  	
 if(fahrenheitTemp < -459.67) {
 	
  System.out.println("\nNo conversions were performed....Goodbye ");	
                               }
 while(fahrenheitTemp >= -459.67f) 	
   {
   System.out.println("The equivalent Celsius temperature is " + String.format("%.3f",(5/9f * (fahrenheitTemp-32))));
  	
   totalTemp += fahrenheitTemp;	
   numPerformed ++;
   
   if(fahrenheitTemp > 30) 
    greaterThanThirty ++;
 else if(fahrenheitTemp < 10)
   lessThanTen ++;
     	 	
  if(fahrenheitTemp >= 20)
     {
   greaterEqualThan20 ++;
     }
  		
  System.out.print("\nPlease enter another Fahrenheit temperature " +
  "(below -459.67 to exit): "); 	
 fahrenheitTemp = input.nextFloat(); 		
  	
   }
  			
 System.out.println("\n============================" + "\n\t\tProgram Results" +
 "\n============================" +"\nTotal conversions performed: " + numPerformed + "\nAverage Celsius temperature: "
 + String.format("%.3f",totalTemp/numPerformed) + " C " + "\nTotal Celsius temperatures > 30C: " + greaterThanThirty + "\nTotal Celsius temperatures < 10C: " + lessThanTen +
 "\nPercentage Celsius temperatures >= 20C: " +String.format("%.0f",(float)greaterEqualThan20/numPerformed*100)  + " %");
 	 	 	  	  	
       }	
 }      	