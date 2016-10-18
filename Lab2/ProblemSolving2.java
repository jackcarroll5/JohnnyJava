//ProblemSolving2.java
/*This program shows information about a car's fuel consumption*/
import java.util.Scanner;

public class ProblemSolving2 {
   public static void main (String args[])
      {
          int capacity,consumption,gallons=10,distance1=2000;
          float distance,litreGallon = 4.55f; 
          Scanner input = new Scanner(System.in);
      
          System.out.print("Please enter the capacity of the fuel-tank in litres:");
          capacity = input.nextInt();
      
          System.out.print("Please enter the fuel consumption of the car in km/l:"); 
          consumption = input.nextInt();
      
          System.out.println("\nThis car can travel "+capacity*consumption+ "km on a single tank of fuel.");
      
      
          System.out.print("\nHow many km do you need to travel? ");
          distance = input.nextFloat();
      
          System.out.println("\nIn order to travel a distance of " +distance+ "km you need " + String.format("%.2f", distance/consumption)+ " litres of fuel ");
      
          System.out.println("\nIn order to travel a distance of " +distance1+ "km it is necessary to refuel " + String.format("%.2f",(float)distance1/(capacity*consumption) )+ " times ");
          
          System.out.println("\nThe distance you can travel on "+gallons+ " gallons of fuel is " + gallons*consumption*litreGallon + "km");
        
    }   
}      