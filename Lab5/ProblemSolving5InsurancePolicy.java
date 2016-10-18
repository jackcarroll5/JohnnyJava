//ProblemSolving5InsurancePolicy.java
/*This program will read in the gender and age of a driver as well as the vslue of a car and whether
 *or not they have incurred a speeding ticket. It uses this information to determine the total cost 
 	of their prenium*/

import java.util.Scanner;

public class ProblemSolving5InsurancePolicy {
   public static void main(String args[])
          {

   int age;
  String gender,ticket;
  float value,premium;

Scanner input = new Scanner(System.in);

System.out.print("Please enter the gender of the driver ( 'm' or 'f'): ");
  gender = input.nextLine();

System.out.print("Please enter the age of the driver: ");
  age  =  input.nextInt();

System.out.print("Please enter the value of the car: ");
   value = input.nextFloat();

System.out.print("Please enter whether the driver has ever received a speeding\n" +
                  "ticket ( 'y' or 'n'): ");
    input.nextLine();
    ticket = input.nextLine();
       
    premium =  value * 0.03f;

if(gender.equals("m") && age < 25)
  premium = premium * 1.11f;

else if(gender.equals("f") && age < 21)
  premium = premium * 1.06f;
  
  if(ticket.equals("y"))
  premium = premium + 250;
  
    System.out.println("\n\nCost of premium is EUR" + String.format("%.2f",premium));    

       }
}