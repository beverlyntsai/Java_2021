/**                                                
 * Unit15Lab2.java
 * (Bubble Sort) Implement bubble sort—another simple yet inefficient sorting technique. It's
 * called bubble sort or sinking sort because smaller values gradually "bubble" their way to the top of
 * the array (i.e., toward the first element) like air bubbles rising in water, while the larger values sink
 * to the bottom (end) of the array. The technique uses nested loops to make several passes through
 * the array. Each pass compares successive pairs of elements. If a pair is in increasing order (or the
 * values are equal), the bubble sort leaves the values as they are. If a pair is in decreasing order, the
 * bubble sort swaps their values in the array. The first pass compares the first two elements of the array
 * and swaps their values if necessary. It then compares the second and third elements in the array. The
 * end of this pass compares the last two elements in the array and swaps them if necessary. After one
 * pass, the largest element will be in the last index. After two passes, the largest two elements will be
 * in the last two indices. Explain why bubble sort is an O(n2) algorithm.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * Unit15Lab2
*/ 
import java.util.Scanner;
import java.util.*;
public class Unit15Lab2
{
  	 public static void main(String[] args)
   	{

		int[] array={4,8,1,6,7,2,9,3,5};
		
		System.out.print("The original array of 9 integers is: ");

		printArray(array);

		bubbleSort(array);

		System.out.print("The array after bubble sort is: ");

		printArray(array);

   	}

	//This is to print array
	public static void printArray(int[] array)
	{
		for(int i=0;i<array.length;i++){

			System.out.print(array[i]+" ");

		}

		System.out.println("");


	}


	//This is bubble sort
	public static void bubbleSort(int[] array)
	{
		int temp;

		for(int i=array.length-1;i>0;i--){

			for(int j=0;j<i;j++){
				
				if(array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;

				}

			}

		}

	}



	
	
} 



