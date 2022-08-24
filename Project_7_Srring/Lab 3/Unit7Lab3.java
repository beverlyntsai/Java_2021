/**                                                
 * Write a program that prompts the user to enter three words and displays the words in alphabetical order. 
 * Note that you must implement a method named sortWords() that returns an array containing the words in 
 * alphabetical order. The method shall use the compareTo() String class method. For brevity, the program 
 * does not need to edit the user input. 
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   


import java.util.Scanner;
public class Unit7Lab3
{
	public static void main(String [] args)		
	{
		String string1="",string2="",string3="";
		// prompt user to enter 3 words
             	Scanner input=new Scanner(System.in);
                System.out.print("Please enter String 1: ");
		string1=input.next();
                System.out.print("Please enter String 2: ");
		string2=input.next();
                System.out.print("Please enter String 3: ");
		string3=input.next();
		// call method that returns words in alphabetical order
		String [] words = sortWords(string1, string2, string3);
                                 
		// display sorted words
		System.out.print("Alphabetical order of these 3 strings is "+words[0]+" "+words[1]+" "+words[2]);



	}

	//This method is to return an array of 3 strings based on alphabetical order	
	public static String[] sortWords(String a, String b, String c){

		String array[] = new String[3];
		int indexA=0,indexB=1,indexC=2;

		//First assume the alphabetical order of string a, b, c is same as a, b, c
		array[0]=a;
		array[1]=b;
		array[2]=c;

		//First, compare string a and b
		int compare = a.compareTo(b);  

		if (compare < 0) {  //a is smaller than b	

			if(a.compareTo(c)<0){ //a is smaller than c
				//a<b
				//a<c

				if(b.compareTo(c)<0){  //b is smaller than c

					indexA=0;
					indexB=1;
					indexC=2;

				}else{  //b is greater than c

					indexA=0;
					indexB=2;
					indexC=1;
				}

			}else{ //a is greater than c
				//a<b
				//a>c

					indexA=1;
					indexB=2;
					indexC=0;
			} 
			
		}else if (compare > 0) { //a is larger than b
			

			if(a.compareTo(c)<0){ //a is smaller than c
				
				//a>b
				//a<c

					indexA=1;
					indexB=0;
					indexC=2;

			}else{ //a is greater than c

				//a>b
				//a>c

				if(b.compareTo(c)<0){ //b is smaller than c

					indexA=2;
					indexB=0;
					indexC=1;

				}else{ //b is greater than c

					indexA=2;
					indexB=1;
					indexC=0;
				}
			} 

		}else {  //a is equal to b
   			
			if(a.compareTo(c)<0){ //a is smaller than c

					indexA=0;
					indexB=1;
					indexC=2;

			}else{  //a is greater than c

					indexA=1;
					indexB=2;
					indexC=0;
			} 
		}

		array[indexA]=a;
		array[indexB]=b;
		array[indexC]=c;


		return array;

	}



}


