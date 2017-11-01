/*
 College students are between 18-22 typically, we would like to identify these students.
 
 declare birth year as int
 declare current year as int
 
 declare age as difference of current year and birth year 
 
 if age >= 18
 	if age == 22
 		print "The student is a senior."
 	if age == 21 
 		print "The student is a junior."
 	if age == 20
 		print "The student is a sophomore."
 	if age == 18 || age == 19
 		print "The student is a freshman."
 else
 	"The student is most likely, not in a four year college."
 */
import javax.swing.JOptionPane;

public class GUICollegeYear 
{
	 public static void main(String[] args) throws NumberFormatException
	 	{        
		 	String name= JOptionPane.showInputDialog("Enter your name");
	        JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Greetings", JOptionPane.INFORMATION_MESSAGE);
	        
	        String birthYear = JOptionPane.showInputDialog("Enter birth year: ");

	        int birth = Integer.parseInt(birthYear);
	        int currentYear = 2017;
	        int currentAge = (currentYear-birth);

	        if(currentAge >= 18 && currentAge < 24) 
	        {
	            JOptionPane.showMessageDialog(null, "You are in college!", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);
	            int collegeYear= (currentAge-17);
	            switch(collegeYear)
	            {
	            	case 1:
	            		JOptionPane.showMessageDialog(null, "You are a Freshman.", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);
	            		break;

	            	case 2:
	            		JOptionPane.showMessageDialog(null, "You are a sophomore.", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);
	            		break;

	            	case 3:
	            		JOptionPane.showMessageDialog(null, "You are a junior.", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);
	            		break;

	            	case 4:
	            		JOptionPane.showMessageDialog(null, "You are a senior.", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);
	            		break;

	            	case 5:
	            		JOptionPane.showMessageDialog(null, "You are a super senior.", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);

	            	default:
	            		JOptionPane.showMessageDialog(null, "You're older than the average college student.", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);
	             }
	        }
	        
	        else

	        	JOptionPane.showMessageDialog(null, "You aren't in college.", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);  
	    }
	}