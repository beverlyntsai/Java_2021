/**                                                
 * 
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   

import java.util.Random;
public class Unit5Activity1
{
	public static void main(String [] args)		
	{
		Random random;

        
        for(int i=0;i<5;i++){
		Random rnd = new Random(40);
           	System.out.println(rnd.nextInt(6));
		System.out.println(rnd.nextInt(10));
		System.out.println(rnd.nextInt(14));
		System.out.println(rnd.nextInt(18));
		System.out.println(rnd.nextInt(22));
		System.out.println("**********************");
        }


/*
		for(int i=0;i<25;i++){

			random=new Random(6);
			double num1 = random.nextDouble();
			System.out.println("Random(6) is "+num1);
			random=new Random(10);
			int num = random.nextInt();
			System.out.println("Random(10) is "+num);
			random=new Random(14);
			num = random.nextInt();
			System.out.println("Random(14) is "+num);
			random=new Random(18);
			num = random.nextInt();
			System.out.println("Random(18) is "+num);
			random=new Random(22);
			num = random.nextInt();
			System.out.println("Random(22) is "+num);
		}//for
*/


	}
}