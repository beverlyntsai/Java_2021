/**                                                
 * Develop a set of static methods in a class called ArrayTools that perform the functions below, and overload 
 * the methods for the specified types. The ArrayTools class does not need a main() method. Write a program 
 * called ArrayToolsTest that tests each of the methods in the ArrayTools class. 
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   


import java.util.Scanner;
public class ArrayToolsTest
{
	public static void main(String [] args)		
	{
		int MAX_NUM=5;	
		char value1;
		int value2, index=0;
		double value3;

		char[] array1 = {'c', 'b', 'a', 'e', 'd'};
		int[] array2 = {12, 4, 5, 2, 5};
		double[] array3 = {9.1, 2.5, 5.4, 6.4, 5.6};

		value1=ArrayTools.minimum(array1);
		value2=ArrayTools.minimum(array2);
		value3=ArrayTools.minimum(array3);

		System.out.println("The minimum value of char array is "+value1);

		System.out.println("The minimum value of int array is "+value2);

		System.out.println("The minimum value of double array is "+value3);

		value1=ArrayTools.maximum(array1);
		value2=ArrayTools.maximum(array2);
		value3=ArrayTools.maximum(array3);

		System.out.println("The maximum value of char array is "+value1);

		System.out.println("The maximum value of int array is "+value2);

		System.out.println("The maximum value of double array is "+value3);


		index=ArrayTools.minimumAt(array1);

		System.out.println("The location of the minimum value of char array is "+index);

		index=ArrayTools.minimumAt(array2);

		System.out.println("The location of the minimum value of int array is "+index);

		index=ArrayTools.minimumAt(array3);

		System.out.println("The location of the minimum value of double array is "+index);


		index=ArrayTools.maximumAt(array1);

		System.out.println("The location of the maximum value of char array is "+index);

		index=ArrayTools.maximumAt(array2);

		System.out.println("The location of the maximum  value of int array is "+index);

		index=ArrayTools.maximumAt(array3);

		System.out.println("The location of the maximum value of double array is "+index);


		double average=0;
		average=ArrayTools.average(array2);

		System.out.println("The average value of int array is "+average);

		average=ArrayTools.average(array3);

		System.out.println("The average value of double array is "+average);
	}

		




}




class ArrayTools
{
	//Return the minimum value of a char array
	static char minimum(char array[]){

		char smallestValue=array[0]; // Set the index 0's value as the default smallest value

		for(int i=0; i<array.length;i++){
			if(array[i]<smallestValue){
				smallestValue=array[i];
			}

		}

		return smallestValue;

	}

	//Return the minimum value of a integer array
	static int minimum(int array[]){


		int smallestValue=array[0]; // Set the index 0's value as the default smallest value

		for(int i=0; i<array.length;i++){
			if(array[i]<smallestValue){
				smallestValue=array[i];
			}

		}

		return smallestValue;

	}

	//Return the minimum value of a double array
	static double minimum(double array[]){

		double smallestValue=array[0]; // Set the index 0's value as the default smallest value

		for(int i=0; i<array.length;i++){
			if(array[i]<smallestValue){
				smallestValue=array[i];
			}

		}

		return smallestValue;

	}


	//Return the maximum value of a char array
	static char maximum(char array[]){

		char largestValue=array[0]; // Set the index 0's value as the default largest value

		for(int i=0; i<array.length;i++){
			if(array[i]>largestValue){
				largestValue=array[i];
			}

		}

		return largestValue;

	}

	//Return the maximum value of a integer array
	static int maximum(int array[]){

		int largestValue=array[0]; // Set the index 0's value as the default largest value

		for(int i=0; i<array.length;i++){
			if(array[i]>largestValue){
				largestValue=array[i];
			}

		}

		return largestValue;

	}

	//Return the maximum value of a double array
	static double maximum(double array[]){

		double largestValue=array[0]; // Set the index 0's value as the default largest value

		for(int i=0; i<array.length;i++){
			if(array[i]>largestValue){
				largestValue=array[i];
			}

		}

		return largestValue;

	}

	//Return the index of the minimum value in a char array
	static int minimumAt(char array[]){

		int index=0;
		char smallestValue=array[0]; // Set the index 0's value as the default smallest value

		for(int i=0; i<array.length;i++){
			if(array[i]<smallestValue){
				index=i;
			}

		}

		return index;


	}


	//Return the index of the minimum value in a integer array
	static int minimumAt(int array[]){

		int index=0;
		int smallestValue=array[0]; // Set the index 0's value as the default smallest value

		for(int i=0; i<array.length;i++){
			if(array[i]<smallestValue){
				index=i;
			}

		}

		return index;


	}


	//Return the index of the minimum value in a double array
	static int minimumAt(double array[]){

		int index=0;
		double smallestValue=array[0]; // Set the index 0's value as the default smallest value

		for(int i=0; i<array.length;i++){
			if(array[i]<smallestValue){
				index=i;
			}

		}

		return index;


	}



	//Return the index of the maximum value in a char array
	static int maximumAt(char array[]){

		int index=0;
		char largestValue=array[0]; // Set the index 0's value as the default largest value

		for(int i=0; i<array.length;i++){
			if(array[i]>largestValue){
				index=i;
			}

		}

		return index;


	}


	//Return the index of the maximum value in a integer array
	static int maximumAt(int array[]){

		int index=0;
		int largestValue=array[0]; // Set the index 0's value as the default largest value

		for(int i=0; i<array.length;i++){
			if(array[i]>largestValue){
				index=i;
			}

		}

		return index;


	}



	//Return the index of the maximum value in a double array
	static int maximumAt(double array[]){

		int index=0;
		double largestValue=array[0]; // Set the index 0's value as the default largest value

		for(int i=0; i<array.length;i++){
			if(array[i]>largestValue){
				index=i;
			}

		}

		return index;


	}

	//Return the average value stored in a int array
	static double average(int array[]){

		double sum=0, average=0;

		for(int i=0; i<array.length;i++){
		
			sum+=array[i];

		}

		average=sum/array.length;

		return average;


	}

	//Return the average value stored in a double array
	static double average(double array[]){

		double sum=0, average=0;

		for(int i=0; i<array.length;i++){
		
			sum+=array[i];

		}

		average=sum/array.length;

		return average;


	}

}