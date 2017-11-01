import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.io.FileNotFoundException;

public class ButtonHandler implements ActionListener
{
	public void actionPerformed(ActionEvent myEvent)
	{
		String buttonName = myEvent.getActionCommand();
		SalariedEmployee se = new SalariedEmployee();
		HourlyEmployee he = new HourlyEmployee();
		
		if (buttonName.contentEquals("Calculate salary"))
		{
			float payment = (float)0.0;
			
			// Read value from the textbox with the salaried employee
			String monthsText = MyGUI.monthsInput.getText(); // It'll be a string
			int months = Integer.parseInt(monthsText); // Convert the string to an integer
			
			// Try asking salaried employee's calculateSalary()
			try
			{
				payment = se.calculateSalary(months);
			}
			catch (FileNotFoundException ex)
			{	
			}
			JOptionPane.showMessageDialog(null, payment, "Salaried employee payment", JOptionPane.INFORMATION_MESSAGE);
		}
		if (buttonName.contentEquals("Calculate wage"))
		{
			float payment = (float)0.0;
			
			// Read value from the textbox with the salaried employee
			String hoursText = MyGUI.hoursInput.getText(); // It'll be a string
			int hours = Integer.parseInt(hoursText); // Convert the string to an integer
			
			// Try asking salaried employee's calculateSalary()
			try
			{
				payment = he.calculateSalary(hours);
			}
			catch (FileNotFoundException ex)
			{	
			}
			JOptionPane.showMessageDialog(null, payment, "Hourly employee payment", JOptionPane.INFORMATION_MESSAGE);
		}
		
		if (buttonName.contentEquals("Calculate salaried bonus"))
		{
			float bonus = (float)0.0;
			
			try
			{
				bonus = se.calculateBonus();
				System.out.println("Salaried employees take home an extra $" + (int)bonus + " from their bonus.");
			}
			catch (FileNotFoundException ex)
			{
			}
		}
		
		if (buttonName.contentEquals("Calculate hourly bonus"))
		{
			float bonus = (float)0.0;
			
			try
			{
				bonus = he.calculateBonus();
				System.out.println("Hourly employees take home an extra $" + (int)bonus + " from their bonus.");
			}
			catch (FileNotFoundException ex)
			{
			}
		}
		
	}
}
