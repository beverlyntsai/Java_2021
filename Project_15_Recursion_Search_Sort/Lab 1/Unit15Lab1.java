/**                                                
 * Unit15Lab1.java
 * (Palindromes) A palindrome is a string that is spelled the same way forward and backward.
 * Some examples of palindromes are "radar," 'able was i ere i saw elba' and (if spaces are ignored) 'a
 * man a plan a canal panama.' Write a recursive method testPalindrome that returns boolean value
 * true if the string stored in the array is a palindrome and false otherwise. Themethod should ignore
 * spaces and punctuation in the string.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * Unit15Lab1
*/ 
import java.util.Scanner;
import java.util.*;
public class Unit15Lab1
{
  	 public static void main(String[] args)
   	{

		String wordOriginal="",word="";
		boolean result=true;

		Scanner input=new Scanner(System.in);

		//Prompt the user input a word or senence
 		System.out.print("Please input a word?");
		wordOriginal=input.nextLine();
		word = wordOriginal.replaceAll("\\s+","");
		
		result=testPalindrome(word);

		if(result==true){
			System.out.println("The word "+wordOriginal+" you input is a Palindrome.");
		}else{
			System.out.println("The word "+wordOriginal+" you input is NOT a Palindrome.");
		}

   	}

	//This is recursive method
	public static boolean testPalindrome(String word)
	{

		if(word==null) return false;

		//This is another base case that has one character
		if(word.length()<=1){
			return true;

		}

		//get first char
		String firstChar=word.substring(0,1);

		//get last char
		String lastChar=word.substring(word.length()-1,word.length());

		if(!firstChar.equals(lastChar)){
			return false;
		}else{
			//If first char= last char, then repeat another testPalindrome 
			//until it has one char
			return testPalindrome(word.substring(1,word.length()-1));

		}

	}

	
	
} 



