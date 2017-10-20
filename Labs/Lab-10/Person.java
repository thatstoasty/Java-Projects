import java.util.Random;
import java.util.Scanner;

/*
 Extend your ‘Person’ class so that it has a function to assign network ID and get
network ID, just like what we did with network name. [5 points]

Similar to how we initialized number of rewards to a random number, initialize number
of friends to another random number that is between 0 and 10. [5 points]

Make sure you make appropriate calls from your main class to demonstrate creating
these objects, and using their corresponding functions.

Copy-paste three Java source files.
 */


public class Person 
{
	Random rn = new Random();
	Scanner in = new Scanner(System.in);
	
	// Properties/attributes
	String name;
	private int age;
	private int numFriends;
	private int rewards;
	Network net = new Network();
	
	// Constructor of this class
	Person()
	{
		numFriends = 10;
	    rewards = rn.nextInt(11);
	}
	
	// Functions
	public void setAge(int n)
	{
		age = n;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setFriends(int n)
	{
		numFriends = n;
	}
	
	public int getFriends()
	{
		return numFriends;
	}
	
	public void changeRewards()
	{
		System.out.print("Enter change in reward points: ");
		rewards += in.nextInt();
	}
	
	public int getRewards()
	{
		return rewards;
	}
	
	public void setnetworkID()
	{
		net.setnetworkID();
	}
	
	public int getnetworkID()
	{
		return net.getnetworkID();
	}
}
