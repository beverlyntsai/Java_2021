/**                                                
 * 
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   


import java.util.Scanner;
public class Unit5Lab1
{
	public static void main(String [] args)		
	{
		int choice=1;
		double value=0, resultValue, interest=0.05, year=0, month=0;
		Scanner input=new Scanner(System.in);
		
		System.out.println("There are 3 financial methods:");
		System.out.println("(1) Input present value to get future value");
		System.out.println("(2) Input future value to get present value");
		System.out.println("(3) Input monthly deposit(annuity) to get future value");
		System.out.print("Select your financial method(Enter 1,2,3): ");
		choice=input.nextInt();
 		System.out.print("Interest is compounded monthly. Enter the annual interest rate(e.g., 0.05):");
		interest=input.nextDouble();
		interest=interest/12; //get month interest rate

 		System.out.print("Enter how many years:");
		year=input.nextDouble();
		month=year*12; //change to month so the interest can be compounded monthly

		switch(choice){
		case 1: System.out.print("Enter your present value:");
			value=input.nextDouble();
			resultValue=PresenttoFuture(value, interest, month); 
			resultValue=Math.floor(resultValue*100+0.5)/100;
			System.out.print("Your future value is $"+resultValue);
			break;
		case 2: System.out.print("Enter your future value:");
			value=input.nextDouble();
			resultValue=FuturetoPresent(value, interest, month) ;
			resultValue=Math.floor(resultValue*100+0.5)/100;
			System.out.print("Your present value is $"+resultValue);
			break;
		case 3: System.out.print("Enter your monthly deposit(annuity):");
			value=input.nextDouble();
			resultValue=AnnuitytoFuture(value, interest, month);
			resultValue=Math.floor(resultValue*100+0.5)/100;
			System.out.print("Your future value is $"+resultValue);
			break;

		default: break;
		}

		


	}


	//This method is to take in present value and convert to future value
	public static double PresenttoFuture(double presentValue, double i, double n)  
	{ 
		double futureValue=presentValue*Math.pow(1+i,n);

		return futureValue; 
	}

	//This method is to take in future value and convert to present value
	public static double FuturetoPresent(double futureValue, double i, double n)   
	{ 
		double presentValue=futureValue/Math.pow(1+i,n);

		return presentValue; 
	}

	//This method is to take in annual value(monthly deposit) and convert to future value
	public static double AnnuitytoFuture(double annuity, double i, double n)    
	{ 
		double futureValue=annuity*(Math.pow(1+i,n)-1)/i;

		return futureValue; 
	} 





}