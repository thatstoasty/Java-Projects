
public class Person 
{
	// Properties/attributes
	String name;
	private int age;
	private int numFriends;
	private int rewards = 100;
	
	// Constructor of this class
	Person()
	{
		numFriends = 10;
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
	
	public int changeRewards(int x)
	{
		rewards += x;
		return rewards;
	}
	
	public int getRewards()
	{
		return rewards;
	}
}
