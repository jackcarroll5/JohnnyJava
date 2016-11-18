//ProblemSolving7Activity3.java
/*This program will use task-controlled looping to find the term in a series that will
 *put the sum over 1000 and display the term number along with the sum*/
 
 public class ProblemSolving7Activity3 {
   public static void main(String args[])
   {
   
    int termNumber = 0, seriesSum = 0;

    while(seriesSum <= 1000)
      {
    termNumber++;
    seriesSum = seriesSum + termNumber*termNumber;
      }
   
   System.out.println("The term that first puts the series over 1000 is "+ termNumber +
                    "\nThe sum of the series at this stage is " + seriesSum);
  
   }
 }