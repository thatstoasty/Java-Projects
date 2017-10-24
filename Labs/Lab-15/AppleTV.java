import java.util.Scanner;

public class AppleTV extends WifiTV
{
	Scanner in = new Scanner(System.in);
	
	public AppleTV()
	{
		channel = 0;
		powered = false;
	}
	 
	public AppleTV(int ch)
	{
		channel = ch;
		powered = false;
	}

	public void connectAppStore()
	{
		System.out.println("Enter your appleID: ");
		String appleID = in.next();
		System.out.println(appleID + " is now connected to the App Store.");
	}

}
