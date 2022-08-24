/**                                                
 * Unit10Lab2.java
 * Earlier assigknemtn we design the Counter class that can be incremente by one, decremented by on, and reset to zero by pressing the 
 * appropriate button. Design a CounterConsoleMenu class that providesa console-based user interface for using Counter objects
 * Develop a program called CounterTest to test the functionality of the CounterConsoleMene and Counter classes working together.
 * This assignment  wil have the current counter value that can be added teo the memory and the memory can be reset to zero.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * CounterTest to test the functionality of the CounterConsoleMene and Counter classes working together.
*/ 
import java.util.Scanner;
public class Unit10Lab2
{
   public static void main(String[] args)
   {
	boolean isContinue=true;
	MemeoryCounterConsoleMenu menu= new MemeoryCounterConsoleMenu();

	while(isContinue){

		menu.displayMenu();
		menu.getUerInput();
		menu.displayCurrentValue();
		if(menu.getIsContinue()==false){
			isContinue=false;
			
		}else{	

			menu.displayMenmoryMenu();
			menu.getUerSaveInput();
			menu.displayMenmoryValue();
		}



	}
	


   }
 
} // end class 



/**  
 *  CounterConsoleMenu class provides a console-based user interface
*/ 

class MemeoryCounterConsoleMenu
{
	private boolean isContinue=true;
	MenmoryCounter counter;
	private int choice=4;
	private int saveChoice=1;
	Scanner input;

	//default constructor
	public MemeoryCounterConsoleMenu(){

		counter=new MenmoryCounter();
		input=new Scanner(System.in);
		choice=1;
	}

	public void displayMenu(){

		System.out.println("\nHere are the menu of choices:");
		System.out.println("1. increment by one");
		System.out.println("2. decrement by one");
		System.out.println("3. reset to zero");
		System.out.println("4. quit");
		System.out.print("Please input your choice(1,2,3,4):");

	}

	public void getUerInput(){
	
			choice=input.nextInt();

			switch(choice){
			
			case 1:incrementOne();break;

			case 2:decrementOne();break;

			case 3:resetToZero();break;

			case 4:quit();break;

			default: break;
			}
	}


	public void displayCurrentValue(){


		if(isContinue){
			System.out.println("*************************************************************************************");
			System.out.println("The current counter value is "+getCounterValue()+" .Do you want to add to menmory?");
			System.out.println("*************************************************************************************");
		}else{
			System.out.println("*************************************************************************************");
			System.out.println("The current counter value is "+getCounterValue());
			System.out.println("The memroy counter value is "+getMenmoryCounterValue());
			System.out.println("*************************************************************************************");
			
		}

	}


	public void incrementOne(){
		counter.incremenOne();
	}

	public void decrementOne(){
		counter.decremenOne();
	}

	public void resetToZero(){
		counter.resetToZero();
	}

	public boolean getIsContinue(){
		return isContinue;
	}


	public void quit(){
		isContinue=false;
	}

	public int getCounterValue(){
		return counter.getCounterValue();
	}


	public int getMenmoryCounterValue(){
		return counter.getMenmoryCounterValue();
	}


	public void displayMenmoryMenu(){


		System.out.println("1. Add to memory");
		System.out.println("2. Not add to menroy");
		System.out.println("3. reset menmory to zero");
		System.out.print("Please input your choice(1,2,3):");
	}


	public void getUerSaveInput(){
	
			saveChoice=input.nextInt();

			switch(saveChoice){
			
				case 1:addToMenmory(getCounterValue());break;

				case 2:break;

				case 3:resetMenmory();break;

				default: break;
			}
	}



	public void displayMenmoryValue(){


		System.out.println("*************************************************************************************");
		System.out.println("The memory counter value is "+getMenmoryCounterValue());
		System.out.println("*************************************************************************************");


	}


	public void addToMenmory(int number){

		counter.addMenmoryCounterNum(number);
	}



	public void resetMenmory(){
		counter.resetMenmoryToZero();
	}




}




/**  
 *  Counter class can be incremente by one, decremented by on, and reset to zero by pressing the appropriate button
*/ 
class Counter
{
	private int counterNum=0;


	//default constructor
	public Counter(){
		counterNum=0;
	}


	public void incremenOne(){
		counterNum++;
	}

	public void decremenOne(){
		counterNum--;
	}

	public void resetToZero(){
		counterNum=0;
	}


	public int getCounterValue(){
		return counterNum;
	}



}


/**  
 *  MemoryCounter class is to add the value from counter
*/ 
class MenmoryCounter extends Counter
{
	private int menmoryCounterNum=0;


	//default constructor
	public MenmoryCounter(){
		menmoryCounterNum=0;
	}

	public void addMenmoryCounterNum(int number){
		menmoryCounterNum=number;
	}

	public void resetMenmoryToZero(){
		menmoryCounterNum=0;
	}


	public int getMenmoryCounterValue(){
		return menmoryCounterNum;
	}


}


