import java.util.Scanner;

public class Blacksmith implements Villagers{

	//instance variables
	private String address;
	private String name;
	private int resources;
	private static int metal_value = 100; //$100/lbs.
	
	Scanner in = new Scanner(System.in);
	
	//Define methods to set and return the properties of the objects we create. These methods implement the abstract methods in the interface
	public void setName()
	{
		System.out.println("Enter the blacksmith's name: ");
		name = in.nextLine();
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAddress()
	{
		System.out.print("Enter the blacksmith's address: ");
		address = in.nextLine();
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setResources()
	{
		System.out.println("Enter how many lbs. of metal the blacksmith has: ");
		resources = in.nextInt();
	}
	
	public int getResources()
	{
		return resources;
	}
	
	public double getResourceValue()
	{ 
		double monies = resources * metal_value;
		return monies;
	}
}



