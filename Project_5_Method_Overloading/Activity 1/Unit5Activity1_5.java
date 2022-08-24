/**                                                
 * 
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   

import java.lang.Math;
import java.util.Scanner;
public class Unit5Activity1_5
{
	public static void main(String [] args)		
	{
		double x=0;
		double y=0;
		double a=10;
		double b=0;

		System.out.print("Please enter x:");
		Scanner input=new Scanner(System.in);
		x=input.nextDouble();
		System.out.print("Please enter y:");
		y=input.nextDouble();
		
		//This is to round to integer
		b=0;
		double num=Math.floor((x/y)*Math.pow(a,b)+0.5)/Math.pow(a,b);
		System.out.println("Round x/y to integer is "+(int)num);


		//This is to round to one decimal place
		b=1;
		num=Math.floor((x/y)*Math.pow(a,b)+0.5)/Math.pow(a,b);
		System.out.println("Round x/y to one decimal place is "+num);


		//This is to round to two decimal places
		b=2;
		num=Math.floor((x/y)*Math.pow(a,b)+0.5)/Math.pow(a,b);
		System.out.println("Round x/y to two decimal place is "+num);


		//This is to round to three decimal places
		b=3;
		num=Math.floor((x/y)*Math.pow(a,b)+0.5)/Math.pow(a,b);
		System.out.println("Round x/y to three decimal place is "+num);





        }



	
}