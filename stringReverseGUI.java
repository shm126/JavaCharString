/**
 * @(#)stringReverseGUI.java
 *
 *
 * @Shoueb Mamoor 
 * @version 1.00 2016/6/29
 */


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class stringReverseGUI extends JFrame 
{
	private JPanel panel;
    private JLabel messageLabel;
    private JTextField textField;
    private JButton calcButton;
    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 130;

    public stringReverseGUI() 
    {
    	setTitle("Reverse String");
    	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    	buildPanel();
    	add(panel);
    	setVisible(true);
    }
    
    private void buildPanel()
    {
    	messageLabel=new JLabel("Enter a String");
    	textField = new JTextField(30);
    	calcButton = new JButton("Reverse");
    	
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
    		String input, result;
    		
    		input = textField.getText();
    		
    		result = new StringBuilder(input).reverse().toString();
    		
    		JOptionPane.showMessageDialog(null, "Reversed String: "+result);
    		
    	}
    }
         public static void main(String[] args)
            {
                new stringReverseGUI();
            }
}