//TaskControlledWhile.java
/*This program uses a task-controlled while loop to determine the smallest positive 
 *integer whose fifth power exceeds 100000*/
 
 public class TaskControlledWhile {
   public static void main(String args[])
   {
   	
       int value = 0;   	
   	
   	  while(Math.pow(value,5) <= 100000)
   	  {
   	  	value++;
   	  }
 
 System.out.println("\nThe smallest positive integer whose fifth power exceeds " +
 	                 "100,000 is " + value);  
   	
   }
 }