import java.io.FileNotFoundException;

public class PayrollTest
{
	public static void main(String[] args) throws FileNotFoundException
	{
		SalariedEmployee s1 = new SalariedEmployee();
		HourlyEmployee h1 = new HourlyEmployee();
		
		float payment;
		float extra;
		int mo_worked = 10;
		int hr_worked = 25;
		
		//Salaried
		payment = s1.calculateSalary(mo_worked); //avoid "magic numbers" pass in a variable 
		System.out.println("After " + mo_worked + " months, the employee makes: $" + payment);
		extra = s1.calculateBonus();
		System.out.println("The employee takes home an extra $" + extra + " after the bonus.");
		
		//Hourly
		payment = h1.calculateSalary(hr_worked);
		System.out.println("After " + hr_worked + " hours, the employee makes: $" + payment);
		extra = h1.calculateBonus();
		System.out.println("The employee takes home an extra $" + extra + " after the bonus.");
	}
}
