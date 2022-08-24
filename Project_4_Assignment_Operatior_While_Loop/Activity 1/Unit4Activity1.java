/**                                                
 * The program generates random numbers in a specified range and prompts the user to enter the product of those numbers. 
 * Modify the program so that it also performs the following:
 * It should prompt the user to enter how many multiplication problems to generate
 * If the user enters a wrong answer, the program shall display what the correct answer is
 * It should display the user’s score as a percentage of problems the user answered correctly
 * It should display the total amount of time, in seconds, that the user took to complete the quiz.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   

import java.util.Scanner;
public class Unit4Activity1
{
	public static void main(String [] args)		
	{
		//Declare variables
		int numProblem = 0;
		int correctAnswer = 0;
		long startTime = 0;
		long endTime = 0;

		//Ask user to enter the number of problems they want to solve
		System.out.print("How many multiplication problems do you want to solve? ");
		Scanner input=new Scanner(System.in);
		numProblem=input.nextInt();

		startTime = System.currentTimeMillis();
	
		for (int i=0; i<numProblem; i++){

			//Generate 2 random numbers that will be multiplied
			int number1=(int)(Math.random()*10);
			int number2=(int)(Math.random()*10);

			//Prompt user to input answer
			System.out.print("What is "+number1+" * "+number2+"? ");
			//Scanner input=new Scanner(System.in);
			int answer=input.nextInt();

			//Grade the answer
			if((number1*number2) == answer){
				System.out.println("Congratulations...you are correct!");
				correctAnswer++;
			}else{
				System.out.println("Incorrect. The correct answer should be " + number1*number2 + ".");
			}
		}

		System.out.println("You got a " + (correctAnswer * 100 / numProblem) + "% on this multiplication quiz.");
		endTime = System.currentTimeMillis();
		System.out.println("You spend " + ((endTime - startTime) / 1000) + " seconds on the multiplication quiz.");
	}
}