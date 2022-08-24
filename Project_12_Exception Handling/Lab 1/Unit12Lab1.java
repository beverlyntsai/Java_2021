/**                                                
 * Unit12Lab1.java
 * Write a program that modifies the CatchExceptions6 program you wrote as part of lecture 12.4 to allow the user repeated 
 * tries at entering a correct value for the divisor. 
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * Unit12Lab
*/ 
import java.util.Scanner;
import java.util.*;
public class Unit12Lab1
{
   public static void main(String[] args)
   {

	Scanner input=new Scanner(System.in);
	System.out.println();
	int result=0;
	boolean denominatorIsZero=true;
	int n=0;

	System.out.println("The original test value for x/y is x=10, y=0, causing arithmetic exception.");

	//Besides Exception handler, a While loop is added to ensure the user enter the non-zero denominator
	//If denominatorIsZero is true, it will keep prompting the user to enter a denominator until a non-zero denominator is entered
	while(denominatorIsZero){
		try
		{
			result=divide(10,0);
			denominatorIsZero=false;
		}
		catch (DivideByZeroException e)
		{
			
			try
			{
       			 	System.out.print("Dennominator must be nonzero....please enter a valid denominator:");
        			n = input.nextInt();
				denominatorIsZero=false;
				result=divide(10,n);



			}
			catch(DivideByZeroException ex)
			{
				denominatorIsZero=true;

			}

		}	

	}//while


	System.out.println("x=10, y=" + n + ", x/y =" +result);

    }//main


    //This method is declared that it throws a DivideByZeroException 	
    public static int divide(int x, int y) throws DivideByZeroException
    {

  	int result=0;

	try
	{
		result=x/y;

	}
	catch(ArithmeticException e)
	{
		throw new DivideByZeroException(y);

	}
		
	return result;
    }

 
} 


//DivideByZeroException is the class that inherited Exception class
class DivideByZeroException extends Exception
{
	private int denom;

	public DivideByZeroException()
	{

	}

	public DivideByZeroException(String s)
	{
		super(s);
	}

	public DivideByZeroException(int d)
	{
		super("div by zero");
		denom=d;

	}

	public int getDenominator()
	{
		return denom;
	}




}


