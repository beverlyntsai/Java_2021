/**                                                
 * Write a program that reads a string entered at the command line and counts the number of characters or words. A blank space should 
 * be used to delimit a word. Name the program StringCount and design it to be invoked using syntax as follows: 
 * StringCount –[c][w] user_string 
 * As an example,  StringCount –cw "hello world" indicates that a character count and word count should be done on the string "hello world", 
 * and StringCount -w "hello world" indicates that a word count should be done on the string "hello world". Separate methods must be used to 
 * perform the counts. Note that if the string contains blanks, as in the above example, then the string must be quoted and the quotes will 
 * not be part of the count. 
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   


import java.util.Scanner;
public class StringCount
{
	public static void main(String [] args)		
	{
		int number=0;
		int charCount=0, wordCount=0, caseCode=0;
		String inputLine="", concatString="";
		String syntax="";

		if(args.length==0){
			System.out.print("You do not input argument. Please input by this format: java StringCount "+"-"+"cw user_string");
			System.out.print(" (i.e.: java StringCount "+"-"+"cw \"hello world\")");
			return;
		}


		//This is to get the return code of user input
		caseCode=getSyntaxCode(args[0]); //-c, -w, -cw



		//Check if user follows the syntax rule. If not, it will prompt the user to input until it follows the syntax rule.
		if(caseCode==0){//if caseCode=0, means something wrong with input
 			System.out.print("Wrong syntax!");
 			System.out.print("Please input a String by this format in command line: java StringCount "+"-"+"cw user_string");
 			System.out.print(" (i.e.: java StringCount "+"-"+"cw \"hello world\")");
			return;
		}



		//"hello world"
		//The following is to get the exact string that user input after syntax
		inputLine=args[1];;
		System.out.println("The string you input = "+  inputLine);
	
		
		//There are two cases: User can input one word without quotation or input more than one word with quotation
		//(1) more than one word: StringCount –cw "hello world" 
		//(2) only one word: StringCount –cw world 

		//If index=0 is a ", that means there is quotation wrapping the word
		if(inputLine.indexOf("\"")==0 || inputLine.substring(inputLine.length()-1,inputLine.length()).contentEquals("\"")){

			//"hello world" 
			if(inputLine.indexOf("\"")==0 && inputLine.substring(inputLine.length()-1,inputLine.length()).contentEquals("\"")){
				
				//hello world
				inputLine=inputLine.substring(1,inputLine.length()-1);
				wordCount=wordCount(inputLine);
				concatString=wordConcat(inputLine);
				charCount=characterCount(concatString);
			}else{
				System.out.println("You might miss one quotation.");
				inputLine=inputLine.substring(0,inputLine.length());
				wordCount=wordCount(inputLine);
				concatString=wordConcat(inputLine);
				charCount=characterCount(concatString);
			}


		}else{ //If index=0 is NOT a quotation, means there is no quotation
			
			inputLine=inputLine.substring(0,inputLine.length());
			wordCount=wordCount(inputLine);
			concatString=wordConcat(inputLine);
			charCount=characterCount(concatString);

		}


		if(caseCode==3){ //-cw

			System.out.println("Word count = "+wordCount);
			System.out.println("Character count = "+charCount);

		}else if(caseCode==1){ //-c

				System.out.println("Character count = "+charCount);

		}else if(caseCode==2) {//-w


				System.out.println("Word count = "+wordCount);

		}else{
			System.out.println("syntax error!");
		}


	}

	
	//This method is take in a string argument and return a integer value to inform different syntax input
	// return 0: Means wrong syntax
	// return 1: Means user input "-c"
	// return 2: Means user input "-w" 
	// return 3: Means user input "-cw"
	public static int getSyntaxCode(String inputLine){

		int index=inputLine.indexOf("-");

		if(index==0){

			if(inputLine.length()==2){ //"-c" or "-w"

				if(inputLine.contentEquals("-c")){
						return 1;

				}else if(inputLine.contentEquals("-w")){
						return 2;

				}else{
						return 0; //wrong
				}
				

			}else if(inputLine.length()==3){//"-cw" 

				if(inputLine.contentEquals("-cw")){
					return 3;

				}else{
					return 0; //wrong
				}

			}else{
				return 0; //wrong

			}



		}else{
			return 0; //wrong. No "-" is located
		}


	}


	//This method is to take a string argument and return the total character count
	//This method is used after getting rid of space
	public static int characterCount(String str){

		return str.length();

	}

	//If the user input more than one word, this method can return how many words
	public static int wordCount(String inputLine){

		int index=0;
		int wordCount=0;
		String concatString="";

		//This method is to split the input string into several substrings and store each substring in an array
		//This split method is better than indexOf(" ")>0 because it can take into account one more than space input by user
		//If the string is empty, it does not increase count number
		String array[]= inputLine.split(" ");
		for (String substring: array){
			if(!substring.isEmpty()){
				wordCount++;
			}

		
		}
	   

		return wordCount;
	}

	//This method can remove all white space and concat all words into one long string
	public static String wordConcat(String inputLine){

		int index=0;
		int wordCount=0;
		String concatString="";

		//This method can replace all white space with ""
		concatString = inputLine.replaceAll("\\s+","");
		
		return concatString;

	}


}