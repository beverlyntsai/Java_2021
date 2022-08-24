/**                                                
 * Unit10Lab4.java
 * This lab involves writing a program that will model two types of pets: cats and dogs. Pets have a name, a weight (in pounds), 
 * and an age (in years). Pets can also make a sound...cats make a "meow" sound and dogs make a "bow wow" sound. The program 
 * should prompt the user to enter information for several different types of pets. It should create the appropriate class instances 
 * for each type of pet and store the objects in a single array. The program should then iterate through the array and display the 
 * pet attributes and the sound that each pet makes. The program should not check for the type of object in the array.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * Unit10Lab4
*/ 
import java.util.Scanner;
public class Unit10Lab4
{
   public static void main(String[] args)
   {

		int number=0, petIndex=0, weight=0, age=0;
		String name;


		Scanner input=new Scanner(System.in);

		//Prompt the user input how many pets
 		System.out.print("How many pets do you want to input?");
		number=input.nextInt();

		//Based on how many pets user input, 
		Pet[] petList=new Pet[number];
		
		for(int i=0;i<number;i++){

 			System.out.printf("This is pet %d , what pet do you want to input?(cat=1, dog=2)", i+1);
			petIndex=input.nextInt();
 			System.out.print("Please input the name:");			
			name=input.nextLine(); 
	 		System.out.print("Please input the weight(in pounds):");	
			weight=input.nextInt();	
	 		System.out.print("Please input the age(in years):");	
			input.nextLine(); 
			age=input.nextInt();
			if(petIndex==1){
				petList[i]=new Cat(name, weight, age);
				
			}else{
				petList[i]=new Dog(name, weight, age);
			}

		}

		System.out.println("******************************************************************************");
		System.out.println("You have input " +number+ " pets. Here are the information:\n");

		//The following is to iterate through the array and display the pet attributes and the sound
		for(int i=0;i<number;i++){
		
			if(petList[i] instanceof Dog){
 				System.out.printf("This is pet %d. It is a dog.\n", i+1);
				System.out.print("The name is "+ petList[i].getName()+ ". The weight is "+ petList[i].getWeight()+ ". The age is "+ petList[i].getAge());
				System.out.println(". It can make "+ ((Dog)petList[i]).bark()+ " sound.");
			}else{
 				System.out.printf("This is pet %d. It is a cat.\n", i+1);
				System.out.print("The name is "+ petList[i].getName()+ ". The weight is "+ petList[i].getWeight()+ ". The age is "+ petList[i].getAge());
				System.out.println(". It can make "+ ((Cat)petList[i]).meow()+ " sound.");
			}
		}


	


   }
 
} 


/**  
 *  Dog Class
*/ 

class Dog extends Pet
{

	//This constructor inherited Pet's constructor
	public Dog(String name, int weight, int age){
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
	public Cat(String name, int weight, int age){
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
	//It has 3 atrributes: name, weight, age
	private String name="";
	private int weight=0;
	private int age=0;

	public Pet(){

	}

	public Pet(String name, int weight, int age){
		this.name=name;
		this.weight=weight;
		this.age=age;

	}

	public String getName(){

		return name;
	}


	public int getWeight(){

		return weight;
	}



	public int getAge(){

		return age;
	}


}

