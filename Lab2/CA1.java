//CA1.java
/*This program shows the statistics of a famous player where the variables of the average goals per game
 *,his name(String) and his age are shown."Jack Carroll"*/

import java.util.Scanner;

public class CA1{
   public static void main (String args[])
      {
   
String playerName = "Lionel Messi";
int age;
float averageGoalsPerGame;

 Scanner input = new Scanner(System.in);

    System.out.print("Please enter the age of the player:");
    age = input.nextInt();

    System.out.print("Please enter the average goals per game of the player:");
    averageGoalsPerGame = input.nextFloat();

    String formatString = String.format("%-12s%s\n%-12s%d\n%-12s%.1f","\n\n\n==============================" + "\n\t\tPlayer Statistics" +
    "\n==============================" +"Name: ",playerName, "Age: ", age,
    "Average Goals Per Game: ",averageGoalsPerGame);

    System.out.println("\n\n\n==============================" + "\n\t\tPlayer Statistics" +
    "\n==============================" +"Name: ",playerName, "Age: ", age,
    "Average Goals Per Game: ",averageGoalsPerGame + formatString);
    
      }
}

