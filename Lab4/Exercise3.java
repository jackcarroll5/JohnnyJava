//Exercise3.java
/*This program calculates the average cost per call depending on the provider used*/

import java.util.Scanner;

public class Exercise3 {
   public static void main(String args[])
      {
       
      
          final float USA1 = 0.06f,
                      USA2 = 0.19f,
                      AUS1 = 0.08f,
                      AUS2 = 0.85f,
                      RUS1 = 0.24f,
                      RUS2 = 0.92f;
                      
         float totalCost;  
     
         char provider;
         	
         int totalNumberOfMinutesUSA,totalNumberOfMinutesAUS,totalNumberOfMinutesRUS,totalNumberOfCalls;
         
         Scanner input = new Scanner(System.in);
         
         System.out.print("Which service did you use for the calls? (V- Vartec,E - Eircom): "); 
                 
         provider = input.nextLine().charAt(0);
      
                if(provider == 'v') 
                {                  
	         System.out.print("Please enter the total number of calls made in the month: "); 
	         totalNumberOfCalls = input.nextInt();
	         if(totalNumberOfCalls==0)
	            {
	               System.out.println("Thank you for your time ..... goodbye");
	            }          
	            else
	            {	             	
	         System.out.print("Please enter the number of minutes spent calling the USA: "); 
	         totalNumberOfMinutesUSA = input.nextInt();
	         
	         System.out.print("Please enter the number of minutes spent calling Australia: "); 
	         totalNumberOfMinutesAUS = input.nextInt();
	         
	         System.out.print("Please enter the number of minutes spent calling Russia: ");
	         totalNumberOfMinutesRUS = input.nextInt();	
	         	
	         totalCost=totalNumberOfMinutesUSA*USA1 +totalNumberOfMinutesAUS*AUS1  + totalNumberOfMinutesRUS*RUS1;
	         		                           
	         System.out.println("\nThe total cost of using the Vartec service for the month is EUR " + String.format("%.2f",totalCost));
	         System.out.println("\n\nThe average cost per call made is EUR " + String.format("%.2f",(totalCost/totalNumberOfCalls)));
               }
                } 
         
        else if(provider == 'e')
         {
          System.out.print("Please enter the total number of calls made in the month: "); 
	         totalNumberOfCalls = input.nextInt();	
         	
         	if (totalNumberOfCalls == 0)
                 {
         	    System.out.println("Thank you for your time ..... goodbye");
	            }
	        else    
	            {
	          System.out.print("Please enter the number of minutes spent calling the USA: "); 
	         totalNumberOfMinutesUSA = input.nextInt();
	         
	         System.out.print("Please enter the number of minutes spent calling Australia: "); 
	         totalNumberOfMinutesAUS = input.nextInt();
	         
	         System.out.print("Please enter the number of minutes spent calling Russia: ");
	         totalNumberOfMinutesRUS = input.nextInt();
	         	
	         totalCost=totalNumberOfMinutesUSA*USA1 +totalNumberOfMinutesAUS*AUS1  + totalNumberOfMinutesRUS*RUS1; 
	         	             
	         System.out.println("The total cost of using the Eircom service for the month is EUR " + String.format("%.2f",totalCost));
	         System.out.println("\n\nThe average cost per call made is EUR " + String.format("%.2f",(totalCost/totalNumberOfCalls)));	     
         } 
       } 
       	else 	
            System.out.println("Sorry - incorrect choice, it must be (V)artec or (E)ircom....Goodbye");  	       
	}
}
                              
         
         
         	