import java.util.Scanner;


/**                                                
 * This class Unit2Lab1 is to implement Unit2 Lab1 assignment
 * Write a Java program that displays all the uppercase and lowercase alphabetic charcters,
 * the digit 0-9, and the symbols +,-,_,=,&,@,#,$,?,>,<,|,!,~                       
 * @author Beverlyn Tsai               
 */   

public class Unit2Lab1
{
  public static void main( String [] args )
  {
	/**
	* Uppercase Alphabetic characters
	*/
	int i;
	for(i=0; i<26; i++){
		System.out.printf( "The character %c has the value %d\n", 'A'+i, ((int)'A')+i);
	} 

	/**
	*Lowercase Alphabetic characters
	*/
	for(i=0; i<26; i++){
		System.out.printf( "The character %c has the value %d\n", 'a'+i, ((int)'a')+i);
	} 

	/**
	* number 0-9
	*/
	for(i=0; i<10; i++){
		System.out.printf( "The character %c has the value %d\n", '0'+i, ((int)'0')+i);
	} 

	System.out.printf( "The character %c has the value %d\n", '+', ((int)'+'));
	System.out.printf( "The character %c has the value %d\n", '-', ((int)'-'));
	System.out.printf( "The character %c has the value %d\n", '_', ((int)'_'));
	System.out.printf( "The character %c has the value %d\n", '=', ((int)'='));
	System.out.printf( "The character %c has the value %d\n", '&', ((int)'&'));
	System.out.printf( "The character %c has the value %d\n", '@', ((int)'@'));
	System.out.printf( "The character %c has the value %d\n", '#', ((int)'#'));
	System.out.printf( "The character %c has the value %d\n", '$', ((int)'$'));
	System.out.printf( "The character %c has the value %d\n", '?', ((int)'?'));
	System.out.printf( "The character %c has the value %d\n", '>', ((int)'>'));
	System.out.printf( "The character %c has the value %d\n", '<', ((int)'<'));
	System.out.printf( "The character %c has the value %d\n", '|', ((int)'|'));
	System.out.printf( "The character %c has the value %d\n", '!', ((int)'!'));
	System.out.printf( "The character %c has the value %d\n", '~', ((int)'~'));



  }
}