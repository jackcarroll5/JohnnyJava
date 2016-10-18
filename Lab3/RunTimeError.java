//RunTimeError.java
/*This program demonstrates a Java runtime error*/

public class RunTimeError {
   public static void main(String args[])
      {
          float number = 1234.56f;

          System.out.println("The value of the variable number correct to 3 decimal" +
          	                 "places is " + String.format("%d",number));

      }
}