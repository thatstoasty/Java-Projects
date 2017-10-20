/*
 Extend your ‘Person’ class so that it has a function to assign network ID and get
network ID, just like what we did with network name. [5 points]

Similar to how we initialized number of rewards to a random number, initialize number
of friends to another random number that is between 0 and 10. [5 points]

Make sure you make appropriate calls from your main class to demonstrate creating
these objects, and using their corresponding functions.

Copy-paste three Java source files.
 */


public class SocialNet 
{
	public static void main(String[] args)
	{
		//initialize person objects
		Person p1 = new Person();
		Person p2 = new Person();
		
		//set name and age for person objects
		p1.name = "John Doe";
		p1.setAge(20); // p1.age = 20;
		p2.name = "Jane Doe";
		p2.setAge(19);
		
		//set friends for person objects
		p1.setFriends(10);
		p2.setFriends(10);
		
		//change Rewards amount for person objects
		p1.changeRewards(10);
		p2.changeRewards(-10);
		
		//change network ID for person objects
		p1.setnetworkID(1234);
		p2.setnetworkID(5678);
		
		//print information
		System.out.println(p1.name + " is " + p1.getAge() + " years old. He has " + p1.getFriends() + " friends. He has " + p1.getRewards() + " points. His network ID is: " + p1.getnetworkID());
		System.out.println(p2.name + " is " + p2.getAge() + " years old. She has " + p2.getFriends() + " friends. She has " + p2.getRewards() + " points. Her network ID is: " + p2.getnetworkID());
		
	
	}
}
