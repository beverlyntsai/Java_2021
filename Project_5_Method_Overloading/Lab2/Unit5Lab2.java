/**                                                
 * Write a program that prompts the user to enter a month (1-12) and a year (e.g., 2012), and then displays a 
 * calendar for that month and year as illustrated below:
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   


import java.util.Scanner;
public class Unit5Lab2
{
	public static void main(String [] args)		
	{
		int month=1, year=2000;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter the month:(1-12)");
		month=input.nextInt();
		System.out.print("Enter the year:(e.g. 2012)");
		year=input.nextInt();
		
		printMonthCalendar(month,year); 

	}

	//This method will print month header and month body 
	public static void printMonthCalendar(int m, int y)  
	{ 
		printMonthHeader(m, y);
		printMonthBody(m,y);
	}


	//This method will print month header
	//         January 2012
	// --------------------------------------
	// Sun Mon Tue Wed Thu Fri Sat
	public static void printMonthHeader(int m, int y)  
	{ 
		String monthName="";

		monthName=getMonthName(m);


		System.out.printf("\n%16s %6d\n", monthName, y);
		System.out.println("----------------------------------------------");
		System.out.printf("%4s %4s %4s %4s %4s %4s %4s","Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");
		System.out.println("");
	
	}


	//This method will print out month body
	// 1 2 3 ..... to last day depends on the month
	public static void printMonthBody(int m, int y)  
	{ 
		int startDay=1;
		int lastDaysOfMonth=31;

		lastDaysOfMonth=getNumDaysInMonth(m,y); //Know how many days of that month

		//This will return the first day of that month
		//1: Sun, 2: Mon, 3: Tue, .... 6:Sat
		startDay= getStartDay(m, 1, y );		


		switch(startDay){
		 case 1: System.out.printf("%9d %4d %4d %4d %4d %4d",1, 2, 3, 4, 5, 6); break;
		 case 2: System.out.printf("%14d %4d %4d %4d %4d",1, 2, 3, 4, 5); break;
		 case 3: System.out.printf("%19d %4d %4d %4d",1, 2, 3, 4); break;
		 case 4: System.out.printf("%24d %4d %4d",1, 2, 3); break;
		 case 5: System.out.printf("%29d %4d",1, 2); break;
		 case 6: System.out.printf("%34d",1); break;
		 case 7: System.out.printf("%4d %4d %4d %4d %4d %4d %4d",1, 2, 3, 4, 5, 6, 7);break;
		 default: break;
		}

		System.out.println("");

		//Calculate the first date of second row
		int firstDateRow2=8-startDay;
		if(firstDateRow2==1)  firstDateRow2=8;

		int rows=(lastDaysOfMonth-firstDateRow2)/7; //How many rows filled with 7 days

		int firstDateRowLast=firstDateRow2+7*rows;

		int daysOfLastRow=(lastDaysOfMonth-firstDateRow2)%7+1; //How many days of the last row


		for(int i=0;i<rows;i++){
			int baseDay=i*7;
			System.out.printf("%4d %4d %4d %4d %4d %4d %4d", baseDay+firstDateRow2,baseDay+firstDateRow2+1 , baseDay+firstDateRow2+2, baseDay+firstDateRow2+3, baseDay+firstDateRow2+4, baseDay+firstDateRow2+5, baseDay+firstDateRow2+6);
			System.out.println("");
		}
		

		switch(daysOfLastRow){
		case 1: System.out.printf("%4d",firstDateRowLast); break;
		case 2: System.out.printf("%4d %4d",firstDateRowLast, firstDateRowLast+1); break;
		case 3: System.out.printf("%4d %4d %4d",firstDateRowLast, firstDateRowLast+1, firstDateRowLast+2); break;
		case 4: System.out.printf("%4d %4d %4d %4d",firstDateRowLast, firstDateRowLast+1, firstDateRowLast+2, firstDateRowLast+3); break;
		case 5: System.out.printf("%4d %4d %4d %4d %4d",firstDateRowLast, firstDateRowLast+1, firstDateRowLast+2, firstDateRowLast+3, firstDateRowLast+4); break;
		case 6: System.out.printf("%4d %4d %4d %4d %4d %4d",firstDateRowLast, firstDateRowLast+1, firstDateRowLast+2, firstDateRowLast+3, firstDateRowLast+4, firstDateRowLast+5); break;
		case 7: System.out.printf("%4d %4d %4d %4d %4d %4d %4d",firstDateRowLast, firstDateRowLast+1, firstDateRowLast+2, firstDateRowLast+3, firstDateRowLast+4, firstDateRowLast+5, firstDateRowLast+6); break;
		default: break;
		}

		System.out.println("");


		//System.out.println("\nstartDay is "+startDay);

	}


	//This method will return Month name in String type
	public static String getMonthName(int m)  
	{ 
		String name="";

		switch(m){
		 case 1: name="January"; break;
		 case 2: name="February"; break;
		 case 3: name="March"; break;
		 case 4: name="April"; break;
		 case 5: name="May"; break;
		 case 6: name="June"; break;
		 case 7: name="July"; break;
		 case 8: name="Auguts"; break;
		 case 9: name="September"; break;
		 case 10: name="October"; break;
		 case 11: name="November"; break;
		 case 12: name="December"; break;
		 default: break;
		}


		return name;
	}

	// This method can return the first day of month if input "int d" as 1
  	public static int getStartDay( int m, int d, int y )
  	{
   		 // Adjust month number & year to fit Zeller's numbering system
   		 if ( m < 3 ) 
    		{
    	 	 m = m + 12;
    	 	 y = y - 1;
  	 	 }
    
   	 	int k = y % 100;      // Calculate year within century
   	 	int j = y / 100;      // Calculate century term
   		 int h = 0;            // Day number of first day in month 'm'
    
   		 h = ( d + ( 13 * ( m + 1 ) / 5 ) + k + ( k / 4 ) + ( j / 4 ) + ( 5 * j ) ) % 7;
    
   	 	// Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
   		 int dayNum = ( ( h + 5 ) % 7 ) + 1;     
    
   		 return dayNum;
	  }

	
	//This method is to get how many days of that month
	public static int getNumDaysInMonth(int m, int y)
	{ 
		int day=0;

		if(m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12){
			day=31;
		}

		if(m==4 || m==6 || m==9 || m==11){
			day=30;
		}

		if(m==2){
			if(isLeapYear(y)){

				day=29;

			}else{
				day=28;
			}
		}

		return day;
	}

	//This method is to check if this year a leap year
	public static boolean isLeapYear(int y)
	{ 

		if(y%4==0)
			return true;

		return false;
	}


}