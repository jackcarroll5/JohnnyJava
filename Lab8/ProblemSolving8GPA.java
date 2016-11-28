//ProblemSolving8GPA.java
/*This program will read in a name,course and GPA of students which shows the highest GPA for students and for the course
 *by using a do-while loop*/

import java.util.Scanner;

public class ProblemSolving8GPA{
  public static void main(String args[])
  {

    int count = 1;
    String name,course,highestName = "",highestCourse = "";
    float gpa,highestGpa = 0;
    char choice;
    
    Scanner input = new Scanner(System.in);
   
   
    do{
    System.out.print("Please enter name of student " + count +" : ");
    name = input.nextLine();
    System.out.print("Please enter course of student " + count + " : ");
    course = input.nextLine();
    System.out.print("Please enter GPA of student " + count + " : ");
    gpa = input.nextFloat();
            
            if(count == 1)
            	{
             highestName += name; 
             highestCourse += course;
             highestGpa += gpa;
            }
             else if(gpa > highestGpa)
             	{
              highestName += name; 
             highestCourse += course;
             highestGpa += gpa;
             	} 
             
    	   System.out.print("\n\nDo you wish to enter more details (y/n)? ");
    	   input.nextLine(); 
           choice = input.nextLine().charAt(0);
           
           System.out.println("\n\n");    
    	   count++;      
           
    }while(choice != 'n');
   
    System.out.println("\n\n\n\nThe name of the student with the highest GPA: " +highestName+
    	                "\nThe course of the student with the highest GPA: " +highestCourse+
    	                "\nThe highest GPA: " +highestGpa);	 	
   }
}