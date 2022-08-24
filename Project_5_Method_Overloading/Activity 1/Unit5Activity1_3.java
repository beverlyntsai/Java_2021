/**                                                
 * This program is to generate 20 random numbers
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   

import java.util.Random;
public class Unit5Activity1_3
{
	public static void main(String [] args)		
	{
      		  // define the range 
       		 int max = 5; // generate random numbers within 1 to 5 
       		 int min = 1; 
       		 int range = max - min + 1; 
  

       		 
      		 for (int j = 0; j < 20; j++) { 
         		int rand = (int)(Math.random() * range) + min; 
           		System.out.print(rand+" "); // Output is different everytime this code is executed 
       		 } 



	}
}