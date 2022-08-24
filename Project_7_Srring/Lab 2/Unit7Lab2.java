/**                                                
 * Read the Number Systems tutorial on the course website and Appendix J, Number Systems, in the course textbook. 
 * If you don’t have access to Appendix J the tutorial will suffice. Then, write a set of methods that converts 
 * numbers between different number systems
 * Unit7Lab2 Class is to test the method in NumberSystem class
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   


import java.util.Scanner;
public class Unit7Lab2
{
	public static void main(String [] args)		
	{

		int value=0;
		String hexString="", binaryString="";

		//This is to test a binary string to decimal value
		value=NumberSystem.binaryToDecimal("1111");		
		System.out.println("The decimal value of 1111 is "+value);

		//This is to test a binary string to hex string
		hexString=NumberSystem.binaryToHex("1111");
		System.out.println("The hex value of 1111 is "+hexString);

		//This is to test a decimal value to a binary string
		binaryString=NumberSystem.decimalToBinary(64);
		System.out.println("The binary string of 64 is "+binaryString);

		//This is to test a decimal value to a hex string
		hexString=NumberSystem.decimalToHex(64);
		System.out.println("The hex string of 64 is "+hexString);
	}


}




class NumberSystem
{

	//This method is to take a binary string as argument and return a decimal value integer
	static int binaryToDecimal(String binaryString){


		int value = Integer.parseInt(binaryString, 2);// 2 means using binary way to parse the string and convert to a vlue

		return value;

	}


	//This method is to take a binary string as argument and return a hex string
	static String binaryToHex(String binaryString){

		int value=binaryToDecimal(binaryString); //By taking advatange of the available method binaryToDecimal in class NumberSystem
		String hexString=Integer.toHexString(value); //This Integer method can convert value to Hex String
		hexString="0x"+hexString.toUpperCase();

		return hexString;
	}


	//This method is to take a decimal value as argument and return a binary string
	static String decimalToBinary(int decimalNumber){

		String binaryString=Integer.toBinaryString(decimalNumber); //This Integer method can convert value to Binary String
		return binaryString;
	}

	//This method is to take a decimal value as argument and return a hex string
	static String decimalToHex(int decimalNumber){

		String hexString=Integer.toHexString(decimalNumber); //This Integer method can convert value to Hex String
		hexString="0x"+hexString.toUpperCase();

		return hexString;
	}


}