
public class Device 
{
	protected boolean powered;
	
	public Device()
	{
		powered = false;
	}
	
	public void turnOnDevice()
	{
		if (powered == false) 
		{
			powered = true;
			System.out.println("You turn on the device.");
		}
		else
			System.out.println("The device is already on.");
	}

	public boolean getPowered()
	{
		return powered;
	}
	
	public void turnOffDevice()
	{
		if (powered = true)
		{
			powered = false;
			System.out.println("You turn off the device.");
		}
		
		else
			System.out.println("The device is already off.");
	}
}
