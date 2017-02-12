/**
 * @(#)LetterOrDigitGUI.java
 *
 *
 * @Shoueb Mamoor
 * @version 1.00 2016/6/27
 */


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class letterOrDigitGUI extends JFrame 
{
	private JPanel panel;
    private JLabel messageLabel;
    private JTextField textField;
    private JButton calcButton;
    private JRadioButton upperButton;
    private JRadioButton lowerButton;
    private final int WINDOW_WIDTH = 550;
    private final int WINDOW_HEIGHT = 100;

    public letterOrDigitGUI() 
    {
    	setTitle("Letter or Digit");
    	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    	buildPanel();
    	add(panel);
    	setVisible(true);
    }
    
    private void buildPanel()
    {
    	messageLabel=new JLabel("Enter a Single Character, Either a Letter or Number");
    	textField = new JTextField(1);
    	calcButton = new JButton("Calculate");
    	
    	calcButton.addActionListener(new CalcButtonListener());
    	
    	panel=new JPanel();
    	panel.add(messageLabel);
    	panel.add(textField);
		panel.add(calcButton);
    }
    
    private class CalcButtonListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		String input;
    		
    		char charInput;
    		
    		input = textField.getText();
    		charInput= input.charAt(0);
    	
    		if (Character.isLetter(charInput)==true)
    		{
    			JOptionPane.showMessageDialog(null, "Inputted Character '"+ charInput +"' is a Letter.");
    		}
    		
    		else
    		{
    			JOptionPane.showMessageDialog(null, "Inputted Character '"+ charInput +"' is a Digit.");
    		}
    		
    	}
    }
    
         public static void main(String[] args)
            {
                new letterOrDigitGUI();
            }
}