/*
 In the previous lab you assigned a person’s network ID inside the program itself. Now,
read that value from the command line. [5 points]

Similarly, change a person’s reward points from the command line. [5 points]

When your program runs, it should ask for a person’s network ID, then it should ask
how many reward points for that person should be changed. After reading each of
these values, call appropriate functions as usual (setNetworkID and changeRewards),
and print them back on the console.

Submit just your main class file.
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
		p1.changeRewards();
		p2.changeRewards();
		
		//change network ID for person objects
		p1.setnetworkID();
		p2.setnetworkID();
		
		//print information
		System.out.println(p1.name + " is " + p1.getAge() + " years old. He has " + p1.getFriends() + " friends. He has " + p1.getRewards() + " points. His network ID is: " + p1.getnetworkID());
		System.out.println(p2.name + " is " + p2.getAge() + " years old. She has " + p2.getFriends() + " friends. She has " + p2.getRewards() + " points. Her network ID is: " + p2.getnetworkID());
		
	
	}
}
