//ProblemSolving3.java
/*This program will ask the user for a whole number quantity in inches and
 *its equivalent will be shown in feet and inches*/
 
import java.util.Scanner; 
 
public class ProblemSolving3 {
   public static void main(String args[]) 
      {
      
          int inches,feet,remainingInches;
   
          Scanner input = new Scanner(System.in);
      
          System.out.print("Please enter an amount in inches: ");
          inches = input.nextInt();
      
          feet = inches/12;
          remainingInches = inches%12;
      
      
      
          System.out.println("\n" + inches + "/" is equivalent to " + feet + "/'" + remainingInches + "/""\n\n\n");
      }
}      	 