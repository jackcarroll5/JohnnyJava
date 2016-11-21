//Exercise3Lab7.java
/**/


 public class Exercise3Lab7 {
   public static void main(String args[])
      {
   
    int year = 1;
   	float balance = 100000,rate = 3;
   	
    while(balance <= 100000) 
    {
    balance += (balance*rate)/100-12000; 
   System.out.println("Balance at the end of year " + year + " is EUR" +
   	 String.format("%.2f",balance)); 	
    }
    
      }  
 }  	 	