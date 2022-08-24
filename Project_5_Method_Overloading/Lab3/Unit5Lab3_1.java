/**                                                
 * Write a method called minimum() that takes three double variables as arguments and returns 
 * the minimum of the three values. Write a method called maximum() that takes three double 
 * variables as arguments and returns the maximum of the three values. Do not use an if statement 
 * or a conditional operator (?:) 
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   


import java.util.Scanner;
public class Unit5Lab3_1
{
	public static void main(String [] args)		
	{
		double num1=0,num2=0,num3=0, min=0, max=0;

		
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter number 1: ");
		num1=input.nextDouble();
		System.out.print("Please enter number 2: ");
		num2=input.nextDouble();
		System.out.print("Please enter number 3: ");
		num3=input.nextDouble();

		max=maximum(num1,num2,num3);
		System.out.println("The maximum number is "+max);
		min=minimum(num1,num2,num3);
		System.out.println("The minimum number is "+min);
		

	}


	//This method is to return the maximum number of three input
	public static double maximum(double x, double y, double z)  
	{ 
		return Math.max(x, Math.max(y, z)); 
	}

	//This method is to return the minimum number of three input
	public static double minimum(double x, double y, double z)  
	{ 
   	 	return Math.min(x, Math.min(y, z)); 
	} 


}