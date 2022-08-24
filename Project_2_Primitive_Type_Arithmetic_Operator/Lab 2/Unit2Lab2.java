import java.util.Scanner;


/**                                                
 * This class Unit2Lab2 is to implement Unit2 Lab2 assignment    
 * Write a Java program that prompts the user to enter a monetary amount (in dollars and cents) 
 * as a double precision variable and then displays the monetary equivalent in dollars, quarters, 
 * dimes, nickels, and pennies. For example, if the user enters 15.98 the program should display the following result: 
 * $15.98 consists of 15 dollars, 3 quarters, 2 dimes, 0 nickels, 3 pennies                    
 * @author Beverlyn Tsai               
 */   

public class Unit2Lab2
{
  public static void main( String [] args )
  {
	/**  
	* Define and initialize variables for values
	*/
	double moneyDouble = 0;
	int moneyDollar = 0;
	double moneyCent = 0;
	int moneyCentInt = 0;
	int numQuarter=0, numDime=0, numNickel=0, numPenny=0;

    
	/**  
	* Use a Scanner to input integer values
	*/
	Scanner input = new Scanner( System.in );
	System.out.print( "\nEnter a monetary amount (in dollars and cents): $" );

	/**  
	* This is to get complete money amount
	*/
	moneyDouble = input.nextDouble();


	/**  
	* This is to get integer part of money, a.k.a. dollar
	*/
	moneyDollar = (int)moneyDouble;



	/**  
	* This is to get decimal part of money input in cents
	*/
	moneyCent = (int)(((moneyDouble-moneyDollar)*100)*100+0.5)/100;

	/**  
	* This is to convert cent from double to integet format
	*/
	moneyCentInt=(int)moneyCent;


	/**  
	* This is to get how many quarters
	*/
	if(moneyCentInt>=25){
		numQuarter=moneyCentInt/25;		
	}

	/**  
	* This is to get how many dimes
	*/
	numPenny = moneyCentInt%25;
	if(numPenny>=10){
		numDime=numPenny/10;		
	}


	/**  
	* This is to get how many nickels
	*/
	numPenny = numPenny%10;
	if(numPenny>=5){
		numNickel=numPenny/5;		
	}


	/**  
	* This is to get how many pennies
	*/
	numPenny = numPenny%5;


	/**  
	* This is to print out the composition of coins from input moeny amount
	*/
	System.out.print( "$"+moneyDouble+" consists of ");
	System.out.print( moneyDollar+" dollar(s), ");
	System.out.print( numQuarter+" quarter(s), ");
	System.out.print( numDime+" dime(s), ");
	System.out.print( numNickel+" nickel(s), ");
	System.out.println( numPenny+" pennies");



  }
}