
package za.ac.tut.Lesson3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

public class GreetingAppBackend extends JFrame{
    private JPanel HeadingPnl;
    private JLabel HeadingLbl;
    
    private JPanel NamePnl;
    private JLabel NameLbl;
    private JTextField NameTxtFld;
    
    private JPanel SurnamePnl;
    private JLabel SurnameLbl;
    private JTextField SurnameTxtFld;
    
    private JPanel CombineName_And_Surname_Pnl;
    
    private JPanel GreetingsPnl;
    //private JLabel SurnameLbl;
    private JTextArea GreetingsTxtArea;
    
    private JPanel CombineTextArea_And_NameAndSurname_Pnl;
    private JPanel ButtonsPnl;
    private JButton GreetBttn;
    private JButton ClearBttn;
    private JButton ExitBttn;
    
    
    private JPanel MainPnl;
  public GreetingAppBackend(){
      setTitle("Greetings UI");
      setSize(700,750);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      HeadingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
      HeadingPnl.setBorder(new SoftBevelBorder(BevelBorder.RAISED));
      HeadingLbl = new JLabel("Greetings App");
      HeadingPnl.add(HeadingLbl);
      
      
      NamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT,10,1));
      NameLbl = new JLabel("Name: ");
      NameTxtFld = new JTextField(20);
      NamePnl.add(NameLbl);
      NamePnl.add(NameTxtFld);
      
      SurnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT,1,1));
      SurnameLbl = new JLabel("Surname: ");
      SurnameTxtFld = new JTextField(20);
      SurnamePnl.add(SurnameLbl);
      SurnamePnl.add(SurnameTxtFld);
      
      CombineName_And_Surname_Pnl = new JPanel(new GridLayout(2,1,1,1));
      CombineName_And_Surname_Pnl.add(NamePnl);
      CombineName_And_Surname_Pnl.add(SurnamePnl);
      
      GreetingsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
      GreetingsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Greetings"));
      GreetingsTxtArea = new JTextArea(40,50);
      GreetingsTxtArea.setText("Hello [name][surname]");
      GreetingsTxtArea.setEditable(false);
      GreetingsPnl.add(GreetingsTxtArea);
      
      ButtonsPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
      GreetBttn = new JButton("Greet ");
      ClearBttn = new JButton("Clear ");
      ExitBttn = new JButton("Exit ");
      
      ButtonsPnl.add(GreetBttn);
      ButtonsPnl.add(ClearBttn);
      ButtonsPnl.add(ExitBttn);

      MainPnl = new JPanel(new BorderLayout());
      
      MainPnl.add(CombineName_And_Surname_Pnl,BorderLayout.NORTH);
      MainPnl.add(GreetingsPnl,BorderLayout.CENTER);
      MainPnl.add(ButtonsPnl,BorderLayout.SOUTH);
      
      
      add(HeadingPnl,BorderLayout.NORTH);
      add(MainPnl,BorderLayout.CENTER);
     
      pack();
      setResizable(false);
      setVisible(true);
  }  
}
