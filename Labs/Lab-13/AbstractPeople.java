import java.util.InputMismatchException;

public class AbstractPeople {

	public static void main(String[] args) {
		//Instantiate objects of the civilian classes
		Farmer f = new Farmer();
		Blacksmith b = new Blacksmith();
		
		//set the name of the blacksmith and farmer objects and return those values
		f.setName();
		String f_name = f.getName();
		b.setName();
		String b_name = b.getName();
		
		System.out.println("The farmer's name is " + f_name);
		System.out.println("The blacksmith's name is " + b_name);
		System.out.printf("\n");
		
		//set the address of the blacksmith and the farmer objects and return those values
		f.setAddress();
		String f_address = f.getAddress();
		b.setAddress();
		String b_address = b.getAddress();
		
		System.out.println("The farmer's address is: " + f_address);
		System.out.println("The blacksmith's address is: " + b_address);
		System.out.println("\n");
		
		//set the resource amounts for the blacksmith and the farmer. Return those values and also the calculated dollar value of the resources
		//the program will check for an integer input, if the value is not an integer an input mismatch exception is thrown.
		try
		{
		f.setResources();
		int f_resources = f.getResources();
		double f_resourceValue = f.getResourceValue();
		b.setResources();
		int b_resources = b.getResources();
		double b_resourceValue = b.getResourceValue();
		
		System.out.println("The farmer has " + f_resources + " lbs. of corn. And that is worth " + f_resourceValue + " dollars.");
		System.out.println("The blacksmith has " + b_resources + " lbs. of metal. And that is worth " + b_resourceValue + " dollars.");
		System.out.println("\n");
		}
		
		catch (InputMismatchException exception)
		{
			System.out.println("ERROR: The weight input is not a numerical value.");
		}
	
	}
}
