/**                                                
 * Unit11Lab3.java
 *  Write a program that prompts the user to enter data (name, weight, age)  for several Dog and Cat objects 
 * and stores the objects in an array list. The program should display the attributes for each object in the 
 * list, and then calculate and display the average age of all pets in the list using a method as indicated below:
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * Unit11Lab3
*/ 
import java.util.Scanner;
import java.util.*;
public class Unit11Lab3
{
   public static void main(String[] args)
   {

		int number=0, petIndex=0, age=0;
		double weight=0;
		String name;


		Scanner input=new Scanner(System.in);

		//Prompt the user input a number of how many pets
 		System.out.print("How many pets do you want to input?");
		number=input.nextInt();


		ArrayList<Pet> petList= new ArrayList<Pet>();
		
		for(int i=0;i<number;i++){

 			System.out.printf("This is pet %d , what pet do you want to input?(cat=1, dog=2)", i+1);
			petIndex=input.nextInt();
 			System.out.print("Please input the name:");
			input.nextLine(); 
			name=input.nextLine(); 
	 		System.out.print("Please input the weight(in pounds):");	
			weight=input.nextDouble();	
	 		System.out.print("Please input the age(in years):");	
			age=input.nextInt();
			if(petIndex==1){
				petList.add(new Cat(name, weight, age));
			}else{
				petList.add(new Dog(name, weight, age));
			}

		}

		System.out.println("******************************************************************************");
		System.out.println("You have input " +number+ " pets. Here are the information:\n");

		//The following is to iterate through the array and display the pet attributes and the sound
		for(int i=0;i<number;i++){

			Pet pet= petList.get(i);
		
			if(pet instanceof Dog){
 				System.out.printf("This is pet %d. It is a dog.\n", i+1);
				System.out.print("The name is "+ pet.getName()+ ". The weight is "+ pet.getWeight()+ " pounds. The age is "+ pet.getAge()+" years old.");
				System.out.println(" It can make "+ ((Dog)pet).bark()+ " sound.");
			}else{
 				System.out.printf("This is pet %d. It is a cat.\n", i+1);
				System.out.print("The name is "+ pet.getName()+ ". The weight is "+ pet.getWeight()+ " pounds. The age is "+ pet.getAge()+" years old.");
				System.out.println(" It can make "+ ((Cat)pet).meow()+ " sound.");
			}
		}

		System.out.printf("The average age of all pets is %.1f  years old.\n", calculateAverage(petList));

  	 }


	//This method is to calculate the avrage of age given an ArrayList as an argument
	//and double as a return value
	public static double calculateAverage(ArrayList<Pet> list)
	{
		

		double sumAge=0;

		for(int i=0;i<list.size();i++){

			Pet pet= list.get(i);

			sumAge+=pet.getAge();

		}


		return sumAge/list.size();
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

