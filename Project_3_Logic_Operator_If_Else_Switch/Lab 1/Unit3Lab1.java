/**                                                
 * This class is to that prompts the user to enter integer values for the sides of a triangle and then 
 * displays the values and the type of triangle they represent. If the user enters values that do not 
 * make a valid triangle, or if any values are not greater than zero, your program should display the 
 * values entered as well the following error message: The values entered do not make a valid triangle. 
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   

import java.util.Scanner;
public class Unit3Lab1
{
	public static void main(String [] args)		
	{
		int side1=0,side2=0,side3=0;
		boolean isValid=true;
		int triangleType=2; //0: equilateral 1:isosceles 2: scalene

		/**  
		* Create a Scanner Object
 		*/   
		Scanner input= new Scanner(System.in);

		/** 
		* Prompt the user to enter three sides of Traiangle
 		*/ 
		System.out.print("Please enter integer values for the 3 sides of a triangle:\nPlease enter integer value for side 1:");

		/** 
		* Read Side 1
		*/
		side1=input.nextInt();

		/** 
		* Prompt the user to enter three sides of Traiangle
		*/
		System.out.print("Please enter integer value for side 2:");

		/**
		* Read Side 2
		*/
		side2=input.nextInt();


		/**
		*Prompt the user to enter three sides of Traiangle
		*/
		System.out.print("Please enter integer value for side 3:");

		/**
		* Read Side 3
		*/
		side3=input.nextInt();



		/**
		* Check if user input negative or zero
		*/
		if(side1<=0 || side2<=0 || side3<=0){
			isValid=false;

		}else{// No negative or zero side case

			/**
			* Check if the sume of two sides greater than the third side			
			*/
			if(side1+side2>side3 && side1+side3>side2 && side2+side3>side1 ){
				isValid=true;


				/**
				* Check what type of triangle		
				*/
				if(side1==side2 && side2==side3 && side1==side3){
					triangleType=0;
				}else{

					if(side1==side2 || side2==side3 || side1==side3){
						triangleType=1;
					}else{
						triangleType=2;
					}

				}

			}else{

				isValid=false;

			}

		}


		/**
		* Print out if this is valid triangle		
		*/		
		if(!isValid){
			System.out.println("The values you entered do not make a valid triangle!");
		
		}else{
			/**
			* Print out what type of triangle: 0: equilateral 1:isosceles 2: scalene
			*/

			if(triangleType==0) System.out.println("The values you entered make a equilateral triangle");
			if(triangleType==1) System.out.println("The values you entered make a isosceles triangle");
			if(triangleType==2) System.out.println("The values you entered make a scalene triangle");
			
		}


	


	}
}



