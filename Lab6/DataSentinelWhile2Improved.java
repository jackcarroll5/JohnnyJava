//DataSentinelWhile2Improved.java
/*Thisprogram uses a data-sentinel controlled while loop to mimic the action of a simple 
 *cash register machine*/

import java.util.Scanner;

public class DataSentinelWhile2Improved {
 public static void main(String args[])
    {
 
      float price,totalPrice = 0;
      int numProducts = 0;

     Scanner input = new Scanner(System.in);

     System.out.print("Please enter the price of product "
     + (numProducts ++) + " (-1 to exit): ");
     price = input.nextFloat();
     
    while(price!=-1) 
       {
         totalPrice += price;
         numProducts ++;
     
     System.out.print("Please enter the price of product "
     + (numProducts ++) + " (-1 to exit): ");
     price = input.nextFloat();
       }
     
  System.out.println("\nTotal products entered: " + numProducts +
   "\nTotal Price: EUR" + String.format("%.2f",totalPrice));       
    }
}