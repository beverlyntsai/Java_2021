/**                                                
 * NullPointerExceptionCatch.java
 * write a program that catches each type of thrown exception and display an error message indicating some of the details as to what that exception is.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * NullPointerExceptionCatch
*/ 
import java.util.Scanner;
import java.util.*;
public class NullPointerExceptionCatch
{
   public static void main(String[] args)
   {

	Scanner input=new Scanner(System.in);
	System.out.println();


	System.out.println("This is NullPointerExceptionCatch test by setting pet class as null pointer. ");


	Pet pet=null;
	String name;

	try
	{
		name=getPetName(pet);

	}
	catch (NullPointerException e)
	{
		System.out.println("NullPointerException is caught. Your pet Class is Null Pointer so the program cannot access its instance method.");
	}
		




    }//main


	
    public static String getPetName(Pet pet) throws NullPointerException
    {

  	String name="";

	try
	{
		name=pet.getName();

	}
	catch(NullPointerException e)
	{
		throw new NullPointerException();

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



