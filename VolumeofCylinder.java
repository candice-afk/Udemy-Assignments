/*
Candice Carter
March 3rd, 2021 (edited March 9th, 2021)
Cosc 220*/

/** This program reads in radius and length then,
     computes the volume of a cylinder using this formula: 
     volume = area * length .*/

import java.util.Scanner;

public class VolumeofCylinder
{
     public static void main(String []args)
     {
     
     //Create a scanner object
     Scanner keyboard = new Scanner(System.in);
     
     //Get user input
     System.out.println("Enter the radius of the cylinder.");
  
     double radius = keyboard.nextDouble();
     
     //Formula calcuting the area of the cylinder
     double area = (radius * radius * 3.14159);
     
          //Get user input
          System.out.println("Enter the length of the cylinder.");
          
          double length = keyboard.nextDouble();
     
               //Formula calculating the volume of the cylinder
               double volume = (area * length);
     
               //Display volume on screen
               System.out.println("The area of the cylinder is " + area + "." +
               "\n The volume of the cylinder is " + volume + ".");
     
     }
}