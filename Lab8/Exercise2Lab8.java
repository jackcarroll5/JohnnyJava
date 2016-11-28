//Exercise2Lab8.java
/*This program finds and displays the lowest whole power of 2 that is greater than 5,000*/

 public class Exercise2Lab8 {
   public static void main(String args[])
      {
   
   int value = 0;
   
  while(Math.pow(2,value)<=5000) 
    {
      value++;
    }
   
   System.out.println("The lowest power of 2 which exceeds 5000 is " + value );
   
      }
 }