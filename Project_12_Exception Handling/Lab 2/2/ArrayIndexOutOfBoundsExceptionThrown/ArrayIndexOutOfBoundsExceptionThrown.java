/**                                                
 * ArrayIndexOutOfBoundsExceptionThrown.java
 * Write a program that demonstrates each type of exception being thrown (one program per exception).
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * ArrayIndexOutOfBoundsExceptionThrown
*/ 
import java.util.Scanner;
import java.util.*;
public class ArrayIndexOutOfBoundsExceptionThrown
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
	int index=2;

	if(index>petList.length-1){
		System.out.println("If the index is greater equal to array length, the program throws ArrayIndexOutOfBoundsException().");
		throw new ArrayIndexOutOfBoundsException();
	}else{
		name=getPetName(petList[2]);
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



