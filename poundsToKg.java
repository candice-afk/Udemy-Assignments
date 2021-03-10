/*
Candice Carter
March 3rd, 2021 (edited March 9th, 2021)
Cosc 220*/

/** This program converts pounds to kilograms.*/

import java.util.Scanner;

public class poundsToKg
{
     public static void main(String []args)
     {
     
     //Create a scanner object
     Scanner keyboard = new Scanner(System.in);
     
     //Get user input
     System.out.println("Enter a weight in pounds (lbs).");
  
     double Pounds = keyboard.nextDouble();
     
          //Formula converting pounds to kilograms
          double Kilogram = (0.454) * (Pounds);
     
          //Display conversion on screen
          System.out.println("Pounds " + Pounds + " is " +
          Kilogram + " in Kilograms.");
     
     }
}