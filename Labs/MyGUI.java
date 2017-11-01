import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JTextField;

public class MyGUI 
{
	public static JTextField monthsInput;
	public static JTextField hoursInput;
	
	public static void main(String[] args)
	{
		// Create the frame and set its layout (3 rows, 2 columns)
		JFrame myFrame = new JFrame();
		myFrame.setLayout(new GridLayout(3,2));
		
		// Instantiate a text field and button object for the first row
		monthsInput = new JTextField();
		monthsInput.setColumns(5);
		myFrame.add(monthsInput);
		JButton salariedButton = new JButton("Calculate salary");
		myFrame.add(salariedButton);
		
		// Instantiate a text field and button object for the second row
		hoursInput = new JTextField();
		hoursInput.setColumns(5);
		myFrame.add(hoursInput);
		JButton hourlyButton = new JButton("Calculate wage");
		myFrame.add(hourlyButton);
		
		// Create a button object for the third row
		JButton salaryBonusButton = new JButton("Calculate salaried bonus");
		myFrame.add(salaryBonusButton);
		
		// The fourth row with a button
		JButton hourlyBonusButton = new JButton("Calculate hourly bonus");
		myFrame.add(hourlyBonusButton);
		
		// Assign handlers to the buttons
		ButtonHandler handler = new ButtonHandler();
		salariedButton.addActionListener(handler);
		hourlyButton.addActionListener(handler);
		salaryBonusButton.addActionListener(handler);
		hourlyBonusButton.addActionListener(handler);
		
		// Exit Strategy and Set the frame to be visible
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setSize(400,175);
		myFrame.setVisible(true);
	}
}
