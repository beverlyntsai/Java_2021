/**                                                
 * Unit11Lab.java
 * Model a Car as having three attributes: a make (e.g., Mercedes Benz), a model (e.g., 300C), and a year (e.g., 2019). 
 * Prompt the user to enter data for at least five Car objects and store them in an ArrayList. The program should then 
 * iterate over the list and sort any cars with vehicle years earlier than 2010 into an old cars ArrayList and those with 
 * vehicle years of 2010 and later into a new cars ArrayList. The program should then display all three lists.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * Unit10Lab4
*/ 
import java.util.Scanner;
import java.util.*;
public class Unit11Lab1
{
   public static void main(String[] args)
   {

		int number=0, oldCarNumber=0, newCarNumber=0, year=0;
		String make="", model="";


		Scanner input=new Scanner(System.in);

		//Prompt the user input how many pets
 		System.out.print("How many cars do you want to input?(At least 5)");
		number=input.nextInt();

		//Based on how many cars user input
		ArrayList<Car> carList= new ArrayList<Car>();
		ArrayList<Car> oldCarList= new ArrayList<Car>();
		ArrayList<Car> newCarList= new ArrayList<Car>();
		
		//Prompt the user to enter data for at least five Car objects and store them in an ArrayList

		for(int i=0;i<number;i++){

 			System.out.printf("This is car %d , what make (e.g., Mercedes Benz) is this car?", i+1);
			input.nextLine(); // Force the curser to move to end of line
			make=input.nextLine();
			
 			System.out.print("What model (e.g., 300C) is this car?");
			model=input.nextLine();
	 		System.out.print("What year (e.g., 2019) is this car?");
			year=input.nextInt();	
			Car car=new Car(make, model, year);
			carList.add(car);

			//sort any cars with vehicle years earlier than 2010 into an old cars ArrayList and those with 
			//vehicle years of 2010 and later into a new cars ArrayList.
			if(year<2010){
				oldCarList.add(car);
				oldCarNumber++;
			}else{
				newCarList.add(car);
				newCarNumber++;
			}

		}


		System.out.println("******************************************************************************");
		System.out.println("You have input " +number+ " cars. Here are the information before sort:\n");

		int i=0;
		//The following is to iterate through the array and display the car information
		for(i=0;i<number;i++){
			
			Car car= carList.get(i);
 			System.out.printf("This is car %d. \n", i+1);
			System.out.println("The make is "+ car.getMake()+ ". The model is "+ car.getModel()+ ". The year is "+ car.getYear()+".");

		}

		System.out.println("******************************************************************************");
		if(!oldCarList.isEmpty()){			

			//The following is to display cars with vehicle years earlier than 2010
			System.out.println("There are "+ oldCarNumber+" cars with vehicle years earlier than 2010. The following are the details.");
			for(i=0;i<oldCarNumber;i++){
		
				Car oldCar= oldCarList.get(i);
 				System.out.printf("This is old car %d. \n", i+1);
				System.out.println("The make is "+ oldCar.getMake()+ ". The model is "+ oldCar.getModel()+ ". The year is "+ oldCar.getYear()+".");

			}

		}else{
			
			System.out.println("There are no cars with vehicle years earlier than 2010.");
		}

		System.out.println("******************************************************************************");
		if(!newCarList.isEmpty()){			

			//The following is to display cars with vehicle years of 2010 and later
			System.out.println("There are "+ newCarNumber+" cars with vehicle years of 2010 and later. The following are the details.");
			for(i=0;i<newCarNumber;i++){

				Car newCar= newCarList.get(i);
 				System.out.printf("This is new car %d. \n", i+1);
				System.out.println("The make is "+ newCar.getMake()+ ". The model is "+ newCar.getModel()+ ". The year is "+ newCar.getYear()+".");

			}

		}else{
			System.out.println("There are no cars with vehicle years of 2010 and later.");
		}


   }
 
} 




/**  
 *  Car Class
*/ 
class Car
{
	//It has 3 atrributes: make, model, year
	private String make="";
	private String model="";
	private int year=0;

	public Car(){

	}

	//overloaded Constructor that has 3 arguments: make, model, year
	public Car(String make,String model,int year){
		this.make=make;
		this.model=model;
		this.year=year;

	}

	//This method is to return make with String type
	public String getMake(){

		return make;
	}

	//This method is to return model with String type
	public String getModel(){

		return model;
	}


	//This method is to return year with integer type
	public int getYear(){

		return year;
	}


}

