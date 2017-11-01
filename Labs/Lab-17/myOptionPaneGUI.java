import javax.swing.JOptionPane;

 

public class myOptionPaneGUI {

    public static void main(String[] args)

    {        

        String name= JOptionPane.showInputDialog("Enter your name");

        JOptionPane.showMessageDialog(null, "Hello, " + name + "!", "Greetings", JOptionPane.INFORMATION_MESSAGE);

 

        String birthYear = JOptionPane.showInputDialog("Enter birth year: ");

        int birth = Integer.parseInt(birthYear);

 

        int currentYear=2015;

        int currentAge= (currentYear-birth);

 

        if(currentAge >=18 && currentAge <24) 

        {

            JOptionPane.showMessageDialog(null, "You are in college!", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);

            int collegeYear= (currentAge-17);

            switch(collegeYear)

             {

             case 1:

                 JOptionPane.showMessageDialog(null, "You are a freshman! Welcome to college! Hope you're adjusting well!", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);

                 break;

             case 2:

                 JOptionPane.showMessageDialog(null, "You are are a sophomore! I hope you've been applying to internships!", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);

                 break;

             case 3:

                 JOptionPane.showMessageDialog(null, "You are a junior! I hope you're working on an Honors Thesis!", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);

                 break;

             case 4:

                 JOptionPane.showMessageDialog(null, "You are a senior! I hope you're graduating soon!", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);

                 break;

             case 5:

                 JOptionPane.showMessageDialog(null, "You are a super senior!", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);

             default:

                 JOptionPane.showMessageDialog(null, "Dude, get out of here!", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);

             }

        }

        else

             JOptionPane.showMessageDialog(null, "Pssh, you're not in college!", "Are You in College?", JOptionPane.INFORMATION_MESSAGE);  

    }

}//Done!