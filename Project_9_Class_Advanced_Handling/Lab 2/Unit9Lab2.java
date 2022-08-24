/**                                                
 * Unit9Lab2.java
 * A deck of playing cards contains 52 cards, made up of 13 cards from 4 suits (clubs, diamonds, hearts, and spades). 
 * Each card has a suit and a face value (1, 2, … , 9, Jack, Queen, King). When a deck is created, it is unshuffled 
 * (i.e., it will contain 13 cards of the clubs suit, in order 1, 2, … , King, followed by 13 cards of the diamonds 
 * suit, etc.) Write a program that creates a deck of cards, displays the unshuffled deck, then shuffles and displays 
 * the shuffled deck. Be sure to use good object-oriented principles.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 


import java.util.Scanner;
public class Unit9Lab2
{
	public static void main( String [] args )
	{

		System.out.println("*******************************************************************\nThe following display is the case that the cards are not shuffled!\n*******************************************************************\n");
		Deck oneDeck= new Deck(false); //false means are not shuffled
		oneDeck.printDeck();
		

		System.out.println("\n**************************************************************\nThe following display is the case after cards are shuffled!\n**************************************************************\n");
		oneDeck.shuffleCards(); 
		oneDeck.printDeck();


	
	}

}


class Deck
{

	private Card[] card;
	private String[] suit={"Clubs", "Diamonds", "Hearts", "Sprades"};
	private final int CARD_NUMBER=52; //The total number of cards. This assignment is one deck so it is 52 cards.


	//Constructor
	Deck(){
		this(false);
	}

	//Constructor
	public Deck(boolean isShuffle){
		
		card= new Card[CARD_NUMBER];

		//initial card index
		int c=0;

		for(int i=0;i<4;i++){ //4 suits

			for(int j=1;j<=13;j++){  //13 numbers
				//add a new card to the deck
				card[c]= new Card(suit[i],j);// first argument means suit, the second argument means number
				c++;
			}

		}


		if(isShuffle){
			shuffleCards();
		}

	}



	//Use Math.random() as an index to shuffle the cards
	public void shuffleCards(){

		Card temp;
		for(int i=0;i<CARD_NUMBER;i++){
			int index=(int)(Math.random()*CARD_NUMBER);
			
			//do swap
			temp=card[i];
			card[i]=card[index];
			card[index]=temp;
		}
		
	}



	//Print out all cards to see how it shuffles
	public void printDeck(){
		
		for(int i=0;i<CARD_NUMBER;i++){

			System.out.printf("% 3d %s\n",i+1, card[i].getNumberString());
		}

	}


}


class Card
{
	
	private String suitString;
	private int number;
	String numStr="";

	//Constructor
	Card(){
	
	}

	//overloaded Constructor
	public Card(String suit, int number){
		this.suitString= suit;
		this.number= number;
	}
	

	public String getNumberString(){
	
		switch(this.number){

			case 1:
				numStr="1";
				break;

			case 2:
				numStr="2";
				break;
			case 3:
				numStr="3";
				break;

			case 4:
				numStr="4";
				break;

			case 5:
				numStr="5";
				break;

			case 6:
				numStr="6";
				break;

			case 7:
				numStr="7";
				break;

			case 8:
				numStr="8";
				break;

			case 9:
				numStr="9";
				break;

			case 10:
				numStr="10";
				break;

			case 11:
				numStr="Jack";
				break;

			case 12:
				numStr="Queen";

				break;
			case 13:
				numStr="King";
				break;


		}

		return numStr+"-"+suitString;


	}


}
