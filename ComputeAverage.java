/**
Candice Carter 
March 3rd, 2021
Cosc 220
*/
 /*  This program computes the average of user input for 3 numbers. */

import java.util.Scanner; 
 
public class ComputeAverage
{
     public static void main(String[] args)
     {
     
     //Creates Scanner object
     Scanner keyboard = new Scanner(System.in);
     
     //Get user input
     System.out.println("Enter 3 integers: ");
     
     int firstVariable = keyboard.nextInt();
     
     int secondVariable = keyboard.nextInt();
     
     int thirdVariable = keyboard.nextInt();
     
          // Compute average
          int average = (firstVariable * secondVariable * thirdVariable) / 3;
     
          //Display average
          System.out.println("The average is " + average + " .");
     }

}