/**                                                
 * IllegalArgumentExceptionThrown.java
 * Write a program that demonstrates each type of exception being thrown (one program per exception).
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * IllegalArgumentExceptionThrown
*/ 
import java.util.Scanner;
import java.util.*;
public class IllegalArgumentExceptionThrown
{
   public static void main(String[] args)
   {

	Scanner input=new Scanner(System.in);
	System.out.println();
	int number=0;
	String name;

	System.out.println("This is IllegalArgumentException test. User input a negative number to throw IllegalArgumentException().");

	//Prompt the user input how many pets
 	System.out.print("How many pets do you want to input?");
	number=input.nextInt();
	if (number < 0 )
               throw new IllegalArgumentException("Number must be positive number.");     

    }//main


 
} 

