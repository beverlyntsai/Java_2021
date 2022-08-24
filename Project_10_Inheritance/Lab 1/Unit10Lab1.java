/**                                                
 * Unit10Lab1.java
 * Design a class named Person that has a Student subclass and an Employee subclass. Employee has a Faculty subclass and 
 * a Staff subclass. A person has a name, address, email address, phone number, and birth date. A student has a class 
 * status (freshman, sophomore, junior, senior). An employee has a salary, and a hire date. A faculty member has office 
 * hours and a rank (instructor, assistant professor, professor). A staff member has a job title. You may use String 
 * types for all but the salary and date attributes. Use a double for salary, and use a simple Date class for the date 
 * attributes. A date just needs to have integer month, day, and year attributes. Override the toString() method in each 
 *class to display the class name and the person’s name.Draw a UML class diagram that shows the class relationships.
 * Write a program that creates a Person, Student, Employee, Faculty, and Staff object, and invokes their toString() methods.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 


import java.util.Scanner;
import java.util.*; 
public class Unit10Lab1
{
	public static void main( String [] args )
	{
		//(1) Person object			
		Calendar calendar1= Calendar.getInstance();
		calendar1.set(Calendar.YEAR, 1988);
		calendar1.set(Calendar.MONTH, Calendar.JANUARY);
		calendar1.set(Calendar.DAY_OF_MONTH, 1);
		Date date1 = calendar1.getTime();	


		Person person= new Person("Jeanette", "101 Aim, NY", "123@hotmail.com","123-3456",date1);
		person.display();

		//(2) Student object
		Calendar calendar2= Calendar.getInstance();
		calendar2.set(Calendar.YEAR, 1989);
		calendar2.set(Calendar.MONTH, Calendar.FEBRUARY);
		calendar2.set(Calendar.DAY_OF_MONTH, 3);
		Date date2 = calendar2.getTime();

		Student student= new Student("Beverlyn", "11 Radio, Irvine", "456@hotmail.com","124-3456",date2, "freshman");
		student.display();


		//(3) Employee object
		Calendar calendar3= Calendar.getInstance();
		calendar3.set(Calendar.YEAR, 1980);
		calendar3.set(Calendar.MONTH, Calendar.NOVEMBER);
		calendar3.set(Calendar.DAY_OF_MONTH, 23);
		Date date3 = calendar3.getTime();

		Calendar calendar3_1= Calendar.getInstance();
		calendar3_1.set(Calendar.YEAR, 2005);
		calendar3_1.set(Calendar.MONTH, Calendar.OCTOBER);
		calendar3_1.set(Calendar.DAY_OF_MONTH, 13);
		Date date3_1 = calendar3_1.getTime();

		Employee employee= new Employee("Winsley", "12 Rake, Irvine", "789@hotmail.com","224-3456", date3, 40000, date3_1);
		employee.display();


		//(4) Faculty object
		Calendar calendar4= Calendar.getInstance();
		calendar4.set(Calendar.YEAR, 1990);
		calendar4.set(Calendar.MONTH, Calendar.NOVEMBER);
		calendar4.set(Calendar.DAY_OF_MONTH, 23);
		Date date4 = calendar4.getTime();

		Calendar calendar4_1= Calendar.getInstance();
		calendar4_1.set(Calendar.YEAR, 2002);
		calendar4_1.set(Calendar.MONTH, Calendar.DECEMBER);
		calendar4_1.set(Calendar.DAY_OF_MONTH, 12);
		Date date4_1 = calendar4_1.getTime();

		Faculty faculty= new Faculty("William", "3327 Marcel, San Jose", "789@gmail.com","543-3456", date4, 50000, date4_1, "8am-5pm", "professor");
		faculty.display();


		//(5) Staff object
		Calendar calendar5= Calendar.getInstance();
		calendar5.set(Calendar.YEAR, 1985);
		calendar5.set(Calendar.MONTH, Calendar.MARCH);
		calendar5.set(Calendar.DAY_OF_MONTH, 13);
		Date date5 = calendar5.getTime();

		Calendar calendar5_1= Calendar.getInstance();
		calendar5_1.set(Calendar.YEAR, 2012);
		calendar5_1.set(Calendar.MONTH, Calendar.DECEMBER);
		calendar5_1.set(Calendar.DAY_OF_MONTH, 11);
		Date date5_1 = calendar5_1.getTime();

		Staff staff= new Staff("Bob", "3327 Marcel, San Jose", "789@gmail.com","543-3456", date5, 50000, date5_1, "accountant");
		staff.display();
	}

}


class Person
{
	private String name;
	private String address;
	private String emailAddress;
	private String phoneNumber;
	private Date birthDate;


	//Constructor
	public Person(){

	}

	//Overloaded Constructor
	public Person(String name, String address, String emailAddress, String phoneNumber, Date birthDate){
		this.name=name;
		this.address=address;
		this.emailAddress=emailAddress;
		this.phoneNumber=phoneNumber;
		this.birthDate=birthDate;
	}

	//Override toString method
	public String toString(){

		String result;

		result="This class is "+getClass().getName()+" and the person's name is "+getPersonName();

		return result;
	}

	public String getPersonName(){

		return this.name;
	}

	public void display(){

		System.out.println(toString()+".");
	}

}




class Student extends Person
{
	
	private String classStatus;

	//Constructor
	public Student(){

	}

	//Overloaded Constructor
	public Student(String name, String address, String emailAddress, String phoneNumber, Date birthDate,String classStatus){
		super(name, address, emailAddress, phoneNumber,birthDate);
		this.classStatus= classStatus;
	}
	
	//Override toString method
	public String toString(){

		String result;

		result="This class is "+getClass().getName()+" and the student's name is "+getPersonName();

		return result;
		
	}



}



class Employee extends Person
{
	
	private double salary;
	private Date hiringDate;


	//Constructor
	public Employee(){

	}

	//Overloaded Constructor
	public Employee(String name, String address, String emailAddress, String phoneNumber, Date birthDate, double salary, Date hiringDate){
		super(name, address, emailAddress, phoneNumber,birthDate);
		this.salary= salary;
		this.hiringDate= hiringDate;
	}

	
	//Override toString method
	public String toString(){

		String result;

		result="This class is "+getClass().getName()+" and the employee's name is "+getPersonName();

		return result;
		
	}



}



class Faculty extends Employee
{
	private String officeHours;
	private String rank;



	//Constructor
	public Faculty (){

	}

	//Overloaded Constructor
	public Faculty (String name, String address, String emailAddress, String phoneNumber, Date birthDate, double salary, Date hiringDate, String officeHours, String rank){
		super(name, address, emailAddress, phoneNumber,birthDate, salary, hiringDate);
		this.officeHours= officeHours;
		this.rank= rank;
	}


	
	//Override toString method
	public String toString(){

		String result;

		result="This class is "+getClass().getName()+" and the faculty's name is "+getPersonName();

		return result;
		
	}


}




class Staff extends Employee
{
	private String jobTitle;



	//Constructor
	public Staff(){

	}

	//Overloaded Constructor
	public Staff(String name, String address, String emailAddress, String phoneNumber, Date birthDate, double salary, Date hiringDate, String jobTitle){
		super(name, address, emailAddress, phoneNumber,birthDate, salary, hiringDate);
		this.jobTitle= jobTitle;
	}


	
	//Override toString method
	public String toString(){

		String result;

		result="This class is "+getClass().getName()+" and the staff's name is "+getPersonName();

		return result;
		
	}



}

