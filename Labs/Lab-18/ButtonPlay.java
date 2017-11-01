import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonPlay {
	
    public static void main(String[] args)
    {
        //Creation of buttons
        JButton nameButton = new JButton("Find out the vender's name!");
        JButton ageButton = new JButton("Find out the vender's age!");
        JButton locationButton = new JButton("Find out about the vender's current location!");
        JButton hometownButton = new JButton("Find out the vender's current disposition!");
        JButton childrenButton = new JButton("Find out about the vender's favorite hobbies!");
        JButton singButton = new JButton("Find out the vender's favorite youtube channel through a reference!");

        //Creation and adjustment of frame
        JFrame myFrame = new JFrame();
        myFrame.setSize(450, 250);
        myFrame.setLayout(new FlowLayout());       

        //Addition of buttons onto frame
        myFrame.add(nameButton);
        myFrame.add(ageButton);
        myFrame.add(locationButton);
        myFrame.add(hometownButton);
        myFrame.add(childrenButton);
        myFrame.add(singButton);
        
        String name = "Saitama";
        
        class ButtonHandler implements ActionListener 
        {    
            public void actionPerformed(ActionEvent myEvent)
            {
                String buttonName= myEvent.getActionCommand();
                
                if (buttonName.contentEquals("Find out the vender's name!"))
                {
                    JOptionPane.showMessageDialog(null, "The vender's name is " + name + ".", "Vender name", JOptionPane.INFORMATION_MESSAGE);
                }
                
                if (buttonName.contentEquals("Find out about the vender's current location!"))
                {
                    JOptionPane.showMessageDialog(null, name + " lives in Ragnak, Sion.", "Vender Current Location", JOptionPane.INFORMATION_MESSAGE);
                }
               
                if (buttonName.contentEquals("Find out the vender's age!"))
                {
                    JOptionPane.showMessageDialog(null, name + " is 35 years old.", "Vender Age", JOptionPane.INFORMATION_MESSAGE);
                }             

                if (buttonName.contentEquals("Find out the vender's current disposition!"))
                {
                    JOptionPane.showMessageDialog(null, name + " is feeling hopeful.", "Vender Disposition", JOptionPane.INFORMATION_MESSAGE);
                }
              
                if (buttonName.contentEquals("Find out about the vender's favorite hobbies!"))
                {
                    JOptionPane.showMessageDialog(null, name + " loves to go hiking, play guitar, and to cook food.", "Vender's Hobbies", JOptionPane.INFORMATION_MESSAGE);
                }
                
                if (buttonName.contentEquals("Find out the vender's favorite youtube channel through a reference!"))
                {
                    JOptionPane.showMessageDialog(null, "Hey VSauce, \n" + name + " here.", "Vender's Favorite Youtube Channel", JOptionPane.INFORMATION_MESSAGE);
                }               
            }
        }
  
        //Assign handlers to button
        ButtonHandler handler = new ButtonHandler();
        nameButton.addActionListener(handler); 
        ageButton.addActionListener(handler);  
        locationButton.addActionListener(handler); 
        hometownButton.addActionListener(handler); 
        childrenButton.addActionListener(handler); 
        singButton.addActionListener(handler);        

        //Define exit strategy
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        

        //Set frame to being visible
        myFrame.setVisible(true);
    }
}

 



