//Exercise1Lab5.java
/*This program will attempt to find out if a citizen is eligible to join the Gardai*/

import java.util.Scanner; 

public class Exercise1Lab5 {
   public static void main(String args[])
      {
   
 int age,weight;
 String criminalRecord,grade,gender,irishCourse="";
 float height;
 
 Scanner input = new Scanner(System.in);
 
 System.out.print("Please enter your age: ");
 age = input.nextInt();
 
 System.out.print("Please enter your height: ");
 height = input.nextFloat();
 
 System.out.print("Please enter your weight: ");
 weight = input.nextInt();
 
 input.nextLine();
 
 System.out.print("Please enter your gender (m or f): ");
 input.nextLine();
 gender = input.nextLine();
 
 System.out.print("Do you have a criminal record (y or n)? ");
 criminalRecord = input.nextLine();
 
 System.out.print("Did you receive at least a D grade in pass Irish in the Leaving Cert (y or n)? ");
 grade = input.nextLine();
 
 if (grade == "n") 
 	{
 
 	System.out.print("Do you commit to taking a 10 week Irish course on application (y or n)? ");
  irishCourse = input.nextLine();
                    }
 
 if (age>=18 && age<=35 && ((height >= 1.85 && gender.equals("m")) || (height >= 1.6 && gender.equals("f"))) && 
 	 weight<100 && criminalRecord.equals("n") && (grade.equals("y") || irishCourse.equals("y")))
  System.out.println("Congratulations - You are eligible to join the Gardai! ");
 
 else
 System.out.println("Comiserations - You are not eligible to join the Gardai! ");
 
      }
} 	
 

 
