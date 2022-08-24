/**                                                
 * This program is to prompt the user to enter an angle, in degrees, and then 
 * display the angle in degrees, in radians,  and the Sine, Cosine, and Tangent of the angle
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   


import java.util.Scanner;
public class Unit5Activity1_2
{
	public static void main(String [] args)		
	{
		double angleDegree=0, angleRadians=0, angleSine=0, angleCosine=0, angleTangent=0;


		System.out.print("Please enter an angle in degrees: ");
		Scanner input=new Scanner(System.in);
		angleDegree=input.nextDouble();
		System.out.println("The angle you input in degrees is "+angleDegree);


		angleRadians=Math.toRadians(angleDegree);
		System.out.println("The angle you input in radians is "+Math.floor(angleRadians*1000+0.5)/1000);

		angleSine=Math.sin(angleRadians);
		angleSine=Math.floor(angleSine*1000+0.5)/1000;
		System.out.println("Sine of angle is "+angleSine);

		angleCosine=Math.cos(angleRadians);
		angleCosine=Math.floor(angleCosine*1000+0.5)/1000;
		System.out.println("Cosine of angle is "+angleCosine);

		angleTangent=Math.tan(angleRadians);
		angleTangent=Math.floor(angleTangent*1000+0.5)/1000;
		System.out.println("Tangent of angle is "+angleTangent);

	}//main
}