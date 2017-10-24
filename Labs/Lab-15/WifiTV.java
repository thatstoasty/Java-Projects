
public class WifiTV extends TV{

	public WifiTV()
	{
		powered = false;
		channel = 0;	
	}
	
	public WifiTV(int ch)
	{
		powered = false;
		channel = ch;
	}

	public void connectWifi()
	{
		if (powered == true)
			System.out.println("You connect the TV to the Wifi.");
		else
			System.out.println("The TV must be turned on to be able to connect to the Wifi.");
	}

}
