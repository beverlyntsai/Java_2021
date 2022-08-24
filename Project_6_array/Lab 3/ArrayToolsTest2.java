/**                                                
 * Expand the functionality of ArrayTools class from the lab 2 assignment by using the Arrays class methods to add the following
 * These new ArrayTools methods are essentially wrapper methods. They just need to call the appropriate Arrays class methods. 
 * Write a program named ArrayToolsTest2 to test the added methods. 
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   


import java.util.Arrays;
public class ArrayToolsTest2
{
	public static void main(String [] args)		
	{

		boolean isEqual=true;
		int index=0;

		//Use these three char arrays to test, two are the same
		char[] array1_1 = {'a', 'b', 'c', 'd', 'e'};
		char[] array1_2 = {'a', 'b', 'c', 'd', 'e'};
		char[] array1_3 = {'c', 'b', 'a', 'e', 'd'};


		//Use these three integer arrays to test, two are the same
		int[] array2_1 = {12, 4, 5, 2, 5};
		int[] array2_2 = {12, 4, 5, 2, 5};
		int[] array2_3 = {12, 5, 4, 2, 5};


		//Use these three double arrays to test, two are the same
		double[] array3_1 = {9.1, 2.5, 5.4, 6.4, 5.6};
		double[] array3_2 = {9.1, 2.5, 5.4, 6.4, 5.6};
		double[] array3_3 = {9.1, 5.2, 3.8, 6.4, 5.6};



		isEqual=ArrayTools.equals(array1_1, array1_2);

		if(isEqual){
			System.out.println("The char array "+array1_1[0]+","+ array1_1[1]+","+ array1_1[2]+","+ array1_1[3]+","+ array1_1[4]+" and array "+array1_2[0]+","+ array1_2[1]+","+ array1_2[2]+","+ array1_2[3]+","+array1_2[4]+" are equal");

		}else{
			System.out.println("The char array "+array1_1[0]+","+ array1_1[1]+","+ array1_1[2]+","+ array1_1[3]+","+ array1_1[4]+" and array "+array1_2[0]+","+ array1_2[1]+","+ array1_2[2]+","+ array1_2[3]+","+array1_2[4]+" are not equal");

		}


		isEqual=ArrayTools.equals(array1_1, array1_3);

		if(isEqual){
			System.out.println("The char array "+array1_1[0]+","+ array1_1[1]+","+ array1_1[2]+","+ array1_1[3]+","+ array1_1[4]+" and array "+array1_3[0]+","+ array1_3[1]+","+ array1_3[2]+","+ array1_3[3]+","+array1_3[4]+" are equal");

		}else{
			System.out.println("The char array "+array1_1[0]+","+ array1_1[1]+","+ array1_1[2]+","+ array1_1[3]+","+ array1_1[4]+" and array "+array1_3[0]+","+ array1_3[1]+","+ array1_3[2]+","+ array1_3[3]+","+array1_3[4]+" are not equal");

		}


		isEqual=ArrayTools.equals(array2_1, array2_2);

		if(isEqual){
			System.out.println("The integer array "+array2_1[0]+","+ array2_1[1]+","+ array2_1[2]+","+ array2_1[3]+","+ array2_1[4]+" and array "+array2_2[0]+","+ array2_2[1]+","+ array2_2[2]+","+ array2_2[3]+","+array2_2[4]+" are equal");

		}else{
			System.out.println("The integer array "+array2_1[0]+","+ array2_1[1]+","+ array2_1[2]+","+ array2_1[3]+","+ array2_1[4]+" and array "+array2_2[0]+","+ array2_2[1]+","+ array2_2[2]+","+ array2_2[3]+","+array2_2[4]+" are not equal");

		}


		isEqual=ArrayTools.equals(array2_1, array2_3);

		if(isEqual){
			System.out.println("The integer array "+array2_1[0]+","+ array2_1[1]+","+ array2_1[2]+","+ array2_1[3]+","+ array2_1[4]+" and array "+array2_3[0]+","+ array2_3[1]+","+ array2_3[2]+","+ array2_3[3]+","+array2_3[4]+" are equal");

		}else{
			System.out.println("The integer array "+array2_1[0]+","+ array2_1[1]+","+ array2_1[2]+","+ array2_1[3]+","+ array2_1[4]+" and array "+array2_3[0]+","+ array2_3[1]+","+ array2_3[2]+","+ array2_3[3]+","+array2_3[4]+" are not equal");

		}

		isEqual=ArrayTools.equals(array3_1, array3_2);

		if(isEqual){
			System.out.println("The integer array "+array3_1[0]+","+ array3_1[1]+","+ array3_1[2]+","+ array3_1[3]+","+ array3_1[4]+" and array "+array3_2[0]+","+ array3_2[1]+","+ array3_2[2]+","+ array3_2[3]+","+array3_2[4]+" are equal");

		}else{
			System.out.println("The integer array "+array3_1[0]+","+ array3_1[1]+","+ array3_1[2]+","+ array3_1[3]+","+ array3_1[4]+" and array "+array3_2[0]+","+ array3_2[1]+","+ array3_2[2]+","+ array3_2[3]+","+array3_2[4]+" are not equal");

		}


		isEqual=ArrayTools.equals(array3_1, array3_3);

		if(isEqual){
			System.out.println("The integer array "+array3_1[0]+","+ array3_1[1]+","+ array3_1[2]+","+ array3_1[3]+","+ array3_1[4]+" and array "+array3_3[0]+","+ array3_3[1]+","+ array3_3[2]+","+ array3_3[3]+","+array3_3[4]+" are equal");

		}else{
			System.out.println("The integer array "+array3_1[0]+","+ array3_1[1]+","+ array3_1[2]+","+ array3_1[3]+","+ array3_1[4]+" and array "+array3_3[0]+","+ array3_3[1]+","+ array3_3[2]+","+ array3_3[3]+","+array3_3[4]+" are not equal");

		}



		index=ArrayTools.find(array1_1, 'a');

		if(index>=0){
			System.out.println("character a is located in index "+index);
		}else{
			System.out.println("character can not be found in the array");
		}

		index=ArrayTools.find(array1_1, 'x');

		if(index>=0){
			System.out.println("character x is located in index "+index);
		}else{
			System.out.println("character x can not be found in the array");
		}


		index=ArrayTools.find(array2_1, 5);

		if(index>=0){
			System.out.println("Integer 5 is located in index "+index);
		}else{
			System.out.println("Integer 5 can not be found in the array");
		}

		index=ArrayTools.find(array2_1, 99);

		if(index>=0){
			System.out.println("Integer 99 is located in index "+index);
		}else{
			System.out.println("Integer 99 can not be found in the array");
		}



		index=ArrayTools.find(array3_1, 9.1);

		if(index>=0){
			System.out.println("Double 9.1 is located in index "+index);
		}else{

			System.out.println("Double 9.1 can not be found in the array");
		}

		index=ArrayTools.find(array3_1, 7.1);

		if(index>=0){
			System.out.println("Double 7.1 is located in index "+index);
		}else{

			System.out.println("Double 7.1 can not be found in the array");
		}

		

		//Print out char array before sort
		System.out.print("The char array before sort is "+array1_3[0]+","+array1_3[1]+","+array1_3[2]+","+array1_3[3]+","+array1_3[4]+"\n");

		//Print out char array before sort
		ArrayTools.sort(array1_3);
		System.out.print("The char array before sort is "+array1_3[0]+","+array1_3[1]+","+array1_3[2]+","+array1_3[3]+","+array1_3[4]+"\n");


		//Print out int array before sort
		System.out.print("The integer array before sort is "+array2_3[0]+","+array2_3[1]+","+array2_3[2]+","+array2_3[3]+","+array2_3[4]+"\n");

		//Print out int array before sort
		ArrayTools.sort(array2_3);
		System.out.print("The integer array before sort is "+array2_3[0]+","+array2_3[1]+","+array2_3[2]+","+array2_3[3]+","+array2_3[4]+"\n");

		//Print out double array before sort
		System.out.print("The double array before sort is "+array3_3[0]+","+array3_3[1]+","+array3_3[2]+","+array3_3[3]+","+array3_3[4]+"\n");

		//Print out double array before sort
		ArrayTools.sort(array3_3);
		System.out.print("The double array before sort is "+array3_3[0]+","+array3_3[1]+","+array3_3[2]+","+array3_3[3]+","+array3_3[4]+"\n");
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


	// This is a wrapper method of Arrays.equals in char type
	static boolean equals(char a1[], char a2[]){
		
		return(Arrays.equals(a1,a2));

	}

	// This is a wrapper method of Arrays.equals in integer type
	static boolean equals(int a1[], int a2[]){
		
		return(Arrays.equals(a1,a2));

	}

	// This is a wrapper method of Arrays.equals in double type
	static boolean equals(double a1[], double a2[]){
		
		return(Arrays.equals(a1,a2));

	}


	// This is a wrapper method of Arrays.binarySearch in char type
	// To use Arrays.binarySearch, Array.sort should be called first
	// In my code, I call wrapper method sort to replace directly 
	// calling Array.sort 
	static int find(char array[], char key){

		sort(array);
		
		return(Arrays.binarySearch(array,key));

	}


	// This is a wrapper method of Arrays.binarySearch in integer type
	// To use Arrays.binarySearch, Array.sort should be called first
	// In my code, I call wrapper method sort to replace directly 
	// calling Array.sort 
	static int find(int array[], int key){		

		sort(array);
		
		return(Arrays.binarySearch(array,key));

	}


	// This is a wrapper method of Arrays.binarySearch in double type
	// To use Arrays.binarySearch, Array.sort should be called first
	// In my code, I call wrapper method sort to replace directly 
	// calling Array.sort 
	static int find(double array[], double key){

		sort(array);
		
		return(Arrays.binarySearch(array,key));

	}


	// This is a wrapper method of Arrays.sort in char type
	static void sort(char array[]){
		
		Arrays.sort(array);

	}

	// This is a wrapper method of Arrays.sort in integer type
	static void sort(int array[]){
		
		Arrays.sort(array);

	}

	// This is a wrapper method of Arrays.sort in double type
	static void sort(double array[]){
		
		Arrays.sort(array);

	}


}