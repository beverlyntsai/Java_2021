/**                                                
 * 
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   

import java.util.Random;
public class Unit5Activity1_4
{
	public static void main(String [] args)		
	{
		long seed=100; //I fixed see as 100 to test
 		int arr[] =  {6,10,14,18,22};
 		int num[] =  {0,0,0,0,0};
       		Random random = new Random(seed);

		//Record the occurrence of each number
      	 	 for(int i=0;i<100;i++){
			//There are five number in the set {6,10,14,18,22}, so I use nextInt(5) to get index to access the array
			int index=random.nextInt(5);
			num[index]++;
           		System.out.print(arr[index]+"  ");
      	 	 }

		System.out.println("");

		//Display the distribution of the occurrence of each number from {6,10,14,18,22}
      	 	 for(int i=0;i<5;i++){
			System.out.println(arr[i]+"'s occurrence="+num[i]);
      	 	 }


	}
}