/**                                                
 * CounterTest.java
 * Design the Counter class that can be incremente by one, decremented by on, and reset to zero by pressing the appropriate button
 * Design a CounterConsoleMenu class that providesa console-based user interface for using Counter objects
 * Develop a program called CounterTest to test the functionality of the CounterConsoleMene and Counter classes working together.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * CounterTest to test the functionality of the CounterConsoleMene and Counter classes working together.
*/ 
import java.util.Scanner;
public class CounterTest
{
   public static void main(String[] args)
   {
	boolean isContinue=true;
	CounterConsoleMenu menu= new CounterConsoleMenu();

	while(isContinue){

		menu.DisplayMenu();
		menu.getUerInput();
		menu.displayCurrentValue();

		if(menu.getIsContinue()==false){
			isContinue=false;
		}


	}
	


   }
 
} // end class 



/**  
 *  CounterConsoleMenu class provides a console-based user interface
*/ 

class CounterConsoleMenu
{
	private boolean isContinue=true;
	Counter counter;
	private int choice=4;
	Scanner input;

	//default constructor
	public CounterConsoleMenu(){

		counter=new Counter();
		input=new Scanner(System.in);
		choice=1;
	}

	public void DisplayMenu(){

		System.out.println("Here are the menu of choices:");
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

			System.out.println("The current counter value is "+getCounterValue());
			System.out.println("*******************************************************");
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

