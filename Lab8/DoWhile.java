//DoWhile.java
/*This program uses a do-while loop which processes an arbitrary number
 *of exam marks supplied by the user. The program determines the highest
 *mark along with the average mark (to the nearest whole number)*/
 
 import java.util.Scanner;
 
 public class DoWhile {
   public static void main(String args[])
      {
   
       int mark, totalMarks = 0, highestMark = 0, counter = 0;
 
       Scanner input = new Scanner(System.in);
 
      do {
           System.out.print("Please enter the mark of student " + (counter+1) + " (-1 to exit): ");
           mark = input.nextInt();
           
          if(mark == -1) 
             break;
             
          if(mark > highestMark)
           highestMark = mark;	
          	
          totalMarks += mark;	
          	
           counter++; 	
          	
      }while(mark != -1);
      
    System.out.println("\n\nHighest mark was: " + highestMark +
    	                "\nAverage mark was: " + String.format("%.0f",(float)totalMarks/counter));    	       	
      
     	}     	
 }         	   