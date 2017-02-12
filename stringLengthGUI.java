/**
 * @(#)stringLengthGUI.java
 *
 *
 * @Shoueb Mamoor
 * @version 1.00 2016/4/28
 */


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class stringLengthGUI extends JFrame 
{
	private JPanel panel;
    private JLabel messageLabel;
    private JTextField textField;
    private JButton calcButton;
    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 130;

    public stringLengthGUI() 
    {
    	setTitle("String Length");
    	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    	buildPanel();
    	add(panel);
    	setVisible(true);
    }
    
    private void buildPanel()
    {
    	messageLabel=new JLabel("Enter a String");
    	textField = new JTextField(30);
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
    		int result;
    		
    		input = textField.getText();
    		
    		result = input.length();
    		
    		JOptionPane.showMessageDialog(null, "String Length: "+result);
    		
    	}
    }
         public static void main(String[] args)
            {
                new stringLengthGUI();
            }
}