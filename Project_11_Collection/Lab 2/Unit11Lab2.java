/**                                                
 * Unit11Lab2.java
 * Write a program that contains a method that will remove duplicate values from an array list of integers as indicated
 * The program should include a main() method that creates and initializes the original list, displays the list, calls 
 * the removeDuplicates() method, and then displays the modified list.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * Unit11Lab2
*/ 
import java.util.*;
import java.util.stream.Collectors;
public class Unit11Lab2
{
   public static void main(String[] args)
   {


		ArrayList<Integer> integerList= new ArrayList<Integer>();

		//I purposely added duplicate integers to the original list.
		integerList.add(1);
		integerList.add(1);
		integerList.add(3);
		integerList.add(1);
		integerList.add(2);	
		integerList.add(1);	
		integerList.add(4);
		integerList.add(3);
		integerList.add(1);
		integerList.add(5);



		System.out.println("******************************************************************************");
		System.out.println("Here are the list of integers before removing duplicates:\n");
       		System.out.println(integerList);


		System.out.println("******************************************************************************");

		//This method is to remove the duplicated integers.
		removeDuplicates(integerList);


		System.out.println("Here are the list of integers after removing duplicates:\n");
       		System.out.println(integerList);

   	}
 

	//This method will remove duplicate values from an array list of integers.
	public static void removeDuplicates(ArrayList<Integer> list){
	

		for(int i=0;i<list.size();i++){
 
 			for(int j=i+1;j<list.size();j++){
         			if(list.get(i).equals(list.get(j))){
              			  list.remove(j);
           			 }
   			 }
 
 		}
 

	}


	
} 



