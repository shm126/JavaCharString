/**
 * @(#)stringEqualGUI.java
 *
 *
 * @Shoueb Mamoor 
 * @version 1.00 2016/6/28
 */


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class stringEqualGUI extends JFrame 
{
	private JPanel panel;
    private JLabel messageLabel;
    private JLabel messageLabel2;
    private JTextField textField;
    private JTextField textField2;
    private JButton calcButton;
    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 130;

    public stringEqualGUI() 
    {
    	setTitle("Equal Strings?");
    	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    	buildPanel();
    	add(panel);
    	setVisible(true);
    }
    
    private void buildPanel()
    {
    	messageLabel=new JLabel("Enter a String");
    	textField = new JTextField(30);
    	messageLabel2=new JLabel("Enter a String");
    	textField2 = new JTextField(30);
    	calcButton = new JButton("Calculate");
    	
    	calcButton.addActionListener(new CalcButtonListener());
    	
    	panel=new JPanel();
    	panel.add(messageLabel);
    	panel.add(textField);
    	panel.add(messageLabel2);
    	panel.add(textField2);
    	panel.add(calcButton);
    }
    
    private class CalcButtonListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		String input, input2;
    		int result;
    		
    		input = textField.getText();
    		input2 = textField2.getText();
    		
    		result=input.compareToIgnoreCase(input2);
    		
    		if (result==0)
    		{
    			JOptionPane.showMessageDialog(null, "Inputted Strings Are Equal, Result: "+result);
    		}
    		
    		else if (result>0)
    		{
    			JOptionPane.showMessageDialog(null, "Inputted Strings Are Not Equal, Result: "+result);
    		}
    		
    		else if (result<0)
    		{
    			JOptionPane.showMessageDialog(null, "Inputted Strings Are Not Equal, Result: "+result);
    		}
    	}
    }
         public static void main(String[] args)
            {
                new stringEqualGUI();
            }
}