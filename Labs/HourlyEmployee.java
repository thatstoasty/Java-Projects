import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HourlyEmployee extends Employee
{
	public float calculateSalary(int hours) throws FileNotFoundException
	{
		File salaryRecords = new File("hourly.txt");
		Scanner in = new Scanner(salaryRecords);
		
		salary = in.nextFloat()*hours;
		in.close();
		return salary;
	}
	
	public float calculateBonus() throws FileNotFoundException
	{
		File salaryRecords = new File("hourly.txt");
		Scanner in = new Scanner(salaryRecords);
		
		bonus = in.nextFloat()*10;
		in.close();
		return bonus;
	}
}