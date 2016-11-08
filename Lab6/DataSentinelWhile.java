//DataSentinelWhile.java
/*This program uses a data-sentinel controlled while loop to read in the heights of a 
 *group of students of arbitrary size and then determine the average height along
 *with the number of students processed*/
 
import java.util.Scanner; 
 
public class DataSentinelWhile {
   public static void main(String args[])
      {
          float height, totalHeight = 0;
          int numProcessed = 0;
 
          Scanner input = new Scanner(System.in);
 
          System.out.print("Please enter the height of student " 
          + (numProcessed + 1) + " (-1 to exit):");
 
          height = input.nextFloat();
 
          while(height != -1)
             {
                 totalHeight = totalHeight + height;
                 numProcessed = numProcessed + 1;
 
                System.out.print("Please enter the height of student "
                + (numProcessed + 1) + " (-1 to exit): ");
                height = input.nextFloat();
             }
    System.out.println("\n\nThe number of students processed is " + numProcessed +
     "\nThe average height of the students is " + String.format("%.2f",totalHeight/numProcessed) + " m");
      } 
}