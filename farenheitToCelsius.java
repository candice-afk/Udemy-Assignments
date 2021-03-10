/*
Candice Carter
March 3rd, 2021 (edited March 9th, 2021)
Cosc 220*/
/*   This program computes farnheit from user input to celsius*/

import java.util.Scanner;

public class farenheitToCelsius
{
     public static void main(String []args)
     {
     //Create a scanner object
     Scanner keyboard = new Scanner(System.in);
     
     //Get user input
     System.out.println("Enter a degree in Farenheiht.");
  
     double Farenheiht = keyboard.nextDouble();
     
     //Formula converting farenheit to celsius
     double celsius = (5.0/9) * (Farenheiht - 32);
     
     //Display conversion on screen
     System.out.println("Farenheit " + Farenheiht + " is " +
     celsius + " degrees in Celsius.");
     }
}
