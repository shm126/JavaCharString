/**
 * @(#)stringUpperOrLower.java
 *
 *
 * @Shoueb Mamoor
 * @version 1.00 2016/6/29
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class stringUpperOrLowerGUI extends JFrame 
{
	private JPanel panel;
    private JLabel messageLabel;
    private JTextField textField;
    private JButton upperButton;
    private JButton lowerButton;
    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 130;

    public stringUpperOrLowerGUI() 
    {
    	setTitle("Lower or Upper");
    	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    	buildPanel();
    	add(panel);
    	setVisible(true);
    }
    
    private void buildPanel()
    {
    	messageLabel=new JLabel("Enter a String");
    	textField = new JTextField(30);
    	upperButton = new JButton("Upper Case");
    	lowerButton = new JButton("Lower Case");
    	
    	upperButton.addActionListener(new UpperButtonListener());
    	lowerButton.addActionListener(new LowerButtonListener());
    	
    	panel=new JPanel();
    	panel.add(messageLabel);
    	panel.add(textField);
    	panel.add(upperButton);
    	panel.add(lowerButton);
    }
    
    private class UpperButtonListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		String input, upperInput;
    		input = textField.getText();
    		
    		upperInput = input.toUpperCase();
    		
    		JOptionPane.showMessageDialog(null, "String in Upper Case Format: "+upperInput);
    		
    	}
    }
    
    private class LowerButtonListener implements ActionListener
    {
    	public void actionPerformed(ActionEvent e)
    	{
    		String input, lowerInput;
    		input = textField.getText();
    		
    		lowerInput = input.toLowerCase();
    		
    		JOptionPane.showMessageDialog(null, "String in Lower Case Format: "+lowerInput);
    		
    	}
    }
    
    public static void main(String[] args)
    {
    	new stringUpperOrLowerGUI();
    }

}