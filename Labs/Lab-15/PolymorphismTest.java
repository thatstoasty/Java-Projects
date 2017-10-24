import java.util.Scanner;
public class PolymorphismTest {

	public static void main(String[] args) {
		WifiTV wtv = new WifiTV();
		GoogleTV gtv = new GoogleTV();
		AppleTV atv = new AppleTV();
		String a = "A";
		String b = "B";
		String c = "C";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("What device will you be watching with? Type A for WifiTV, B for GoogleTV, or C for AppleTV: ");
		String option = in.nextLine().toUpperCase();
		
		//For this exercise, I only set the "connect to wifi" method to require the device being on. In reality, the device would need to be powered on to run any of these methods.
		if (option.equals(a))
		{
			//WifiTV method testing
			System.out.println("Powered on?: " + wtv.getPowered());
			wtv.turnOnDevice();
			System.out.println("Powered on?: " + wtv.getPowered());
			wtv.turnOffDevice();
			System.out.println("Powered on?: " + wtv.getPowered());
			wtv.turnOnDevice();
			
			System.out.printf("\n");
			
			wtv.connectWifi();
			
			System.out.printf("\n");

			wtv.changeChannel();
			
			System.out.printf("\n");
		}
		
		else if (option.equals(b))
		{
			//GoogleTV method testing
			System.out.println("Powered on?: " + gtv.getPowered());
			gtv.turnOnDevice();
			System.out.println("Powered on?: " + gtv.getPowered());
			gtv.turnOffDevice();
			System.out.println("Powered on?: " + gtv.getPowered());
			gtv.turnOnDevice();
			
			System.out.printf("\n");
			
			gtv.connectWifi();
			
			System.out.printf("\n");
			
			gtv.changeChannel();
			
			System.out.printf("\n");
			
			gtv.rentMovie();
		}

		else if (option.equals(c))
		{
			//AppleTV method testing
			System.out.println("Powered on?: " + gtv.getPowered());
			atv.turnOnDevice();
			System.out.println("Powered on?: " + gtv.getPowered());
			atv.turnOffDevice();
			System.out.println("Powered on?: " + gtv.getPowered());
			atv.turnOnDevice();
			
			System.out.printf("\n");
			
			atv.connectWifi();
			
			System.out.printf("\n");
			
			atv.changeChannel();
			
			System.out.printf("\n");
			
			atv.connectAppStore();
		}
		
		else
			System.out.println("Only A, B, or C are acceptable inputs.");
		in.close();

	}

}
