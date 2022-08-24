/**                                                
 * NullPointerExceptionThrown.java
 * Write a program that demonstrates each type of exception being thrown (one program per exception)
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * NullPointerExceptionThrown
*/ 
import java.util.Scanner;
import java.util.*;
public class NullPointerExceptionThrown
{
   public static void main(String[] args)
   {

	Scanner input=new Scanner(System.in);
	System.out.println();


	System.out.println("This is NullPointerExceptionThrown test by setting pet class as null pointer. ");


	Pet pet=null;
	String name;

	if(pet==null){
		System.out.println("If pet class is null, the programs throws NullPointerException().");
		throw new NullPointerException();
	}else{

		name=getPetName(pet);
	}



    }//main


    public static String getPetName(Pet pet)
    {

  	String name="";

	name=pet.getName();
		
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



