
public class CommandLine {

    public static void main(String[] args)
    {
    	try
    	{
    		// Declaration of variables
            int currentYear = 2017;
            String bYear = args[0];
            int birthYear = Integer.parseInt(bYear);
            
            //Computation
            int currentAge= currentYear - birthYear;
            
            //Output
            if (currentAge >=21)
                System.out.println("You're old enough to drink, grab a beer buddy.");
            else
                System.out.println("You're not old enough to drink, but still, grab a beer bud.");
    	}
    	catch (NumberFormatException exception) //For situations where the user input is not a series of numbers
    	{
    		System.out.println("Input does not have the correct format.");
    	}
        
    }
}