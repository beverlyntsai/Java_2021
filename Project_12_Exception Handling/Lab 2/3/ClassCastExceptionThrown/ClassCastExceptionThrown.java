/**                                                
 * ClassCastExceptionThrown.java
 * Write a program that demonstrates each type of exception being thrown (one program per exception).
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * ClassCastExceptionThrown
*/ 
import java.util.Scanner;
import java.util.*;
public class ClassCastExceptionThrown
{
   public static void main(String[] args)
   {

	Scanner input=new Scanner(System.in);
	System.out.println();

	System.out.println("This is ClassCastExceptionCatch test. Cat class is cast to Dog Class that causes ClassCastException.");
	Cat cat=new Cat("Amy", 12, 5);


	String name;

	if(!cat.getClass().equals(Dog.class)){

		System.out.println("If getClass() is different, the program throws ClassCastExceptionThrown().");
		throw new ClassCastException();

	}else{
		Dog dog=new Dog("Amy", 12, 5);
		name=getPetName(dog);

	}




    }//main



    public static String getPetName(Dog dog)
    {

	String name="";

	name=dog.getName();
		
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



