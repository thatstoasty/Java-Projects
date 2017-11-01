import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SalariedEmployee extends Employee
{
	public float calculateSalary(int months) throws FileNotFoundException
	{
		File salaryRecords = new File("salary.txt");
		Scanner in = new Scanner(salaryRecords);
		
		salary = in.nextFloat()*months;	
		in.close();
		return salary;
	}
	
	public float calculateBonus() throws FileNotFoundException
	{
		File salaryRecords = new File("salary.txt");
		Scanner in = new Scanner(salaryRecords);
		
		salary = in.nextFloat();
		in.close();
		return salary * (float)0.1;
	}
	
	
}
