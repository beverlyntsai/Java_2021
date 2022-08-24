/**                                                
 * Write a program that prompts the user to enter the maximum number of asterisks (*) to 
 * display on a line of output, and then displays a line of output with that many asterisks, 
 * a line with one less asterisk, a line with two less asterisks, …, and a line with one asterisk.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   

import java.util.Scanner;
public class Unit4Lab2
{
	public static void main(String [] args)		
	{
		int number=0;
		System.out.print("Please maximum number of asterisks ?");
		Scanner input=new Scanner(System.in);
		number=input.nextInt();

		//This loop is to control how many lines of printing
		for (int i=number; i>0; i--){

			//This loop is to control how many asterisks are printed in each line
			for(int j=0; j<i; j++){
				System.out.print("*");
			}

			System.out.println("");

		}




	}
}



