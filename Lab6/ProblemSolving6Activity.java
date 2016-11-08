//ProblemSolving6Activity.java
/*This program will determine the average age of a group of children of unknown size by
 *using a data-sentinel loop*/
 
import java.util.Scanner; 
 
public class ProblemSolving6Activity {
   public static void main(String args[])
      {
 
 int totalAge = 0, numOfChildren = 0, age;
 float averageAge;
 
 Scanner input = new Scanner(System.in);
 
 System.out.print("Please enter the age of the first child " +
 	  "(zero to exit): ");
 age = input.nextInt();
 
 while(age != 0)
    {
    totalAge += age;
    numOfChildren ++;
 
   System.out.print("Please enter the age of the next child " +
 	  "(zero to exit): ");
   age = input.nextInt();
 
    }
 
 if(numOfChildren > 0)
     {
     	averageAge = (float)totalAge/numOfChildren; 
      System.out.println("\nThe average age of the children in the group is " + 
      	String.format("%.1f",averageAge) + " years old"); 
      	                 
     } 
      }
} 