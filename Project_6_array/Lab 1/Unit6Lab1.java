/**                                                
 * Write a program that prompts the user to enter integers in the range 1 to 50 and counts the occurrences of each integer. 
 * The program should also prompt the user for the number of integers that will be entered. 
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   


import java.util.Scanner;
public class Unit6Lab1
{
	public static void main(String [] args)		
	{
		int number=0;
		int MAX_NUM=10;
		int MAX_RANGE=51;
		int[] array= new int[MAX_NUM]; // This array is to record the 10 integers user input
		int[] count= new int[MAX_RANGE]; // This array is to record the occurrence of each integer


		//Initalize the array value to 0
		for(int i=0; i<MAX_NUM; i++){
			array[i]=0;
		}

		//Initalize the occurrence array value to 0
		for(int i=0; i<MAX_RANGE; i++){
			count[i]=0;
		}


		Scanner input=new Scanner(System.in);
		
		//Prompt the user to input 10 numbers
		for(int i=0; i<MAX_NUM; i++){

 			System.out.print("Please enter any number in the range 1 to 50: ");
			input.nextInt();  //record the input integer to array
			count[array[i]]++;  //record the occurrence of input integer in the index that is same as input integer
		}


		
		//Print out the occurrence of each integers
		for(int i=0; i<MAX_RANGE; i++){

			if(count[i]!=0){
				if(count[i]>1)
					System.out.println(i+" occurs "+count[i]+" times");
				else
					System.out.println(i+" occurs "+count[i]+" time");	
			}
		}

	}



}