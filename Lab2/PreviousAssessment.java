//PreviousAssessment.java
/*This program will initialise a String variable, a float variable and an integer variable.
 *It then asks the user to input float and integer values to display the info.*/
import java.util.Scanner; 
public class PreviousAssessment {
     public static void main(String args[])
        {
            String metalName = "Gold";
            float weight;
            int purity;
                                    
            Scanner input = new Scanner(System.in);
 
            System.out.print("Please enter the weight of the gold:");
            weight = input.nextFloat();
 
            System.out.print("Please enter the purity of the gold:");
            purity = input.nextInt();
 
            
            String formatString = String.format("%-10s%s" +
            	                                "%-10s%.3f" +
            	                                "%-10s%d",  
            	                                "\nName: ", metalName,
            	                                "\nWeight: ", weight,
            	                                "\nPurity: ", purity);
           System.out.println("\n\n\n\t\t============================================"+"\n\t\t\t\t\t\tMetal Details\n" +
            	              "\t\t============================================" + formatString); 	                                
        }
} 