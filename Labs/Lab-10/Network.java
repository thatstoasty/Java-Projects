import java.util.Scanner;

public class Network {
	private int networkID;
	Scanner in = new Scanner(System.in);
	
	public void setnetworkID()
	{
		System.out.println("Enter Network ID: ");
		networkID = in.nextInt();
	}
	
	public int getnetworkID()
	{
		return networkID;
	}

}
