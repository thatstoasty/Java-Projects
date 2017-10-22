
public class Vender implements Marketeers {
	private boolean at_market;
	
	public Vender()
	{
		at_market = false;
	}
	
	public boolean market()
	{
		at_market = true;
	  	return at_market;
	}

	public void workTransportation()
	{
	     System.out.println("The vender rides his roller skates to work.");
	}

	public void beginWork(boolean at_market)
	{
		if (at_market = true)
			System.out.println("The vender begins selling their product.");
		else
			System.out.println("The vender is not at the market.");
	}
	}
