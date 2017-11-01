import javax.swing.JFrame;
import java.awt.Button;

public class MyGUI 
{
	public static void main(String[] args)
	{
		// Create an object of type Button
		Button myButton = new Button();
		
		// Set the label for the button
		myButton.setLabel("I'm a button!");
		
		// Create an object of type frame
		JFrame myFrame = new JFrame();
		
		// Add the button on the frame
		myFrame.add(myButton);
		
		// Set the exit strategy for the frame
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Set the size for the frame
		myFrame.setSize(100, 60);
		
		// Show the frame
		myFrame.setVisible(true);
	}
}
