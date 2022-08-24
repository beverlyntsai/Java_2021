/**                                                
 * Create a Rectangle class that models a Rectangle. It should have integer length and width attributes. 
 * The Rectangle class should also be able to draw a rectangle on the standard output device, using a 
 * single character that is specified by the user, and should compute the area and perimeter of rectangles. 
 * Valid values for length and width are integers in the range 1-30. Include appropriate get and set methods, 
 *　and other methods that may be required to adequately model rectangles. Create a program called TestRectangle 
 * that tests the methods in the Rectangle class.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 
  
import java.util.Scanner;
public class TestRectangle
{
	public static void main(String [] args)		
	{
		int length=0, width=0;
		String charInput="";
		boolean isContinue=true;
	
		Scanner input=new Scanner(System.in);

		//while loop is to ensure that the user enter the value between 1-30
		while(isContinue){
			System.out.print("Please enter length (1-30): ");
			length=input.nextInt();
			System.out.print("Please enter width (1-30): ");
			width=input.nextInt();
			if(length<1 || length>30 || width <1 || width>30){
				System.out.println("Please make sure length or width you input is the value between 1-30.");
				isContinue=true;
			}else{
				isContinue=false;
			}
		}

		System.out.print("Please enter a character to draw this rectangle shape:");
		input.nextLine();//move curser to next line
		charInput=input.nextLine(); 

		//This is to create rectangle object to calculate and display peremeter, area.
		//Finally, it will draw the shape
		rectangle rec=new rectangle(width,length);
		rec.setCharToDraw(charInput);
		rec.calArea(width,length);
		rec.calPerimeter(width,length);
		rec.displayRecInfo();
		rec.drawShape();
	

	}


}



class rectangle
{

	private int length=0;
	private int width=0;
	private int perimeter=0;
	private int area=0;
	private String charInput="";

	//Default constructor is set length and width to 0
	public rectangle(){
	
		this.length=0;
		this.width=0;
	}

	//Overloaed Constructor is set length and width as user's input when create an object
	public rectangle(int width,int length){
	
		this.length=length;
		this.width=width;
		
	}

	//This is to save the character from user's input to draw shape
	public void setCharToDraw(String charInput){

		this.charInput=charInput;
	}


	//This is to calculate the area of rectangle
	public void calArea(int length, int width){

		this.area=length*width;
	}

	//This is to return area of rectangle as an integer
	public int getArea(){

		return this.area;
	}

	//This is to calculate the perimeter of rectangle
	public void calPerimeter(int length, int width){

		this.perimeter=2*(length+width);
	}

	//This is to return the perimeter of rectangle as an integer
	public int getPerimeter(){

		return perimeter;
	}


	//This is to print out the information of perimeter and area of the rectangle
	public void displayRecInfo(){

		System.out.println("The perimeter of this rectangle is "+getPerimeter());
		System.out.println("The area of this rectangle is "+getArea());

	}

	//This method is to draw the shape of rectangle
	//The length is in horizontal direction
	//The width is in vertial direction
	public void drawShape(){

		for(int i=0;i<width;i++){

			for(int j=0;j<length;j++){

				System.out.print(charInput);
			}

			System.out.println();

		}

	}





}