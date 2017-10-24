import java.util.InputMismatchException;
import java.util.Scanner;

public class TV extends Device
{
	protected int channel;
	Scanner in = new Scanner(System.in);
	
	public TV()
	{
		powered = false; 
		channel = 0;	
	}
	
	public TV(int ch)
	{
		channel = ch;
		powered = false;
	}
	
	public void changeChannel()
	{
		System.out.println("You are currently watching channel " + getChannel() + ".");
		try 
		{
			System.out.println("What channel would you like to put on?");
			channel = in.nextInt();
			System.out.println("You put on channel " + channel + ".");
		}
		catch (InputMismatchException exception)
		{
			System.out.println("ERROR: Channels can only be numbers.");
		}
		
	}
	
	public int getChannel()
	{
		return channel;
	}
	

}
