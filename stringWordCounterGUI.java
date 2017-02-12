/**
 * @(#)stringWordCounterGUI.java
 *
 *
 * @Shoueb Mamoor 
 * @version 1.00 2016/6/29
 */


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class stringWordCounterGUI extends JFrame 
{
	private JPanel panel;
    private JLabel messageLabel;
    private JTextField textField;
    private JButton calcButton;
    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 130;

    public stringWordCounterGUI() 
    {
    	setTitle("Word Count");
    	setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    	buildPanel();
    	add(panel);
    	setVisible(true);
    }
    
    private void buildPanel()
    {
    	messageLabel=new JLabel("Enter a String, End it With Proper Punctuation");
    	textField = new JTextField(30);
    	calcButton = new JButton("Count");
    	
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
    		int result, counter=0, mark;
    		
    		input = textField.getText();
    		
    		for(int x = 0; x  <= input.length() -1; x++)
            {
            	if(input.charAt(x) == ' ')
                {
        	        counter++;
                }
            }
    		
    		JOptionPane.showMessageDialog(null, "Words Counted: "+(counter+1));
    		
    	}
    }
         public static void main(String[] args)
            {
                new stringWordCounterGUI();
            }
}