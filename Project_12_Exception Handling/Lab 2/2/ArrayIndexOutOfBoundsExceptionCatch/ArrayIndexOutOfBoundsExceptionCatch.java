/**                                                
 * ArrayIndexOutOfBoundsExceptionnCatch.java
 * write a program that catches each type of thrown exception and display an error message indicating some of the details as to what that exception is.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * ArrayIndexOutOfBoundsExceptionCatch
*/ 
import java.util.Scanner;
import java.util.*;
public class ArrayIndexOutOfBoundsExceptionCatch
{
   public static void main(String[] args)
   {

	Scanner input=new Scanner(System.in);
	System.out.println();


	System.out.println("This is ArrayIndexOutOfBoundsExceptionCatch test. There were only two pets added to the array but call Pet[2] to cause ArrayIndexOutOfBoundsException.");

	Pet[] petList=new Pet[2];
	petList[0]=new Pet("Amy", 12, 5);
	petList[1]=new Pet("Lily", 15, 6);

	Pet pet=null;
	String name;

	try
	{
		name=getPetName(petList[2]);

	}
	catch (ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayIndexOutOfBoundsException is caught. The existent index is 0,1 only. Index 2 is out of bound. ");
	}
		




    }//main


	
    public static String getPetName(Pet pet) throws ArrayIndexOutOfBoundsException
    {

  	String name="";

	try
	{
		name=pet.getName();

	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		throw new ArrayIndexOutOfBoundsException();

	}
		
	return name;
    }

 
} 



/**  
 *  Pet Class
*/ 
class Pet
{
	//It has 3 attributes: name, weight, age
	private String name="";
	private double weight=0;
	private int age=0;


	public Pet(){
	}

	public Pet(String name, double weight, int age){
		this.name=name;
		this.weight=weight;
		this.age=age;

	}
	public String getName(){
		return name;

	}

	public double getWeight(){
		return weight;

	}
	public int getAge(){
		return age;

	}

}



