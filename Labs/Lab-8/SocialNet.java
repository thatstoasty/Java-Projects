
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
		
		//print information
		System.out.println(p1.name + " is " + p1.getAge() + " years old. He has " + p1.getFriends() + " friends. He has " + p1.getRewards() + " points.");
		System.out.println(p2.name + " is " + p2.getAge() + " years old. She has " + p2.getFriends() + " friends. She has " + p2.getRewards() + " points.");
		
	
	}
}
