/**                                                
 * DateExercise.java
 * Design a Date class that models a date as having integer month, day, and year attributes. Include appropriate methods
 * to make the Date class functional and easy to reuse. Write a program call DateExercise that usese dialog boxes to prompt
 * the user for the month, day, and year attributes and displays the message The date is mm/dd/yyyy in a dialog box.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 

import javax.swing.*;
public class DateExercise 
{
   public static void main(String[] args)
   {

	//This dialog box is to prompt the user to input a month
	String month = JOptionPane.showInputDialog("Please input a month");

	//This dialog box is to prompt the user to input a day
	String day = JOptionPane.showInputDialog("Please input a day");

	//This dialog box is to prompt the user to input a year
	String year = JOptionPane.showInputDialog("Please input a year");

	//This is the instantiate Date object by using the input from user
	Date date=new Date(Integer.valueOf(year) , Integer.valueOf(month), Integer.valueOf(day));

	//This dialog box is to display what user input
	JOptionPane.showMessageDialog(null,"The date is "+ date.getMonth()+"/"+date.getDay()+"/"+date.getYear());

   }
 
} // end class 

/**  
 * Date class is to models a date as having integer month, day, and year attributes. 
 * It has an overloaded constructor that can set month, day, and year value.
 * It has methods of getDay, getMonth, getYear.
*/ 
class Date
{

	private int year;
	private int month;
	private int day;

	//default constructor
	public Date(){
		year=0;
		month=0;
		day=0;
	}

	//overloaded constructor
	public Date(int year, int month, int day){
		this.year=year;
		this.month=month;
		this.day=day;

	}

	//This method is to return year in a string type
	public int getYear(){

		return year;	
	}


	//This method is to return month in a string type	
	public int getMonth(){

		return month;	
	}

	//This method is to return day in a string type
	public int getDay(){

		return day;	
	}

}



