
public class Builder implements Marketeers {
	private boolean at_market;
	
	public Builder()
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
		System.out.println("The builder rides his bike to work.");
	}

	public void beginWork(boolean at_market)
	{
		if (at_market = true)
			System.out.println("The builder begins looking for materials to buy.");
		else
			System.out.println("The builder is not at the market");
	}
	}