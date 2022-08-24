/**                                                
 * Unit10Lab3.java
 * Modify the program in the Publish Subscribe design pattern tutorial so that three subscriber objects 
 * are notified of changes when the count variable is three or greater. Each subscriber object should 
 * display a customized message that reads Subscriber x has been notified, where x will be 1, 2, or 3.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */ 



/**  
 * 
*/ 
import java.util.Scanner;
public class Unit10Lab3
{
   public static void main(String[] args)
   {

	//Create Publisher & Subscriber objects
	//A subscriber class array is created and the number is 3
	MySubscriber[] subscriberList=new MySubscriber[3];

	//subscriber object is created
	subscriberList[0]=new MySubscriber();
	subscriberList[1]=new MySubscriber();
	subscriberList[2]=new MySubscriber();

	MyPublisher aPublisher=new MyPublisher(3);

	//Register 3 Subscribers
	aPublisher.register(subscriberList[0]);
	aPublisher.register(subscriberList[1]);
	aPublisher.register(subscriberList[2]);

	//Increment Publisher Object 4 times to cause subscriber 1 state changes
	aPublisher.increment(0);
	aPublisher.increment(0);
	aPublisher.increment(0);
	aPublisher.increment(0);

	//Increment Publisher Object 5 times to cause subscriber 2 state changes
	aPublisher.increment(1);
	aPublisher.increment(1);
	aPublisher.increment(1);
	aPublisher.increment(1);
	aPublisher.increment(1);

	//Increment Publisher Object 6 timesto cause subscriber 3 state changes
	aPublisher.increment(2);
	aPublisher.increment(2);
	aPublisher.increment(2);
	aPublisher.increment(2);
	aPublisher.increment(2);
	aPublisher.increment(2);

   }
 
} 



/**  
 *  Publisher class
*/ 

class Publisher
{
	private Subscriber[] subscriberList;
	private int maximumSubscribers;
	private int nextIndex;


	//constructor
	public Publisher(int max){

		//Initialize attributes & create subscriber array
		maximumSubscribers=max;
		subscriberList=new Subscriber[maximumSubscribers];
		nextIndex=0;
	}

	//This method is to register subscriver
	public void register(Subscriber s){

		//Register a subscriber unless the subscriber array is full
		if(nextIndex < maximumSubscribers)
			subscriberList[nextIndex++]=s;
		else
			System.out.println("ERROR: Subscriber List is full");

	}

	//notifySubscribers has a argument integer to pass to updae method to print out exact subscriber
	public void notifySubscribers(int SubscriberIndex){

		subscriberList[SubscriberIndex].update(SubscriberIndex+1);


	}

	



}




/**  
 *  Subscriber class
*/ 
class Subscriber
{
	//a integer argument is add
	public void update(int index){
		
	}


}



/**  
 *  MyPublisher
*/ 
class MyPublisher extends Publisher
{
	//count is an array is to record each subscriber's increment count number
	private int[] count=new int[3];


	//constructor
	public MyPublisher(int mx){

		super(mx);
		for(int i=0;i<3;i++){
			count[i]=0;
		}
		
	}

	//increment method has an integer argument to record which subscriber is increment
	public void increment(int SubscriberIndex){

		count[SubscriberIndex]++;

		//Notify subscribers if count >=3
		if(count[SubscriberIndex]>=3)
			notifySubscribers(SubscriberIndex);
	}


}



/**  
 *  MySubscriber
*/ 
class MySubscriber extends Subscriber
{
	
	//update method has integer argument so it can print out which subscriber has been notified.
	public void update(int index){

		System.out.printf("Subscriber %d has been notified.\n", index);
	}

}


