import java.util.Scanner;


/**                                                
 * This class Unit1Lab2 is to implement Unit1 Lab2 assignment
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   

public class Unit1Lab2
{
  public static void main( String [] args )
  {
	 // Define and initialize variables for values to be input
	int v1 = 0;      // First value to be input
	int v2 = 0;      // Second value to be input
	int v3 = 0;      // Third value to be input
	int v4 = 0;      // Fourth value to be input
	int v5 = 0;      // Fifth value to be input
	int v6 = 0;      // Sixth value to be input
	int rowSum1=0;
	int rowSum2=0;
	int rowSum3=0;	
	int colSum1=0;
	int colSum2=0;
	int colSum3=0;	

    
	// Use a Scanner to input integer values
	Scanner input = new Scanner( System.in );
	System.out.println( "\n\n" );
	System.out.print( "Enter 6 integers separated by a blank space:" );
	v1 = input.nextInt();     // Input first value
	v2 = input.nextInt();     // Input second value
	v3 = input.nextInt();     // Input third value
	v4 = input.nextInt();     // Input fourth value
	v5 = input.nextInt();     // Input fifth value
	v6 = input.nextInt();     // Input sixth value
	
	rowSum1= v1+v2;
	rowSum2= v3+v4;
	rowSum3= v5+v6;
	colSum1= v1+v3+v5;
	colSum2= v2+v4+v6;
	colSum3= rowSum1+rowSum2+rowSum3;
	
    
    // Output using System.out.println()
    System.out.println( "\n\n" );
    System.out.println( "\t" + "Value" + "\t" + "Value" + "\t" + "Total");
    System.out.println( "\t" + v1 + "\t" + v2 + "\t" + rowSum1);
    System.out.println( "\t" + v3 + "\t" + v4 + "\t" + rowSum2);
    System.out.println( "\t" + v5 + "\t" + v6 + "\t" + rowSum3);
    System.out.println( "\t" + "----" + "\t" + "----"  + "\t" + "----" );
    System.out.println( "Total"+"\t" + colSum1 + "\t" + colSum2 + "\t" + colSum3);
    System.out.println( "\n\n" );
  }
}