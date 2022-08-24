/**                                                
 * Read the Object-Oriented concepts tutorial, and modify the Cat class so that setter and getter methods are implemented 
 * for all attributes. Also, modify the meow() and eat() methods so that they return String values. Write a program that creates 
 * two Cat objects. Set the values of their attributes and display the attribute information. Change the name and age of the first 
 * Cat object and display its attributes. Change the age and weight of the second Cat object, display its attributes, and invoke 
 * its meow() method.
 * @see java.lang.Object                           
 * @author Beverlyn Tsai               
 */   
public class Unit8Activity1
{
	public static void main(String [] args)		
	{

		//Cat 1 set basic attributes
		System.out.println("This is Cat 1 information:");
		Cat cat1= new Cat();
		cat1.setBreed("Persian");
		cat1.setAge(3);
		cat1.setWeight(8.2);
		cat1.setSex('F');
		cat1.setName("Mabu");
		cat1.displayCatInfo(1);

		//Change name and age
		System.out.println("After Cat 1 changed name and age, the following is Cat 1 information.");
		cat1.setAge(4);
		cat1.setName("Mary");
		cat1.displayCatInfo(1);


		System.out.println("This is Cat 2 information:");
		Cat cat2= new Cat();
		cat2.setBreed("British Shorthair");
		cat2.setAge(1);
		cat2.setWeight(7.5);
		cat2.setSex('M');
		cat2.setName("Inky");
		cat2.displayCatInfo(2);


		//Change age and weith and invoke meow()
		System.out.println("After Cat 2 changed age and weight, the following is Cat 2 information. It will also invoke meow().");
		cat2.setAge(2);
		cat2.setWeight(8.1);
		cat2.displayCatInfo(2);
		cat2.displayMeow();

	}
}



class Cat
{
	//Basic attributes
	private String breed;
	private int age;
	private double weight;
	private char sex;
	private String name;

	//Setter: set breed
	//Argument:String
	public void setBreed(String breed){
	
		this.breed=breed;

	}

	//Getter: get breed
	//return String
	public String getBreed(){

		return breed;
	}

	//Setter: set age
	//Argument:integer
	public void setAge(int age){

		this.age=age;
	}

	//Getter: get age
	//return integer
	public int getAge(){

		return age;
	}

	//Setter: set weight
	//Argument:double
	public void setWeight(double weight){

		this.weight=weight;
	}

	//Getter: get weight
	//return double
	public double getWeight(){

		return weight;
	}

	//Setter: set sex
	//Argument:char('F' as female, 'M' as male)
	public void setSex(char sex){

		this.sex=sex;
	}

	//Getter: get sex
	//return char('F' as female, 'M' as male)
	public char getSex(){

		return sex;
	}

	//Setter: set name
	//Argument:String
	public void setName(String name){

		this.name=name;
	}

	//Getter: get name
	//return String
	public String getName(){

		return name;
	}

	//This method is to display attributes information
	public void displayCatInfo(int number){

		System.out.println("Cat "+number+"'s breed is "+getBreed()+".");
		System.out.println("Cat "+number+"'s age is "+getAge()+".");
		System.out.println("Cat "+number+"s weight is "+getWeight()+" pounds.");
		if(Character.toUpperCase(getSex())=='F'){
			System.out.println("Cat "+number+"'s sex is female.");
		}else{
			System.out.println("Cat "+number+"'s sex is male.");
		}
		System.out.println("Cat "+number+"'s name is "+getName()+".");

	}


	//This method is to return String
	public String eat(){

		return "Munch, Munch, Munch";
	}

	//This method is to print the string returned by eat()
	public void displayEat(){

		System.out.println(eat());
	}

	//This method is to return String
	public String meow(){

		return "Meeeeeooww";
	}


	//This method is to print the string returned by meow()
	public void displayMeow(){

		System.out.println(meow());
	}

}