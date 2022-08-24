/**                                                
 * IllegalArgumentExceptionCatch.java
 * write a program that catches each type of thrown exception and display an error message indicating some of the details as to what that exception is.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * IllegalArgumentExceptionCatch
*/ 
import java.util.Scanner;
import java.util.*;
public class IllegalArgumentExceptionCatch
{
   public static void main(String[] args)
   {

	Scanner input=new Scanner(System.in);
	System.out.println();

	int number=0;
	String name;

	System.out.println("This is IllegalArgumentException test. User input a negative number to cause exception to catch");

	try
	{
		//Prompt the user input how many pets
 		System.out.print("How many pets do you want to input?");
		number=input.nextInt();
		if (number < 0 )
                  	throw new IllegalArgumentException("Number must be positive number.");
         

	}
	catch (IllegalArgumentException e)
	{
		System.out.println("IllegalArgumentException is caught. Number should be positive number.");
	}		




    }//main

 
} 

