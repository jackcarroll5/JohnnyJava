//Exercise2Formatted.java
/* This program will display the values of a well-known book,the year it was released,
 *the number of pages and its author.It will show how integer, String and floating-point
 *variables can be formatted.*/

public class Exercise2Formatted {
    public static void main (String args[])
    {
           String title = "Harry Potter and the Prisoner of Azkaban", author = "JK Rowling";
           
           
           int numberOfPages = 317;
           int yearOfPublication = 1999;
           
           float price = 35.50f;
           
           //String formatString = String.format("%-35s%-40s \n%-35s%-10s  \n%-35s%-10d  \n%-35s%-10d  \n%-35s%.2f",
            String formatString = String.format("%-35s%s\n%-35s%s\n%-35s%d\n%-35s%d\n%-35s%.2f",
           						"Title: ",title,"Author: ",author,"Number Of Pages: ",numberOfPages,"Year of publication: ",yearOfPublication,"Price: ",price);
           						
                                           
           System.out.println(formatString);        
          //System.out.println(String.format("%-35s","Title"));
    }
}  	