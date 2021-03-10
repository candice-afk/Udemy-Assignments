/**
Candice Carter
March 3rd, 2021
Cosc 220
*/
/*   This program computes area using the follwing formula
     area = radius * radius * pi with input from the scanner class
     and display result.*/
     
import java.util.Scanner;

public class ComputeAreaFromScanner
{
     public static void main (String []args)
     {  
     
     double radius; // holds user input
     
     // Scanner class object
     Scanner keyboard = new Scanner (System.in);
     
     //Get user input
     System.out.println("Provide a value for the radius"); 
     
     radius = keyboard.nextDouble();
     
     //Compute area
     double area = radius * radius * 3.14159;
          
          //Display results
          System.out.println("The area for the circle of radius " 
          + radius + "is " + area);
       
     }
}