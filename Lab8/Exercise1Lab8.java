//Exercise1Lab8.java
/**/


  public class Exercise1Lab8 {
    public static void main(String args[])
      {
    
    int value = 0;
    
   while(Math.pow(-15000,value)>= -15000) 
   {
       value++;
   }
    
  System.out.println("The largest negative integer whose cube is less than -15,000 " +
  	"is " + value);  
    
      }
  }