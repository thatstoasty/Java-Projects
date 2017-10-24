import java.util.Scanner;

public class GoogleTV extends WifiTV 
{
	Scanner in = new Scanner(System.in);
	
	public GoogleTV()
	{
		channel = 0;
		powered = false;
	}
	 
	public GoogleTV(int ch)
	{
		channel = ch;
		powered = false;
	}
	
	public void rentMovie()
	{
		System.out.println("Enter the name of the movie you would like to rent: ");
		String movieName = in.nextLine();
		System.out.println("You have rented " + movieName +".");
	}
	

}
