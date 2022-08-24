/**                                                
 * The process of finding the largest value or smallest value in a sequence is commonly used in many computer applications. 
 * This assignment involves developing a program that prompts the user to enter a series of 10 integers and then determines 
 * and displays the largest and smallest values entered. This program uses do while loop way.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */  

import java.util.Scanner;
public class Unit4Lab3C
{
	public static void main(String [] args)		
	{

		int number=0;
		System.out.println("Please enter 10 numbers:");
		Scanner input=new Scanner(System.in);
		int[] array= new int[10];
		int smallest=0, largest=0;

		int counter=0;
		
		//read user input and store 10 integers in array
		do{

			System.out.print("Number " + (counter+1) + ": ");
			array[counter] = input.nextInt();
			counter++;
		}while(counter<10);

		counter=0;
		smallest=array[0];
		largest=array[0];

		//Compare each array value to smallest and largest
		do{
			
			//If for smallest
			if (array[counter] < smallest) smallest = array[counter];

			//If for largest
			if (array[counter] > largest) largest = array[counter];

			counter++;

		}while(counter<10);

		
		System.out.println("The smallest number is " + smallest + ".");

		System.out.println("The largest number is " + largest + ".");



	}
}



