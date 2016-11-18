//ProblemSolving7Activity2.java
/*This program will confirm a student's t-number using an indeterminate while loop for the
 *primary loop process*/

import java.util.Scanner;

public class ProblemSolving7Activity2 {
  public static void main(String args[])
   {
  
char character = 9;
int index = 1, count = 0;
String tNumber;
boolean valid = false;

Scanner input = new Scanner(System.in);

System.out.print("Please enter the t-number of the student: ");
tNumber = input.nextLine();

while(valid == false)
{
count = tNumber.length();
character = tNumber.charAt(0);
	
 if(character == 't' && count == 9) 
	{
character = tNumber.charAt(index);
while(index < count && character >= '0' && character <= '9')
{
index++;
if(index < count)
character = tNumber.charAt(index);
}

if(index == count)
    {
      System.out.println("\nYou have entered a valid t-number");
      valid = true;
	}
else
   {
	System.out.print("Invalid t-number entered - please enter a valid t-number: ");
    tNumber = input.nextLine();
    index = 1;
   }
}
else
   {
	System.out.print("Invalid t-number entered - please enter a valid t-number: ");
    tNumber = input.nextLine();
    index = 1;
   }

          }    
      }
}