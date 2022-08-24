/**                                                
 * ClassCastExceptionCatch.java
 * write a program that catches each type of thrown exception and display an error message indicating some of the details as to what that exception is.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * ClassCastExceptionCatch
*/ 
import java.util.Scanner;
import java.util.*;
public class ClassCastExceptionCatch
{
   public static void main(String[] args)
   {

	Scanner input=new Scanner(System.in);
	System.out.println();


	System.out.println("This is ClassCastExceptionCatch test. Cat class is cast to Dog Class that causes ClassCastException.");

	Cat cat=new Cat("Amy", 12, 5);


	String name;

	try
	{
		name=getPetName(cat);

	}
	catch (ClassCastException e)
	{
		System.out.println("ClassCastException is caught. Cat class cannot be cast to Dog class. ");
	}
		




    }//main


	
    public static String getPetName(Pet pet) throws ClassCastException
    {

  	String name="";

	try
	{
		Dog dog=(Dog)pet;
		name=dog.getName();

	}
	catch(ClassCastException e)
	{
		throw new ClassCastException();

	}
		
	return name;
    }

 
} 

/**  
 *  Dog Class
*/ 

class Dog extends Pet
{
	//This constructor inherited Pet's constructor
	public Dog(String name, double weight, int age){
		super(name,weight,age);

	}

	public String bark()
	{
		return "bow wow";
	}
	
}


/**  
 *  Cat Class
*/ 

class Cat extends Pet
{

	//This constructor inherited Pet's constructor
	public Cat(String name, double weight, int age){
		super(name,weight,age);

	}

	public String meow()
	{
		return "meow";
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



