/**                                                
 * Unit9Lab2.java
 * Design the Counter class that can be incremente by one, decremented by on, and reset to zero by pressing the appropriate button
 * Design a CounterConsoleMenu class that providesa console-based user interface for using Counter objects
 * Develop a program called CounterTest to test the functionality of the CounterConsoleMene and Counter classes working together.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 


import java.util.Scanner;
public class Unit9Lab2
{
	public static void main( String [] args )
	{

		System.out.println("********************************************\nThe cards are not shuffled!\n********************************************\n");
		Deck oneDeck= new Deck(1, false); //false means not shuffle
		oneDeck.printDeck(52);
		

		System.out.println("********************************************\nThe cards are shuffled!\n********************************************\n");
		oneDeck.shuffleCards(); /*new Deck(1,true); //One deck card with shuffle*/
		oneDeck.printDeck(52);


	
	}//main

}


class Deck
{

	private Card[] card;
	private int cardNumber=52; //The total number of cards. This assignment is one deck so it is 52 cards.

	//Constructor
	Deck(){
		this(1,false);
	}

	//Constructor
	public Deck(int deckNum, boolean shuffle){
		
		cardNumber=52;
		card= new Card[cardNumber];

		//initial card index
		int c=0;

		for(int i=0;i<4;i++){

			for(int j=1;j<=13;j++){

				//add a new card to the deck
				card[c]= new Card(Suit.values()[i],j);
				c++;
			}

		}


		if(shuffle){
			shuffleCards();
		}

	}




	public void shuffleCards(){

		Card temp;
		for(int i=0;i<cardNumber;i++){
			int index=(int)(Math.random()*cardNumber);
			
			//do swap
			temp=card[i];
			card[i]=card[index];
			card[index]=temp;
		}
		
	}



	//For debug purpose to print out all cards to see how it shuffles
	public void printDeck(int number){
		
		for(int i=0;i<number;i++){

			System.out.printf("% 3d/%d %s\n",i+1, cardNumber,card[i].getNumberString());
		}

	}


}


class Card
{
	
	private Suit suit;
	private int number;

	String numStr="";

	//Constructor
	Card(){
	
	}

	//Constructor
	public Card(Suit suit, int number){
		this.suit = suit;
		this.number= number;
	}

	public int getNumber(){
		return number ;
	}
	

	public String getNumberString(){
	
		switch(this.number){

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
				numStr="J";
				break;

			case 12:
				numStr="Q";

				break;
			case 13:
				numStr="K";
				break;

			case 1:
				numStr="A";
				break;

		}

		return numStr+"-"+suit.toString();


	}


}


enum Suit
{
	Clubs,
	Diamonds,
	Hearts,
	Sprades,


}

