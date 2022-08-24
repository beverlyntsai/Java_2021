/**                                                
 * Write a program that prompts the user to enter four integer test scores for each of three students. For each of the students, 
 * calculate and display the minimum test score, the maximum test score, the average of the test scores, and a letter grade A, B, C, D, F. 
 * Use a method for determining each of the calculations. Letter grades are calculated as follows: A = 90-100, B = 80-89, C = 70-79, 
 * D = 65-69, F = 64 or less. For determining letter grades, averages should be rounded to the next highest integer value (e.g., 89.6 is 
 * rounded to 90 for assigning a letter grade), but the actual average calculation should be rounded to the tenths position.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   


import java.util.Scanner;
public class Unit5Lab3_2
{
	public static void main(String [] args)		
	{
		double score1=0,score2=0,score3=0, score4, min=0, max=0, average=0;
		char letterGrade='A';
		Scanner input=new Scanner(System.in);

		for(int i=0;i<3;i++){
		
			System.out.println("***************************\nThis is student "+ (i+1));
			System.out.print("Please enter score 1: ");
			score1=input.nextDouble();
			System.out.print("Please enter score 2: ");
			score2=input.nextDouble();
			System.out.print("Please enter score 3: ");
			score3=input.nextDouble();
			System.out.print("Please enter score 4: ");
			score4=input.nextDouble();

			max=maximum(score1,score2,score3,score4);
			System.out.println("The maximum score is "+max);
			min=minimum(score1,score2,score3,score4);
			System.out.println("The minimum score is "+min);

			average=averageScore(score1,score2,score3,score4);
			System.out.println("The average score is "+average);
			letterGrade=getLetterGrade(average);		
			System.out.println("The letter grade is "+letterGrade);

		}

	}//main

	//This methos is to get the average score and return in double type
	public static double averageScore(double a, double b, double c, double d)  
	{ 

		double ave=(a+b+c+d)/4;
		ave=Math.floor(ave*10+0.5)/10;
		return ave; 
	}

	//This method is to return the maximum score
	public static double maximum(double a, double b, double c, double d)  
	{ 
		return Math.max(a,Math.max(b, Math.max(c, d))); 
	}

	//This method is to return the minimum score
	public static double minimum(double a, double b, double c, double d)  
	{ 
		return Math.min(a,Math.min(b, Math.min(c, d))); 
	} 

	//This method is to return the letter grade based on the average score
	// However, the letter grade should be based on the score after rounding it.
	// 89.6 use 90 to get letter grade
	public static char getLetterGrade(double x)  
	{ 
		char letter='A';

		// Based on the instruction, the letter grade should be based on the score after rounding it.
		// 89.6 use 90 to get letter grade
		int score=(int)Math.round(x);

		if(score>=90){

			letter='A';

		}else if(score>=80){

			letter='B';

		}else if(score>=70){

			letter='C';
	
		}else if(score>=65){

			letter='D';

		}else{

			letter='F';
		}

		return letter;
		
	} 



}