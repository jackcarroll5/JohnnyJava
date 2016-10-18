//ProblemSolving5Marks.java
/*This program will determine the appropriate grade based on the user-supplied GPA.*/

import java.util.Scanner;

public class ProblemSolving5Marks {
   public static void main(String args[])
      {
   float gpa;
   String grade;	
 
 Scanner input = new Scanner(System.in);
 
 System.out.print("Please enter your grade point average between 0 and 5: ");
 gpa = input.nextFloat();
 
 if(gpa >= 4)
 grade = "A";
 else if(gpa >= 3.5)
 grade = "B";
  else if(gpa >= 3.0)
 grade = "C";
  else if(gpa >= 2.0) 
 grade = "D";
 else 
  grade = "F";
 
       System.out.print("\nYou got a(n) " + grade + " grade ");
 
      }
}  	