/**                                                
 * Write a program that asks a user to guess a secret number between 1 and N, where N is a positive number that the user is prompted for. 
 * The program should also prompt the user for the maximum number of guesses they would like to make. Each time the player makes a guess, 
 * the program shall respond with “correct”, “too low”, or “too high”. The program should keep track of the number of guesses the user made 
 * to discover the secret number. The program should continue execution until the user has discovered the secret number or has exceeded the maximum number of guesses. The program shall also allow the user to play the game again until the user declines.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   

import java.util.Scanner;
public class Unit4Lab1
{
	public static void main(String [] args)		
	{
		int numberMax = 0, numberGuess = 0, randomNumber = 0;
		boolean isToPlay = true;


		//This loop is to control if the the person wants to play the guessing game
		while(isToPlay){
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter a positive number: ");
			numberMax = input.nextInt();
			System.out.print("Please the maximum number of guesses that you would like to make: ");
			numberGuess = input.nextInt();

			int guessedNum = 0;
			randomNumber = (int)(numberMax * Math.random()) + 1;

			//This loop is to control how many times the user guesses
			for (int i=0; i<numberGuess; i++){
				System.out.print("Guess a number between 1 and " + numberMax + ": ");
				guessedNum = input.nextInt();

				if (guessedNum > randomNumber){
					System.out.println("Your guess is too high.");	
				}else if (guessedNum < randomNumber){
					System.out.println("Your guess is too low.");	
				}else{
					System.out.println("You guessed the correct number.");	
					break;
				}
			}

			if (guessedNum != randomNumber){
				System.out.println("You have reached your maximum number of guesses. The correct number was " + randomNumber + ".");
			}

			int playAnswer = 0;
			System.out.print("Do you want to play again? (1 for yes and 2 for no): ");
			playAnswer = input.nextInt();
			
			//this is to determine if the While loop will continue or not
			if (playAnswer == 1){
				isToPlay = true;
			}else{
				isToPlay = false;
			}
		}//while
	}
}



